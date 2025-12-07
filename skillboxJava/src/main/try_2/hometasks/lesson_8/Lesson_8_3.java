package main.try_2.hometasks.lesson_8;

import main.try_2.myFeatures.Printer;

public class Lesson_8_3 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Printer.printLessonNumber(3, 8);
        Printer.printLessonName("Инкремент и декремент");

        Printer.printTaskNumber(1);
        Printer.printDescription("Доп. задание");
        Printer.printTaskName("Задание 1. Найдите и исправьте ошибку в программном коде");
        task1();
    }

    public static void task1() {
        UsageAnalytics analytics = new UsageAnalytics();
        analytics.countVisit();
        analytics.countVisit();
        int visits = analytics.countVisit();
        System.out.println("Всего посещений: " + visits);
    }
}
