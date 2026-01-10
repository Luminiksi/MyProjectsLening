package ru.skillbox.notification_sender;

import lombok.NonNull;
import ru.skillbox.notification.SmsNotification;

import java.util.List;

public class SmsNotificationSender implements NotificationSender<SmsNotification> {
    @Override
    public void send(@NonNull SmsNotification notification) {
        if (notification.getRecipients().isEmpty()) {
            return;
        }

        StringBuilder recipients = new StringBuilder();
        for (String recipient : notification.getRecipients()) {
            if (recipients.length() > 0) {
               recipients.append(", ");
            }
            recipients.append(recipient);
        }
        System.out.println("receivers: " + recipients);
        System.out.println("message: " + notification.formattedMessage());
    }

    @Override
    public void send(List<SmsNotification> notifications) {
        for (SmsNotification notification : notifications) {
            send(notification);
        }
    }
}
