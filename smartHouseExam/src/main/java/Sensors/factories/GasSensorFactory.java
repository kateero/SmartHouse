package Sensors.factories;

import Sensors.*;
import EngineeringSystems.ParametersTypes;

public class GasSensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик утечки газа", "ppm", 
                ParametersTypes.GAS, maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double maxThreshold, double minThreshold) {
        return new DualTheresholSensor("Датчик утечки газа", "ppm", 
                ParametersTypes.GAS, minThreshold, maxThreshold);
    }

}
