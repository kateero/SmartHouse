package SmartHouse;

import EngineeringSystems.EngineeringSystem;
import Sensors.Sensor;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LogExcel {
    private final String FILE_NAME = "smart_house_log.xlsx";
    private XSSFWorkbook workbook;
    private ArrayList<String> systemSheetNames;
    private CellStyle redStyle;

    public LogExcel() {
        this.workbook = new XSSFWorkbook();
        this.systemSheetNames = new ArrayList<>();
        createRedStyle();
    }

    public void createExcel(SmartHouse smartHouse) {
        try {
            ArrayList<EngineeringSystem> systems = smartHouse.getSystems();
            for (int i = 0; i < systems.size(); i++) {
                EngineeringSystem system = systems.get(i);
                String sheetName = system.getName() + " (" + (i + 1) + ")";
                XSSFSheet sheet = workbook.createSheet(sheetName);
                systemSheetNames.add(sheetName);
                
                Row headerRow = sheet.createRow(0);
                headerRow.createCell(0).setCellValue("Время регистрации");
                
                ArrayList<Sensor> sensors = system.getSensors();
                for (int j = 0; j < sensors.size(); j++) {
                    headerRow.createCell(j + 1).setCellValue(sensors.get(j).getName());
                }
                
                for (int j = 0; j <= sensors.size(); j++) {
                    sheet.setColumnWidth(j, 20 * 256);
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream(FILE_NAME)) {
                workbook.write(outputStream);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, 
                "Ошибка при создании Excel файла: " + e.getMessage(), 
                "Ошибка создания", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    public void writeLog(SmartHouse smartHouse) {
        try {
            File file = new File(FILE_NAME);
            
            try (FileInputStream inputStream = new FileInputStream(file)) {
                workbook = new XSSFWorkbook(inputStream);
                createRedStyle();
            }

            String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            ArrayList<EngineeringSystem> systems = smartHouse.getSystems();
            for (int i = 0; i < systems.size(); i++) {
                EngineeringSystem system = systems.get(i);
                if (i < systemSheetNames.size()) {
                    String sheetName = systemSheetNames.get(i);
                    XSSFSheet sheet = workbook.getSheet(sheetName);
                    
                    if (sheet != null) {
                        int lastRowNum = sheet.getLastRowNum();
                        Row newRow = sheet.createRow(lastRowNum + 1);

                        newRow.createCell(0).setCellValue(currentTime);

                        ArrayList<Sensor> sensors = system.getSensors();
                        for (int j = 0; j < sensors.size(); j++) {
                            Sensor sensor = sensors.get(j);
                            double roundedValue = Math.round(sensor.getCurrentValue() * 1000.0) / 1000.0;
                            Cell cell = newRow.createCell(j + 1);
                            cell.setCellValue(roundedValue);
                            
                            if (!sensor.isValueSafe()) {
                                cell.setCellStyle(redStyle);
                            }
                        }
                    }
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream(FILE_NAME)) {
                workbook.write(outputStream);
            }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, 
                "Файл не найден: " + FILE_NAME + "\nДанные не записаны", 
                "Ошибка записи", 
                JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, 
                "Ошибка при записи данных: " + e.getMessage(), 
                "Ошибка записи", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void createRedStyle() {
        redStyle = workbook.createCellStyle();
        Font redFont = workbook.createFont();
        redFont.setColor(IndexedColors.RED.getIndex());
        redStyle.setFont(redFont);
    }

    public void close() {
        try {
            if (workbook != null) {
                workbook.close();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, 
                "Ошибка при закрытии файла: " + e.getMessage(), 
                "Ошибка", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
}
