import java.util.ArrayList;
import java.util.List;

public class InMemorySensorRepository implements SensorRepository {

    private List<SensorReading> readings = new ArrayList<>();

    @Override
    public boolean saveSensorReading(SensorReading reading) {
        return readings.add(reading);
    }

    @Override
    public List<SensorReading> getReadingsByField(String fieldId) {
        return readings.stream()
                .filter(r -> r.getFieldId().equals(fieldId))
                .toList();
    }
}