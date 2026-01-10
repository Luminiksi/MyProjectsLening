package ru.skillbox.notification_sender;

import lombok.NonNull;
import ru.skillbox.notification.PushNotification;

import java.util.List;

public class PushNotificationSender implements NotificationSender<PushNotification> {
    @Override
    public void send(@NonNull PushNotification notification) {
        if (notification.getAccount().isBlank()) {
            return;
        }

        System.out.println("title: " + notification.getTitle());
        System.out.println("receiver: " + notification.getAccount());
        System.out.println("message: " + notification.formattedMessage());
    }

    @Override
    public void send(List<PushNotification> notifications) {
        for (PushNotification notification : notifications) {
            send(notification);
        }
    }
}
