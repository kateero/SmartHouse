package Sensors;

import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import java.util.HashMap;
import java.util.ArrayList;

public abstract class Sensor {

    private final String name;
    private final String unit;
    private boolean isWorking = true;
    private boolean abnormalState = false;
    private ParametersTypes parameter;
    private double currentValue;
    private final ArrayList<Double> lastValues = new ArrayList<>(MAX_VALUES);
    private static final int MAX_VALUES = 5;
    private SensorObserver observer;

    public Sensor(String name, String unit, ParametersTypes parameter) {
        this.name = name;
        this.unit = unit;
        this.parameter = parameter;
    }

    public void setObserver(SensorObserver observer) {
        this.observer = observer;
    }

    public String getName() {
        return name;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public String getUnit() {
        return unit;
    }

    public double getCurrentValue() {               //это надо отправлять в таблицу
        return currentValue;
    }

    public ArrayList<Double> getLastValues() {
        return new ArrayList<>(lastValues);
    }

    public abstract boolean isValueSafe();

    private void addValue(double value) {
        if (lastValues.size() >= MAX_VALUES) {
            lastValues.remove(0);
        }
        lastValues.add(value);
    }

    public void update(HashMap<ParametersTypes, SystemParameter> parameters) {
        if (isWorking) {
            this.currentValue = parameters.get(this.parameter).getCurrentValue();
            addValue(this.currentValue);
            if (!isValueSafe()) {
                this.abnormalState = true;
                observer.update(this);
            }
            broken();
        } else {
            this.currentValue = 0;
            addValue(this.currentValue);
        }
    }

    public void broken() {
        if (isWorking) {
            if (Math.random() > 0.95) {
                this.isWorking = false;
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }

}
