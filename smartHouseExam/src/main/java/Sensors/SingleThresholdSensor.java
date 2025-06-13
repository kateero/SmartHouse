package Sensors;

public class SingleThresholdSensor extends Sensor {

    private double maxThreshold;

    public SingleThresholdSensor(String name, String unit, double maxThreshold) {
        super(name, unit);
    }

    @Override
    public boolean isValueSafe() {
        return this.getCurrentValue() < maxThreshold;
    }

}
