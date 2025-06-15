package SmartHouse;

import GUI.GalaFrame;
import Sensors.Sensor;
import Sensors.SensorObserver;

public class SensorsStateMonitor implements SensorObserver {
    private String path = "C:\\Users\\Катя\\OneDrive\\Рабочий стол\\Results.txt";
    private GalaFrame gui;
    
    public SensorsStateMonitor(GalaFrame gui) {
        this.gui = gui;
    }

    @Override
    public void update(Sensor sensor) {
        
    }
    
    
}