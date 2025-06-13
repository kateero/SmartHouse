package Sensors;

public class DualTheresholSensor extends Sensor {
    
    private double maxThreshold;
    private double minThreshold;

    public DualTheresholSensor(double maxThreshold, double minThreshold, String name, String unit) {
        super(name, unit);
        this.maxThreshold = maxThreshold;
        this.minThreshold = minThreshold;
    }

    @Override
    public boolean isValueSafe() {
        return (this.getCurrentValue() > minThreshold && this.getCurrentValue() < maxThreshold);
    }
    
}
