package EngineeringSystems.ConcreteSystems;

import EngineeringSystems.DualSystemParameter;
import EngineeringSystems.EngineeringSystem;
import EngineeringSystems.ParametersTypes;
import EngineeringSystems.SystemParameter;
import Sensors.factories.GasSensorFactory;
import Sensors.factories.PressureSensorFactory;

public class GasPipeline extends EngineeringSystem {

    public GasPipeline() {
        this.name = "Газопровод";
        setParameters();
        setSensors();
    }

    private void setSensors() {
        factorySensor = new PressureSensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(0.008, 0.03));

        factorySensor = new GasSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(4400));
    }

    private void setParameters() {
        SystemParameter parameter = new DualSystemParameter("Давление", 0.010, 0.003,
                0.04, 0.005, 0.004, 0.0025);
        parameters.put(ParametersTypes.PRESSURE, parameter);

        parameter = new SystemParameter("Утечка газа", 0.5, 0.01, 4800, 100);
        parameters.put(ParametersTypes.GAS, parameter);
    }
}
