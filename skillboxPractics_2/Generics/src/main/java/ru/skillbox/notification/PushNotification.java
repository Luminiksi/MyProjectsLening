package ru.skillbox.notification;


import lombok.Getter;
import lombok.Setter;

@Setter
public class PushNotification implements Notification {

    private static final String EMOJI = "\ud83d\udc4b";

    private String message;
    @Getter
    private String title;
    @Getter
    private String account;

    public PushNotification(String title, String message) {
        this.message = message;
        this.title = title;
    }

    @Override
    public String formattedMessage() {
        return EMOJI + message;
    }
}
