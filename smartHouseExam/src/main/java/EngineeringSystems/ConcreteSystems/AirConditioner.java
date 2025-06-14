package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.EngineeringSystem;
import Sensors.factories.EnergySensorFactory;
import Sensors.factories.NoiseSensorFactory;
import Sensors.factories.TempSensorFactory;
import Sensors.factories.VibrationSensorFactory;

public class AirConditioner extends EngineeringSystem {

    public AirConditioner() {
        this.name = "Кондиционер";
        setSensors();
    }

    private void setSensors() {
        factorySensor = new TempSensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(5, 40));
        
        factorySensor = new VibrationSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(2.5));
        
        factorySensor = new NoiseSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(35));
        
        factorySensor = new EnergySensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(685));               
    }

}
