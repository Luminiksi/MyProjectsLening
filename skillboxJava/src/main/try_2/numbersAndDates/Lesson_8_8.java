package main.try_2.numbersAndDates;

import main.try_2.myFeatures.Printer;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Lesson_8_8 {
    public static void run() {
        Printer.printLessonNumber(8, 8);
        Printer.printLessonName("Метка времени (timestamp)");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Использование currentTimeMillis в измеренеи времени работы кода");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Преобразование метки времени в дату - LocalDateTime.ofEpochSecond");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Получаем метку времени из даты");
        task3();
    }

    public static void task1() {
        long start = System.currentTimeMillis();
        String line = "";
        for (int i = 0; i < 100_000; i++) {
            line += Math.random();
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void task2() {
        System.out.println("Передаем -> 1 - время в секундах(поэтому милисекунды делим на 1000), " +
                "2 - время в нано секундах, 3 - часовой пояс (можно использовать - ZoneOffset.ofHours(3) для Москвы)");
        LocalDateTime now = LocalDateTime.ofEpochSecond(System.currentTimeMillis() / 1000, 0, ZoneOffset.ofHours(3));
        System.out.println(now);
    }

    public static void task3() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toEpochSecond(ZoneOffset.ofHours(3)));
    }
}
