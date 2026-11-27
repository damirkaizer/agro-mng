import java.util.List;

public class SensorController {

    private SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    public String addSensorReading(SensorReading reading) {
        if (service.addReading(reading)) {
            return "Данные успешно сохранены!";
        }

        return "Ошибка! Некорректные данные.";
    }

    public List<SensorReading> getFieldReadings(String fieldId) {
        return service.getReadings(fieldId);
    }
}