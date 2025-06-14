package Sensors;

import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import java.util.HashMap;

public abstract class Sensor {

    private final String name;
    private final String unit;
    private boolean isWorking = true;
    private boolean abnormalState = false;
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

    public boolean isWorking() {
        return isWorking;
    }

    public String getUnit() {
        return unit;
    }

    public double getCurrentValue() {               //это надо отправлять в таблицу
        return currentValue;
    }

    public abstract boolean isValueSafe();

    public void update(HashMap<ParametersTypes, SystemParameter> parameters) {
        if (isWorking) {
            this.currentValue = parameters.get(this.parameter).getCurrentValue();
            if (!isValueSafe()) {
                this.abnormalState = true;
                //notify gui about error
            }
            broken();
        } else {
            this.currentValue = 0;
        }
    }

    public void broken() {
        if (isWorking) {
            if (Math.random() < 0.05) {
                this.isWorking = false;
            }
        }
    }
}
