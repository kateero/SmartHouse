package EngineeringSystems;

import Sensors.Sensor;
import Sensors.factories.AbstractFactorySensor;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class EngineeringSystem {

    protected String name;
    protected HashMap<ParametersTypes, SystemParameter> parameters;
    protected ArrayList<Sensor> sensors;
    protected AbstractFactorySensor factorySensor;
    private double NORMAL_WORK_PROBABILITY = 0.95;

    public EngineeringSystem() {
        this.parameters = new HashMap<>();
        this.sensors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addParameter(ParametersTypes type, SystemParameter parameter){
        this.parameters.put(type, parameter);
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public void deleteSensor(Sensor sensor) {
        this.sensors.remove(sensor);
    }

    public void notifySensors() {
        for (Sensor sensor : sensors) {
            sensor.update(parameters);
        }
    }

    public void updateState() {
        for (SystemParameter parameter : parameters.values()) {
            if (Math.random() < NORMAL_WORK_PROBABILITY) {
                parameter.updateCurrentValue();
            } else {
                parameter.setNormalState(false);
                parameter.updateCurrentValue();
                NORMAL_WORK_PROBABILITY = 0.7;
            }
        }
        notifySensors();
    }

    @Override
    public String toString() {
        return name;
    }

}
