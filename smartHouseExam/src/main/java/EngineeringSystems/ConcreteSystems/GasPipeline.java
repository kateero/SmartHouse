package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.EngineeringSystem;
import Sensors.factories.GasSensorFactory;
import Sensors.factories.PressureSensorFactory;

public class GasPipeline extends EngineeringSystem {

    public GasPipeline() {
        this.name = "Газопровод";
        setSensors();
    }
    
    private void setSensors(){
        factorySensor = new PressureSensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(0.008, 0.03));
        
        factorySensor = new GasSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(4400));
    }
}
