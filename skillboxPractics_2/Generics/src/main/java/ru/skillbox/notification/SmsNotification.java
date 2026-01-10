package ru.skillbox.notification;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmsNotification implements Notification{

    private static final String TEMPLATE = "\\+[0-9]{11}";

    @Setter
    private String message;
    @Getter
    private Set<String> recipients;

    public SmsNotification(String message) {
        this.message = message;
        this.recipients = new HashSet<>();
    }

    public void setRecipient(String number) {
        if (checkRecipient(number)) {
            recipients.add(number);
        }
    }

    public void setRecipients(List<String> numbers) {
        for (String number : numbers) {
            setRecipient(number);
        }
    }

    public boolean checkRecipient(String recipient) {
        return recipient.matches(TEMPLATE);
    }

    @Override
    public String formattedMessage() {
        return message;
    }
}
