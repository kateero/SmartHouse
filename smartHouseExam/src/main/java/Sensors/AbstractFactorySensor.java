package Sensors;

public interface AbstractFactorySensor {

    public Sensor createSingleThresholdSensor(double maxThreshold);

    public Sensor createDualThresholdSensor(double maxThreshold, double minThreshold);
}