package Sensors;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class SensorsStateMonitor {
    private static final String LOG_FILE = "sensor_failures.log";
    private Set<String> loggedSensors = new HashSet<>();

    public void logSensorFailure(Sensor sensor) {
        String sensorKey = sensor.getParentSystem().getName() + "_" + sensor.getName();
        
        if (loggedSensors.contains(sensorKey)) {
            return;
        }

        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            
            out.println("Система: " + sensor.getParentSystem().getName());
            out.println("Датчик: " + sensor.getName());
            out.println("Значения до поломки:");
            
            // Записываем каждое значение с его временем
            for (SensorValue sensorValue : sensor.getLastValues()) {
                out.printf("  %.3f (время: %s)%n", 
                    sensorValue.getValue(),
                    sensorValue.getTimestamp().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            }
            
            out.println("----------------------------------------");
            
            loggedSensors.add(sensorKey);
            sensor.setLogged(true);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 