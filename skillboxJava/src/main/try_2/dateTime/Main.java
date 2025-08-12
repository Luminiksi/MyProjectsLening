package main.try_2.dateTime;

import main.try_2.myFeatures.Printer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Printer.printLessonNumber(14, 1);
        Printer.printLessonName("Практическая работа");
        Printer.printTaskNumber(3);
        Printer.printTaskName("Задание 3");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));

    }
}
