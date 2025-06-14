package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.EngineeringSystem;
import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import Sensors.factories.EnergySensorFactory;
import Sensors.factories.NoiseSensorFactory;
import Sensors.factories.TempSensorFactory;
import Sensors.factories.VibrationSensorFactory;

public class Transformer extends EngineeringSystem {

    public Transformer() {
        this.name = "Трансофрматор";
        setSensors();
        setParameters();
    }

    private void setSensors() {
        factorySensor = new TempSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(90));

        factorySensor = new EnergySensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(180));

        factorySensor = new NoiseSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(40));

        factorySensor = new VibrationSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(2.5));
    }
    
    private void setParameters() {
        SystemParameter parameter = new SystemParameter("Температура", 65, 5, 115, 15);
        parameters.put(ParametersTypes.TEMPERATURE, parameter);
        
        parameter = new SystemParameter("Энергопотребление", 108, 24, 225, 22);
        parameters.put(ParametersTypes.ENERGY, parameter);
        
        parameter = new SystemParameter("Шум", 30, 3, 60, 5);
        parameters.put(ParametersTypes.NOISE, parameter);
        
        parameter = new SystemParameter("Вибрация", 0.5, 0.15, 5, 1.5);
        parameters.put(ParametersTypes.NOISE, parameter);
    }
}
