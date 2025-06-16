package Sensors.factories;

import Sensors.*;
import EngineeringSystems.ParametersTypes;

public class HumiditySensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик влажности", "%RH", 
                ParametersTypes.HUMIDITY, maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double minThreshold, double maxThreshold) {
        return new DualTheresholSensor("Датчик влажности", "%RH", 
                ParametersTypes.HUMIDITY, minThreshold, maxThreshold);
    }
}
