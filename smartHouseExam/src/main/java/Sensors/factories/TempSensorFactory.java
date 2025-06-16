package Sensors.factories;

import Sensors.*;
import EngineeringSystems.ParametersTypes;

public class TempSensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик температуры", "°C",
                ParametersTypes.TEMPERATURE, maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double minThreshold, double maxThreshold) {
        return new DualTheresholSensor("Датчик температуры", "°C",
                ParametersTypes.TEMPERATURE, minThreshold, maxThreshold);
    }
    
}
