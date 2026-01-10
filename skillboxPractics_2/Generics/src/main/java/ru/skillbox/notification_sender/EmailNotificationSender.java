package ru.skillbox.notification_sender;

import lombok.NonNull;
import ru.skillbox.notification.EmailNotification;

import java.util.List;

public class EmailNotificationSender implements NotificationSender<EmailNotification> {
    @Override
    public void send(@NonNull EmailNotification notification) {
        if (notification.getRecipients().isEmpty()) {
            return;
        }

        StringBuilder recipients = new StringBuilder();

        for (String recipient : notification.getRecipients()){
            if (recipients.length() > 0) {
                recipients.append(", ");
            }
            recipients.append(recipient);
        }

        System.out.println("subject: " + notification.getSubject());
        System.out.println("receivers: " + recipients);
        System.out.println("message: " + notification.formattedMessage());
    }

    @Override
    public void send(List<EmailNotification> notifications) {
        for (EmailNotification notification : notifications) {
            send(notification);
        }
    }

}
