package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.EngineeringSystem;
import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import Sensors.factories.EnergySensorFactory;
import Sensors.factories.NoiseSensorFactory;
import Sensors.factories.TempSensorFactory;
import Sensors.factories.VibrationSensorFactory;

public class Transformer extends EngineeringSystem {

    public Transformer() {
        this.name = "Трансофрматор";
        setParameters();
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

    private void setParameters() {
        SystemParameter parameter = new SystemParameter("Температура", 40, 3, 95, 3);
        parameters.put(ParametersTypes.TEMPERATURE, parameter);

        parameter = new SystemParameter("Энергопотребление", 150, 3, 200, 5);
        parameters.put(ParametersTypes.ENERGY, parameter);

        parameter = new SystemParameter("Шум", 25, 2, 50, 3);
        parameters.put(ParametersTypes.NOISE, parameter);

        parameter = new SystemParameter("Вибрация", 0.5, 0.1, 5, 1.5);
        parameters.put(ParametersTypes.VIBRATION, parameter);
    }
}
