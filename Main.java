import service.*;

public class Main {

    public static void main(String[] args) {

        ReportGenerator generator =
                new ReportGenerator();

        FileStorageManager storage =
                new FileStorageManager();

        NotificationService notification =
                new EmailNotificationService();

        String report = generator.generateReport(
                "Северное поле", 25.5, 60.0);

        System.out.println(report);

        storage.saveToFile(
                "agro_report.txt", report);

        notification.sendNotification(
                "user@example.com",
                "Ваш отчет по агромониторингу готов.");
    }
}