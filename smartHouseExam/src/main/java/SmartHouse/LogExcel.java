package SmartHouse;

import EngineeringSystems.EngineeringSystem;
import Sensors.Sensor;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;

public class LogExcel {
    private String FILE_NAME = System.getProperty("user.dir") + "\\smart_house_log.xlsx";
    private XSSFWorkbook workbook;
    private Map<String, Integer> systemSheetMap;
    private CellStyle redStyle;

    public LogExcel() {
        this.workbook = new XSSFWorkbook();
        this.systemSheetMap = new java.util.HashMap<>();
        createRedStyle();
    }

    private void createRedStyle() {
        redStyle = workbook.createCellStyle();
        Font redFont = workbook.createFont();
        redFont.setColor(IndexedColors.RED.getIndex());
        redStyle.setFont(redFont);
    }

    public void createExcel(SmartHouse smartHouse) {
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                file.delete();
            }

            ArrayList<EngineeringSystem> systems = smartHouse.getSystems();
            for (int i = 0; i < systems.size(); i++) {
                EngineeringSystems.EngineeringSystem system = systems.get(i);
                String systemName = system.getName();
                XSSFSheet sheet = workbook.createSheet(systemName);
                systemSheetMap.put(systemName, i);

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

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, 
                "Файл не найден: " + FILE_NAME + "\nДанные не записаны", 
                "Ошибка записи", 
                JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, 
                "Ошибка при создании файла: " + e.getMessage(), 
                "Ошибка записи", 
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

            String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            for (EngineeringSystems.EngineeringSystem system : smartHouse.getSystems()) {
                String systemName = system.getName();
                XSSFSheet sheet = workbook.getSheet(systemName);
                
                if (sheet != null) {
                    int lastRowNum = sheet.getLastRowNum();
                    Row newRow = sheet.createRow(lastRowNum + 1);

                    newRow.createCell(0).setCellValue(currentTime);

                    ArrayList<Sensor> sensors = system.getSensors();
                    for (int i = 0; i < sensors.size(); i++) {
                        Sensors.Sensor sensor = sensors.get(i);
                        double roundedValue = Math.round(sensor.getCurrentValue() * 1000.0) / 1000.0;
                        Cell cell = newRow.createCell(i + 1);
                        cell.setCellValue(roundedValue);
                        
                        if (!sensor.isValueSafe()) {
                            cell.setCellStyle(redStyle);
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
