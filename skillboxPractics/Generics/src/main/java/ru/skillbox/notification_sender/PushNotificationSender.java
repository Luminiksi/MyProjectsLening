package ru.skillbox.notification_sender;

import ru.skillbox.notification.PushNotification;

import java.util.List;

public class PushNotificationSender implements NotificationSender<PushNotification> {
    @Override
    public void send(PushNotification notification) {
        System.out.println("PUSH");
        System.out.println("title: " + notification.getTitle());
        System.out.println("receivers: " + notification.getReceiver());
        System.out.println("message: " + notification.formattedMessage());
    }

    @Override
    public void send(List<PushNotification> notifications) {
        notifications.forEach(this::send);
    }
}
