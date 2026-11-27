import java.time.LocalDateTime;

public class SensorReading {
    private String fieldId;
    private double temperature;
    private double humidity;
    private LocalDateTime timestamp;

    public SensorReading(String fieldId, double temperature,
                         double humidity, LocalDateTime timestamp) {
        this.fieldId = fieldId;
        this.temperature = temperature;
        this.humidity = humidity;
        this.timestamp = timestamp;
    }

    public String getFieldId() {
        return fieldId;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}