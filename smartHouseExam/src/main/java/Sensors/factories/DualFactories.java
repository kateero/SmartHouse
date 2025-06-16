package Sensors.factories;

import EngineeringSystems.ParametersTypes;
import Sensors.Sensor;

public class DualFactories {
    
    public static Sensor createSensor(ParametersTypes type, double minThreshold, double maxThreshold) {
        switch (type) {
            case TEMPERATURE:
                TempSensorFactory tempFactory = new TempSensorFactory();
                return tempFactory.createDualThresholdSensor(minThreshold, maxThreshold);
                
            case PRESSURE:
                PressureSensorFactory pressureFactory = new PressureSensorFactory();
                return pressureFactory.createDualThresholdSensor(minThreshold, maxThreshold);
                
            case HUMIDITY:
                HumiditySensorFactory humidityFactory = new HumiditySensorFactory();
                return humidityFactory.createDualThresholdSensor(minThreshold, maxThreshold);
                
            case GAS:
                GasSensorFactory gasFactory = new GasSensorFactory();
                return gasFactory.createDualThresholdSensor(minThreshold, maxThreshold);
                
            case VIBRATION:
                VibrationSensorFactory vibrationFactory = new VibrationSensorFactory();
                return vibrationFactory.createDualThresholdSensor(minThreshold, maxThreshold);
                
            case NOISE:
                NoiseSensorFactory noiseFactory = new NoiseSensorFactory();
                return noiseFactory.createDualThresholdSensor(minThreshold, maxThreshold);
                
            case ENERGY:
                EnergySensorFactory energyFactory = new EnergySensorFactory();
                return energyFactory.createDualThresholdSensor(minThreshold, maxThreshold);
                
            case LIGHT:
                LightSensorFactory lightFactory = new LightSensorFactory();
                return lightFactory.createDualThresholdSensor(minThreshold, maxThreshold);
                
            case ELECTRIC:
                ElectricSensorFactory electricFactory = new ElectricSensorFactory();
                return electricFactory.createDualThresholdSensor(minThreshold, maxThreshold);
                
            case WATER:
                WaterSensorFactory waterFactory = new WaterSensorFactory();
                return waterFactory.createDualThresholdSensor(minThreshold, maxThreshold);
                
            default:
                throw new IllegalArgumentException("Неизвестный тип параметра: " + type);
        }
    }
}
