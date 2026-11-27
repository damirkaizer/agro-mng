import java.util.List;

public interface SensorRepository {
    boolean saveSensorReading(SensorReading reading);

    List<SensorReading> getReadingsByField(String fieldId);
}