package Sensors;

public class DualTheresholSensor extends Sensor {
    
    private double maxThreshold;
    private double minThreshold;

    public DualTheresholSensor(String name, String unit, double minThreshold, double maxThreshold) {
        super(name, unit);
        this.maxThreshold = maxThreshold;
        this.minThreshold = minThreshold;
    }

    @Override
    public boolean isValueSafe() {
        return (this.getCurrentValue() > minThreshold && this.getCurrentValue() < maxThreshold);
    }
    
}
