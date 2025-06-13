package Sensors;

public abstract class Sensor {

    private final String name;
    private final String unit;
    private boolean workingState = true;
    private double currentValue;

    public Sensor(String name, String unit) {
        this.name = name;
        this.unit = unit;
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
    
    /*public update(EngineerSystem system){
        
    }*/

}
