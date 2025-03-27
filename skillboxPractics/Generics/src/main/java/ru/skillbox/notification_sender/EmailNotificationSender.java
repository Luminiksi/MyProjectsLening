package ru.skillbox.notification_sender;

import ru.skillbox.notification.EmailNotification;

import java.util.List;

public class EmailNotificationSender implements NotificationSender<EmailNotification> {
    @Override
    public void send(EmailNotification notification) {
        System.out.println("EMAIL");
        System.out.println("subject: " + notification.getSubject());
        System.out.println("receivers: " + notification.getReceivers());
        System.out.println("message: " + notification.formattedMessage());
    }

    @Override
    public void send(List<EmailNotification> notifications) {
        notifications.forEach(this::send);
    }
}
