package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.EngineeringSystem;
import Sensors.factories.EnergySensorFactory;
import Sensors.factories.NoiseSensorFactory;
import Sensors.factories.TempSensorFactory;
import Sensors.factories.VibrationSensorFactory;

public class Transformer extends EngineeringSystem {

    public Transformer() {
        this.name = "Трансофрматор";
        setSensors();
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
}
