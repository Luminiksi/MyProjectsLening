package ru.skillbox;

import ru.skillbox.notification.EmailNotification;
import ru.skillbox.notification.PushNotification;
import ru.skillbox.notification.SmsNotification;
import ru.skillbox.notification_sender.EmailNotificationSender;
import ru.skillbox.notification_sender.PushNotificationSender;
import ru.skillbox.notification_sender.SmsNotificationSender;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TODO: написать работу с уведомлениями и удалить эту строку

        EmailNotification emailNotif = new EmailNotification("Успешная регистрация!",
                "Спасибо за регистрацию на сервисе!",
                new HashSet<>(Arrays.asList("oleg@java.skillbox.ru", "masha@java.skillbox.ru", "yan@java.skillbox.ru")));

        EmailNotification emailNotif2 = new EmailNotification("Успешная регистрация!",
                "Спасибо за регистрацию на сервисе!",
                new HashSet<>(Arrays.asList("oleg@java.skillbox.ru", "masha@java.skillbox.ru")));

        SmsNotification smsNotif = new SmsNotification("Спасибо за регистрацию на сервисе!", new HashSet<>(List.of("+70001234567")));
        SmsNotification smsNotif2 = new SmsNotification("Спасибо за регистрацию на сервисе!", new HashSet<>(List.of("+70001234567", "+70001234564")));

        PushNotification pushNotif = new PushNotification("Успешная регистрация!", "Спасибо за регистрацию на сервисе!", "o.yanovich");
        PushNotification pushNotif2 = new PushNotification("Успешная регистрация!", "Спасибо за регистрацию на сервисе!", "o.yanovich2");

        EmailNotificationSender emailNotifSender = new EmailNotificationSender();
        System.out.println("Выведем одно EmailNotification через метод send(EmailNotification notification:");
        emailNotifSender.send(emailNotif);
        System.out.println();
        System.out.println("Выведем несколько EmailNotification через send(List notifications):");
        emailNotifSender.send(List.of(emailNotif, emailNotif2));
        System.out.println();

        SmsNotificationSender smsNotifSender = new SmsNotificationSender();
        System.out.println("Выведем одно SmsNotification через метод send(SmsNotification notification:");
        smsNotifSender.send(smsNotif);
        System.out.println();
        System.out.println("Выведем несколько SmsNotification через send(List notifications):");
        smsNotifSender.send(List.of(smsNotif, smsNotif2));
        System.out.println();

        PushNotificationSender pushNotifSender = new PushNotificationSender();
        System.out.println("Выведем одно PushNotification через метод send(PushNotification notification:");
        pushNotifSender.send(pushNotif);
        System.out.println();
        System.out.println("Выведем несколько PushNotification через send(List notifications):");
        pushNotifSender.send(List.of(pushNotif, pushNotif2));
        System.out.println();
    }
}
