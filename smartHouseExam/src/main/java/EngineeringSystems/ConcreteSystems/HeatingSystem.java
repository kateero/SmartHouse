package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.EngineeringSystem;
import Sensors.factories.HumiditySensorFactory;
import Sensors.factories.PressureSensorFactory;
import Sensors.factories.TempSensorFactory;

public class HeatingSystem extends EngineeringSystem {

    public HeatingSystem() {
        this.name = "Отопление";
        setSensors();
    }

    private void setSensors() {
        factorySensor = new PressureSensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(0.8, 3));

        factorySensor = new TempSensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(3, 90));

        factorySensor = new HumiditySensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(30, 60));
    }
}
