package SmartHouse;

import EngineeringSystems.EngineeringSystem;
import GUI.GalaFrame;
import Sensors.Sensor;
import Sensors.SensorObserver;
import java.util.ArrayList;

public class SensorsStateMonitor implements SensorObserver {

    private GalaFrame gui;

    public SensorsStateMonitor(GalaFrame gui) {
        this.gui = gui;
    }

    @Override
    public void update(Sensor sensor) {
        gui.highlightSensorAndSystem(sensor);
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
}
