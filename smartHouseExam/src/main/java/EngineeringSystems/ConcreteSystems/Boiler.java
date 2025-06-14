package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.EngineeringSystem;
import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import Sensors.factories.GasSensorFactory;
import Sensors.factories.TempSensorFactory;

public class Boiler extends EngineeringSystem {

    public Boiler() {
        this.name = "Котел";
        setSensors();
        setParameters();
    }

    private void setSensors() {
        factorySensor = new TempSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(90));

        factorySensor = new GasSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(50));
    }

    private void setParameters() {
        SystemParameter parameter = new SystemParameter("Температура", 70, 5, 110, 8);
        parameters.put(ParametersTypes.TEMPERATURE, parameter);
        
        parameter = new SystemParameter("Утечка газа", 2, 0.67, 55, 5);
        parameters.put(ParametersTypes.GAS, parameter);
    }
}
