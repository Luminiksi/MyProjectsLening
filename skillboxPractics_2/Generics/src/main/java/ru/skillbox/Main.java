package ru.skillbox;

import ru.skillbox.notification.EmailNotification;
import ru.skillbox.notification.PushNotification;
import ru.skillbox.notification.SmsNotification;
import ru.skillbox.notification_sender.EmailNotificationSender;
import ru.skillbox.notification_sender.PushNotificationSender;
import ru.skillbox.notification_sender.SmsNotificationSender;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Отправка одного сообещения:");
        testEmailNotifications();
        System.out.println();
        testSmsNotifications();
        System.out.println();
        testPushNotifications();
        System.out.println();

        System.out.println("Отправка нескольких сообщений");
        testEmailNotificationsMulti();
        System.out.println();
        testSmsNotificationsMulti();
        System.out.println();
        testPushNotificationsMulti();
        System.out.println();
    }

    public static void testEmailNotifications() {
        System.out.println("EMAIL");
        EmailNotification notification = new EmailNotification("Успешная регистрация!", "Спасибо за регистрацию на сервисе!");
        notification.addRecipient("oleg@java.skillbox.ru");
        notification.addRecipient("olegjava.skillbox.ru");
        notification.addRecipients(Arrays.asList("masha@java.skillbox.ru", "yan@java.skillbox.ru"));
        EmailNotificationSender sender = new EmailNotificationSender();
        sender.send(notification);
    }

    public static void testSmsNotifications() {
        System.out.println("SMS");
        SmsNotification notification = new SmsNotification("Спасибо за регистрацию на сервисе!");
        notification.setRecipient("+70001234567");
        SmsNotificationSender sender = new SmsNotificationSender();
        sender.send(notification);
    }

    public static void testPushNotifications() {
        System.out.println("PUSH");
        PushNotification notification = new PushNotification("Успешная регистрация!", "Спасибо за регистрацию на сервисе!");
        notification.setAccount("o.yanovich");
        PushNotificationSender sender = new PushNotificationSender();
        sender.send(notification);
    }

    public static void testEmailNotificationsMulti() {
        System.out.println("EMAIL - Multi");
        EmailNotification notification = new EmailNotification("Вход в систему", "Первый вход в систему!");
        notification.addRecipient("oleg@java.skillbox.ru");
        EmailNotification notification2 = new EmailNotification("Подтвержение регистрации", "Подтвердите электронную почту, после регистрации.");
        notification2.addRecipients(Arrays.asList("masha@java.skillbox.ru", "yan@java.skillbox.ru"));
        EmailNotificationSender sender = new EmailNotificationSender();
        sender.send(Arrays.asList(notification, notification2));
    }

    public static void testSmsNotificationsMulti() {
        System.out.println("SMS - Multi");
        SmsNotification notification = new SmsNotification("Первый вход в систему!");
        notification.setRecipient("+70001234567");
        SmsNotification notification2 = new SmsNotification("Подтвердите электронную почту, после регистрации.");
        notification2.setRecipients(Arrays.asList("+70001234567", "+70001674587"));
        SmsNotificationSender sender = new SmsNotificationSender();
        sender.send(Arrays.asList(notification, notification2));
    }

    public static void testPushNotificationsMulti() {
        System.out.println("PUSH - Multi");
        PushNotification notification = new PushNotification("Успешная регистрация!", "Спасибо за регистрацию на сервисе!");
        notification.setAccount("o.yanovich");
        PushNotification notification2 = new PushNotification("Подтвержение регистрации", "Подтвердите электронную почту, после регистрации.");
        notification2.setAccount("o.yanovich");
        PushNotificationSender sender = new PushNotificationSender();
        sender.send(Arrays.asList(notification, notification2));

    }
}
