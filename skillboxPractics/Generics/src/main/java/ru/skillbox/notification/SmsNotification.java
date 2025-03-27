package ru.skillbox.notification;

import lombok.Setter;

import java.util.HashSet;

@Setter
public class SmsNotification implements Notification {
    private String notification;
    private HashSet<String> receivers;

    public SmsNotification(String notification, HashSet<String> receivers) {
        this.notification = notification;
        this.receivers = receivers;
    }

    @Override
    public String formattedMessage() {
        return notification;
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
