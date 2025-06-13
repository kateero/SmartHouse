package Sensors;

import EngineeringSystems.ParametersTypes;

public class SingleThresholdSensor extends Sensor {

    private double maxThreshold;

    public SingleThresholdSensor(String name, String unit, ParametersTypes parameter, double maxThreshold) {
        super(name, unit, parameter);
        this.maxThreshold = maxThreshold;
    }

    

    @Override
    public boolean isValueSafe() {
        return this.getCurrentValue() < maxThreshold;
    }

}
