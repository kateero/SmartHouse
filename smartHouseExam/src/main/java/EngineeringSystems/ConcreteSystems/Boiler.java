package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.EngineeringSystem;
import Sensors.factories.GasSensorFactory;
import Sensors.factories.TempSensorFactory;

public class Boiler extends EngineeringSystem{

    public Boiler() {
        this.name = "Котел";
        setSensors();
    }
    
    private void setSensors(){
        factorySensor = new TempSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(90));
        
        factorySensor = new GasSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(50));
    }
    
}
