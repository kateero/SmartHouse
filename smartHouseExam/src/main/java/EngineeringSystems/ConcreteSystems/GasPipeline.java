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
        setSensors();
        setParameters();
    }

    private void setSensors() {
        factorySensor = new PressureSensorFactory();
        this.sensors.add(factorySensor.createDualThresholdSensor(0.008, 0.03));

        factorySensor = new GasSensorFactory();
        this.sensors.add(factorySensor.createSingleThresholdSensor(4400));
    }

    private void setParameters() {
        SystemParameter parameter = new DualSystemParameter("Давление", 0.019, 0.00367,
                0.04, 0.005, 0.004, 0.0025);
        parameters.put(ParametersTypes.PRESSURE, parameter);

        parameter = new SystemParameter("Утечка газа", 5, 1.67, 4800, 100);
        parameters.put(ParametersTypes.GAS, parameter);
    }
}
