package Sensors.factories;

import Sensors.Sensor;

public interface AbstractFactorySensor {

    public Sensor createSingleThresholdSensor(double maxThreshold);

    public Sensor createDualThresholdSensor(double minThreshold, double maxThreshold);
}