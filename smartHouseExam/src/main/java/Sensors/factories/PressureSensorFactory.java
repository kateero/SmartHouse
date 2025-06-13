package Sensors.factories;

import Sensors.*;
import EngineeringSystems.ParametersTypes;

public class PressureSensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик давления", "бар", 
                ParametersTypes.PRESSURE, maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double maxThreshold, double minThreshold) {
        return new DualTheresholSensor("Датчик давления", "бар", 
                ParametersTypes.PRESSURE, minThreshold, maxThreshold);
    }
}
