import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        InMemorySensorRepository repository =
                new InMemorySensorRepository();

        SensorService service =
                new SensorService(repository);

        SensorController controller =
                new SensorController(service);

        SensorReading reading = new SensorReading(
                "FIELD-001",
                25.5,
                35.0,
                LocalDateTime.now()
        );

        System.out.println(
                controller.addSensorReading(reading)
        );

        System.out.println(
                service.analyzeHumidity(reading)
        );

        System.out.println(
                "Количество записей: " +
                controller.getFieldReadings("FIELD-001").size()
        );
    }
}