package Sensors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SensorValue {
    private double value;
    private LocalDateTime timestamp;

    public SensorValue(double value) {
        this.value = Math.round(value * 1000.0) / 1000.0;
        this.timestamp = LocalDateTime.now();
    }

    public double getValue() {
        return value;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return String.format("%.3f (%s)", value, timestamp.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
} 