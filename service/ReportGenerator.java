package service;
public class ReportGenerator {

    public String generateReport(
            String fieldName,
            double temperature,
            double humidity) {

        return "ОТЧЕТ SMART AGRICULTURE\n"
                + "Поле: " + fieldName + "\n"
                + "Температура: " + temperature + " °C\n"
                + "Влажность: " + humidity + " %\n"
                + "Отчет успешно сформирован.";
    }
}