package SmartHouse;

import EngineeringSystems.EngineeringSystem;
import GUI.GalaFrame;
import Sensors.Sensor;
import Sensors.SensorObserver;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SensorsStateMonitor implements SensorObserver {

    private String path = System.getProperty("user.dir") + "\\emergency_log.txt";
    private GalaFrame gui;

    public SensorsStateMonitor(GalaFrame gui) {
        this.gui = gui;
        try (FileWriter fw = new FileWriter(path, false)) {
            fw.write("Журнал предаварийных показаний.\n"
            + "Последнее значение в массиве является аварийным.\n\n");
        } catch (IOException e) {
            System.err.println("Файл не найден");
        }
    }

    @Override
    public void update(Sensor sensor) {
        gui.highlightSensorAndSystem(sensor);
        logSensorFailure(sensor);
    }

    public void registerSystem(ArrayList<EngineeringSystem> listSystems) {
        for (EngineeringSystem system : listSystems) {
            for (Sensor sensor : system.getSensors()) {
                sensor.setObserver(this);
            }
        }
    }

    @Override
    public void sensorBroke(Sensor sensor) {
        gui.sensorBroke(sensor);
    }

    public void logSensorFailure(Sensor sensor) {
        if (!sensor.isWasLogged()) {
            try (FileWriter fw = new FileWriter(path, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {

                EngineeringSystem system = (EngineeringSystem) gui.findParentSystem(sensor).getUserObject();
                // Записываем информацию о датчике
                out.println("Система: " + system.getName());
                out.println("Датчик: " + sensor.getName());
                out.println("Значения до поломки: " + sensor.getLastValues());
                out.println("----------------------------------------");
            } catch (IOException e) {
                System.err.println("Файл не найден");
            }
        }
    }

}
