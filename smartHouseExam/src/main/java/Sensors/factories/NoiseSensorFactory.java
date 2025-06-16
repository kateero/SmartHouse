package Sensors.factories;

import Sensors.*;
import EngineeringSystems.ParametersTypes;

public class NoiseSensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик шума", "дБа", 
                ParametersTypes.NOISE, maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double minThreshold, double maxThreshold) {
        return new DualTheresholSensor("Датчик шума", "дБа", 
                ParametersTypes.NOISE, minThreshold, maxThreshold);
    }
}
