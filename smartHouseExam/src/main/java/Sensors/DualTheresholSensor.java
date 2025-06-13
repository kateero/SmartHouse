package Sensors;

import EngineeringSystems.ParametersTypes;

public class DualTheresholSensor extends Sensor {

    private double maxThreshold;
    private double minThreshold;

    public DualTheresholSensor(String name, String unit, ParametersTypes parameter, double minThreshold, double maxThreshold) {
        super(name, unit, parameter);
        this.maxThreshold = maxThreshold;
        this.minThreshold = minThreshold;
    }

    @Override
    public boolean isValueSafe() {
        return (this.getCurrentValue() > minThreshold && this.getCurrentValue() < maxThreshold);
    }

}
