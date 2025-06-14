package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.EngineeringSystem;
import Sensors.factories.EnergySensorFactory;
import Sensors.factories.HumiditySensorFactory;
import Sensors.factories.PressureSensorFactory;
import Sensors.factories.VibrationSensorFactory;

public class PumpStation extends EngineeringSystem{

    public PumpStation() {
        this.name = "Насосная станция";
        setSensors();
    }
    
    private void setSensors(){
        factorySensor = new PressureSensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(1, 12));
        
        factorySensor = new HumiditySensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(30, 75));
        
        factorySensor = new VibrationSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(4));
        
        factorySensor = new EnergySensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(800));
    }
    
}
