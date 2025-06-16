package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.DualSystemParameter;
import EngineeringSystems.EngineeringSystem;
import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import Sensors.factories.EnergySensorFactory;
import Sensors.factories.NoiseSensorFactory;
import Sensors.factories.TempSensorFactory;
import Sensors.factories.VibrationSensorFactory;

public class AirConditioner extends EngineeringSystem {

    public AirConditioner() {
        this.name = "Кондиционер";
        setParameters();
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

    private void setParameters() {
        SystemParameter parameter = new DualSystemParameter(23, 2,
                40, 5, 3, 1);
        parameters.put(ParametersTypes.TEMPERATURE, parameter);

        parameter = new SystemParameter(0.2, 0.07, 8, 1.5);
        parameters.put(ParametersTypes.VIBRATION, parameter);

        parameter = new SystemParameter(15, 3, 50, 5);
        parameters.put(ParametersTypes.NOISE, parameter);

        parameter = new SystemParameter(600, 5, 750, 10);
        parameters.put(ParametersTypes.ENERGY, parameter);
    }
}
