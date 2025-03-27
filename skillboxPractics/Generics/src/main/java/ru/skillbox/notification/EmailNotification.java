package ru.skillbox.notification;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@Setter
public class EmailNotification implements Notification {
    private String notification;
    @Getter
    private String subject;
    private HashSet<String> receivers;

    public EmailNotification(String notification, String subject, HashSet<String> receivers) {
        this.notification = notification;
        this.subject = subject;
        this.receivers = receivers;
    }

    @Override
    public String formattedMessage() {
        return "<p>" + notification + "</p>";
    }

    public String getReceivers() {
        StringBuilder builder = new StringBuilder();
        for (String receiver : receivers) {
            if (builder.length() == 0) {
                builder.append(receiver);
            } else {
                builder.append(", ").append(receiver);
            }
        }
        return builder.toString();
    }
}
