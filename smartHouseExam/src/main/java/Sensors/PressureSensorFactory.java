package Sensors;

public class PressureSensorFactory implements AbstractFactorySensor{
    
    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик давления", "бар", maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double maxThreshold, double minThreshold) {
        return new DualTheresholSensor("Датчик давления", "бар",  minThreshold, maxThreshold);
    }
}
