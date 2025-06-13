package Sensors;

public class SingleThresholdSendor extends Sensor {

    private double maxThreshold;

    public SingleThresholdSendor(String name, String unit, double maxThreshold) {
        super(name, unit);
    }

    @Override
    public boolean isValueSafe() {
        return this.getCurrentValue() < maxThreshold;
    }

}
