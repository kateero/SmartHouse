package Sensors;

import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import EngineeringSystems.EngineeringSystem;

public abstract class Sensor {

    private final String name;
    private final String unit;
    private ParametersTypes parameter;
    private SensorObserver observer;

    private boolean isWorking = true;
    private boolean abnormalState = false;
    private boolean wasLogged = false;

    private double currentValue;
    private List<SensorValue> lastValues = new ArrayList<>();

    private EngineeringSystem parentSystem;

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

    public boolean isWasLogged() {
        return wasLogged;
    }

    public double getCurrentValue() {               //это надо отправлять в таблицу
        return currentValue;
    }

    public List<SensorValue> getLastValues() {
        return lastValues;
    }

    public abstract boolean isValueSafe();

    public void addValue(double value) {
        lastValues.add(new SensorValue(value));
    }

    public void update(HashMap<ParametersTypes, SystemParameter> parameters) {
        if (isWorking) {
            this.currentValue = parameters.get(this.parameter).getCurrentValue();
            addValue(this.currentValue);
            if (!isValueSafe()) {
                this.abnormalState = true;
                observer.update(this);
                this.wasLogged = true;
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
                this.observer.sensorBroke(this);
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public EngineeringSystem getParentSystem() {
        return parentSystem;
    }

    public void setParentSystem(EngineeringSystem parentSystem) {
        this.parentSystem = parentSystem;
    }

    public void setLogged(boolean logged) {
        this.wasLogged = logged;
    }

}
