package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.DualSystemParameter;
import EngineeringSystems.EngineeringSystem;
import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import Sensors.factories.HumiditySensorFactory;
import Sensors.factories.PressureSensorFactory;
import Sensors.factories.TempSensorFactory;

public class HeatingSystem extends EngineeringSystem {

    public HeatingSystem() {
        this.name = "Отопление";
        setParameters();
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

    private void setParameters() {
        SystemParameter parameter = new DualSystemParameter(1.5, 0.1,
                5, 0.3, 0.4, 0.1);
        parameters.put(ParametersTypes.PRESSURE, parameter);

        parameter = new DualSystemParameter(60, 2,
                100, 5, 1.5, 0.75);
        parameters.put(ParametersTypes.TEMPERATURE, parameter);

        parameter = new DualSystemParameter(40, 2,
                72, 3, 15, 7.5);
        parameters.put(ParametersTypes.HUMIDITY, parameter);
    }
}
