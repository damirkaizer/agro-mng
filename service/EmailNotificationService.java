package service;

public class EmailNotificationService
        implements NotificationService {

    @Override
    public void sendNotification(
            String email, String message) {

        System.out.println("Отправка письма на адрес: " + email);
        System.out.println("Сообщение: " + message);
        System.out.println("Письмо успешно отправлено!");
    }
}