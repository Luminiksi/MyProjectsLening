package ru.skillbox.notification;

import lombok.Getter;
import lombok.Setter;

@Setter
public class PushNotification implements Notification {
    private String notification;
    @Getter
    private String title;
    @Getter
    private String receiver;

    public PushNotification(String notification, String title, String receiver) {
        this.notification = notification;
        this.title = title;
        this.receiver = receiver;
    }

    @Override
    public String formattedMessage() {
        return "\ud83d\udc4b " + notification;
    }
}
