package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.DualSystemParameter;
import EngineeringSystems.EngineeringSystem;
import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import Sensors.factories.EnergySensorFactory;
import Sensors.factories.HumiditySensorFactory;
import Sensors.factories.PressureSensorFactory;
import Sensors.factories.VibrationSensorFactory;

public class PumpStation extends EngineeringSystem {

    public PumpStation() {
        this.name = "Насосная станция";
        setParameters();
        setSensors();        
    }

    private void setSensors() {
        factorySensor = new PressureSensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(1, 12));

        factorySensor = new HumiditySensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(30, 75));

        factorySensor = new VibrationSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(4));

        factorySensor = new EnergySensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(800));
    }

    private void setParameters() {
        SystemParameter parameter = new DualSystemParameter("Давление", 6, 1,
                15.6, 1.8, 0.5, 0.25);
        parameters.put(ParametersTypes.PRESSURE, parameter);
        
        parameter = new DualSystemParameter("Влажность", 45, 3,
                85, 3, 15, 5);
        parameters.put(ParametersTypes.HUMIDITY, parameter);
        
        parameter = new SystemParameter("Вибрация", 1, 0.5, 8.5, 1.5);
        parameters.put(ParametersTypes.VIBRATION, parameter);
        
        parameter = new SystemParameter("Потребление энергии", 700, 5, 900, 10);
        parameters.put(ParametersTypes.ENERGY, parameter);
    }
}
