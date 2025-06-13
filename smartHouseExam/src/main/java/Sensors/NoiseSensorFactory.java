package Sensors;

public class NoiseSensorFactory implements AbstractFactorySensor {

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
        return new SingleThresholdSensor("Датчик шума", "дБа", maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double maxThreshold, double minThreshold) {
        return new DualTheresholSensor("Датчик шума", "дБа", minThreshold, maxThreshold);
    }
}
