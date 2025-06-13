package Sensors;

import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import java.util.HashMap;

public abstract class Sensor {

    private final String name;
    private final String unit;
    private boolean workingState = true;
    private ParametersTypes parameter;
    private double currentValue;

    public Sensor(String name, String unit, ParametersTypes parameter) {
        this.name = name;
        this.unit = unit;
        this.parameter = parameter;
    }

    public String getName() {
        return name;
    }

    public boolean isWorkingState() {
        return workingState;
    }

    public String getUnit() {
        return unit;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setWorkingState(boolean workingState) {
        this.workingState = workingState;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }
    
    public abstract boolean isValueSafe();
    
    public void update(HashMap<ParametersTypes, SystemParameter> parameters){
       this.currentValue = parameters.get(this.parameter).getCurrentValue();
    }

}
