package Sensors.factories;

import EngineeringSystems.ParametersTypes;
import Sensors.*;

public class EnergySensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик потребления энергии", "Вт", 
                ParametersTypes.ENERGY, maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double minThreshold, double maxThreshold) {
        return new DualTheresholSensor("Датчик потребления энергии", "Вт", 
                ParametersTypes.ENERGY, minThreshold, maxThreshold);
    }
}
