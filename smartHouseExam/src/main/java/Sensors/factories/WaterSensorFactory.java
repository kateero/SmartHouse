package Sensors.factories;

import EngineeringSystems.ParametersTypes;
import Sensors.DualTheresholSensor;
import Sensors.Sensor;
import Sensors.SingleThresholdSensor;

public class WaterSensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик расхода воды", "кбм/ч",
                ParametersTypes.WATER, maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double minThreshold, double maxThreshold) {
        return new DualTheresholSensor("Датчик расхода воды", "кбм/ч",
                ParametersTypes.WATER, minThreshold, maxThreshold);
    }

}
