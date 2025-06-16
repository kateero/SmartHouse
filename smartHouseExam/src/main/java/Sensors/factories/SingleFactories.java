package Sensors.factories;

import EngineeringSystems.ParametersTypes;
import Sensors.Sensor;

public class SingleFactories {
    
    public static Sensor createSensor(ParametersTypes type, double maxThreshold) {
        switch (type) {
            case TEMPERATURE:
                TempSensorFactory tempFactory = new TempSensorFactory();
                return tempFactory.createSingleThresholdSensor(maxThreshold);
                
            case PRESSURE:
                PressureSensorFactory pressureFactory = new PressureSensorFactory();
                return pressureFactory.createSingleThresholdSensor(maxThreshold);
                
            case HUMIDITY:
                HumiditySensorFactory humidityFactory = new HumiditySensorFactory();
                return humidityFactory.createSingleThresholdSensor(maxThreshold);
                
            case GAS:
                GasSensorFactory gasFactory = new GasSensorFactory();
                return gasFactory.createSingleThresholdSensor(maxThreshold);
                
            case VIBRATION:
                VibrationSensorFactory vibrationFactory = new VibrationSensorFactory();
                return vibrationFactory.createSingleThresholdSensor(maxThreshold);
                
            case NOISE:
                NoiseSensorFactory noiseFactory = new NoiseSensorFactory();
                return noiseFactory.createSingleThresholdSensor(maxThreshold);
                
            case ENERGY:
                EnergySensorFactory energyFactory = new EnergySensorFactory();
                return energyFactory.createSingleThresholdSensor(maxThreshold);
                
            case LIGHT:
                LightSensorFactory lightFactory = new LightSensorFactory();
                return lightFactory.createSingleThresholdSensor(maxThreshold);
                
            case ELECTRIC:
                ElectricSensorFactory electricFactory = new ElectricSensorFactory();
                return electricFactory.createSingleThresholdSensor(maxThreshold);
                
            case WATER:
                WaterSensorFactory waterFactory = new WaterSensorFactory();
                return waterFactory.createSingleThresholdSensor(maxThreshold);
                
            default:
                throw new IllegalArgumentException("Неизвестный тип параметра: " + type);
        }
    }
}
