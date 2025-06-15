package Sensors;

public interface SensorObserver {

    public void update(Sensor sensor);

    public void sensorBroke(Sensor sensor);
}
