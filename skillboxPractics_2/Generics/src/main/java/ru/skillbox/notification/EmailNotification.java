package ru.skillbox.notification;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmailNotification implements Notification {

    private static final String TEMPLATE = "[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+";
    private static final String TEMPLATE_SKILLBOX = "[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+\\.[a-zA-Z]+";

    @Getter
    @Setter
    private String subject;

    @Setter
    private String message;

    @Getter
    private Set<String> recipients;

    public EmailNotification(String subject, String message) {
        this.message = message;
        this.subject = subject;
        recipients = new HashSet<>();
    }

    public void addRecipient(String recipient) {
        if (checkRecipient(recipient)) {
            recipients.add(recipient);
        }
    }

    public void addRecipients(List<String> recipients) {
        for (String recipient : recipients) {
            addRecipient(recipient);
        }
    }

    public boolean checkRecipient(String recipient) {
        return recipient.matches(TEMPLATE) || recipient.matches(TEMPLATE_SKILLBOX);
    }

    @Override
    public String formattedMessage() {
        return "<p>" + message + "</p>";
    }
}
