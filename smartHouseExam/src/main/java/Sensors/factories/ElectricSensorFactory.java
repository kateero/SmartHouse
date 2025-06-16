package Sensors.factories;

import EngineeringSystems.ParametersTypes;
import Sensors.DualTheresholSensor;
import Sensors.Sensor;
import Sensors.SingleThresholdSensor;

public class ElectricSensorFactory implements AbstractFactorySensor{

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
          return new SingleThresholdSensor("Датчик тока", "А", 
                ParametersTypes.ELECTRIC, maxThreshold);
    }

    @Override
    public Sensor createDualThresholdSensor(double minThreshold, double maxThreshold) {
        return new DualTheresholSensor("Датчик тока", "А", 
                ParametersTypes.ELECTRIC, minThreshold, maxThreshold);
    }
    
}
