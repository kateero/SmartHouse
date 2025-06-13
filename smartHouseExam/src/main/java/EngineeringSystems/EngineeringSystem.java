package EngineeringSystems;

import Sensors.Sensor;
import Sensors.factories.AbstractFactorySensor;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class EngineeringSystem {

    private final String name;
    private HashMap<ParametersTypes, SystemParameter> parameters;
    private ArrayList<Sensor> sensors;
    private AbstractFactorySensor factorySensor;

    public EngineeringSystem(String name) {
        this.name = name;
        this.parameters = new HashMap<>();
        this.sensors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public HashMap<ParametersTypes, SystemParameter> getParameters() {
        return parameters;
    }
    
    public void addSensor(Sensor sensor){
        this.sensors.add(sensor);
    }
    
    public void deleteSensor(Sensor sensor){
        this.sensors.remove(sensor);
    }
    
    public void notifySensors(){
        for (Sensor sensor : sensors) {
            sensor.update(parameters);
        }
    }
}
