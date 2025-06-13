package Sensors.factories;

import Sensors.*;

public class GasSensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик утечки газа", "ppm", maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double maxThreshold, double minThreshold) {
        return new DualTheresholSensor("Датчик утечки газа", "ppm", minThreshold, maxThreshold);
    }

}
