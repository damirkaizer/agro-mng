import java.time.LocalDateTime;

public class SensorData {

    private int sensorId;
    private double temperature;
    private double humidity;
    private LocalDateTime recordedAt;

    public SensorData(
            int sensorId,
            double temperature,
            double humidity,
            LocalDateTime recordedAt) {

        this.sensorId = sensorId;
        this.temperature = temperature;
        this.humidity = humidity;
        this.recordedAt = recordedAt;
    }

    public int getSensorId() {
        return sensorId;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public LocalDateTime getRecordedAt() {
        return recordedAt;
    }

    public void displayData() {
        System.out.println("Sensor ID: " + sensorId);
        System.out.println("Temperature: " + temperature + " C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Recorded at: " + recordedAt);
    }
}