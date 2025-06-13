package Sensors.factories;

import Sensors.*;

public class HumiditySensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик влажности", "%RH", maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double maxThreshold, double minThreshold) {
        return new DualTheresholSensor("Датчик влажности", "%RH", minThreshold, maxThreshold);
    }
}
