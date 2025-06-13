package Sensors.factories;

import Sensors.*;

public class TempSensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик температуры", "°C", maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double maxThreshold, double minThreshold) {
        return new DualTheresholSensor("Датчик температуры", "°C",  minThreshold, maxThreshold);
    }
    
}
