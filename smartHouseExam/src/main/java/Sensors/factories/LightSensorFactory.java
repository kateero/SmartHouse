package Sensors.factories;

import EngineeringSystems.ParametersTypes;
import Sensors.DualTheresholSensor;
import Sensors.Sensor;
import Sensors.SingleThresholdSensor;

public class LightSensorFactory implements AbstractFactorySensor{

    @Override
    public Sensor createSingleThresholdSensor(double maxThreshold) {
          return new SingleThresholdSensor("Датчик света", "Люкс", 
                ParametersTypes.LIGHT, maxThreshold);
    }
    
    @Override
    public Sensor createDualThresholdSensor(double minThreshold, double maxThreshold) {
        return new DualTheresholSensor("Датчик света", "Люкс", 
                ParametersTypes.LIGHT, minThreshold, maxThreshold);
    }
    
}
