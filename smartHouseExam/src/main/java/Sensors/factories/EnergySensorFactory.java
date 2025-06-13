package Sensors.factories;

import Sensors.*;

public class EnergySensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик потребления энергии", "Вт", maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double maxThreshold, double minThreshold) {
        return new DualTheresholSensor("Датчик потребления энергии", "Вт", minThreshold, maxThreshold);
    }
}
