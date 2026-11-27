import java.util.List;

public class SensorService {

    private SensorRepository repository;

    private static final double MIN_HUMIDITY = 40.0;

    public SensorService(SensorRepository repository) {
        this.repository = repository;
    }

    public boolean addReading(SensorReading reading) {
        if (reading.getTemperature() < -50 ||
            reading.getTemperature() > 60) {
            return false;
        }

        if (reading.getHumidity() < 0 ||
            reading.getHumidity() > 100) {
            return false;
        }

        return repository.saveSensorReading(reading);
    }

    public List<SensorReading> getReadings(String fieldId) {
        return repository.getReadingsByField(fieldId);
    }

    public String analyzeHumidity(SensorReading reading) {
        if (reading.getHumidity() < MIN_HUMIDITY) {
            return "Предупреждение: низкая влажность!";
        }

        return "Влажность находится в норме.";
    }

    public String getSystemStatus() {
        return "Система работает нормально.";
    }
}