package Sensors.factories;

import Sensors.*;
import EngineeringSystems.ParametersTypes;

public class VibrationSensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик вибрации", "мм/с",
                ParametersTypes.VIBRATION, maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double maxThreshold, double minThreshold) {
        return new DualTheresholSensor("Датчик вибрации", "мм/с",
                ParametersTypes.VIBRATION, minThreshold, maxThreshold);
    }
}
