package main.try_1.hometasks.practics.part2.lesson4;

import main.try_1.myFeatures.Printer;

public class Task3 {
    public static void run() {
        Printer.printLessonNumber(3, 2);
        Printer.printPracticeInfo();
        Printer.printTaskNumber(1);
        Printer.printAttemptNumber(1);
        task1();
        Printer.printAttemptNumber(2);
        task2();
    }

    public static void task1() {
        boolean isDeliveryFree = false;
        if (!isDeliveryFree) {
            System.out.println("Доставка платна");
        }
    }

    public static void task2() {
        boolean isDeliveryFree = true;
        if (!isDeliveryFree) {
            System.out.println("Доставка платна");
        }
    }
}
