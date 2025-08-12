package main.try_1.hometasks.practics.part2.lesson3;

import main.try_1.myFeatures.Printer;

public class Task2 {
    public static void run(){
        Printer.printLessonNumber(3, 2);
        Printer.printPracticeInfo();
        Printer.printTaskNumber(2);
        Printer.printAttemptNumber(1);
        task1();
        Printer.printAttemptNumber(2);
        task2();
    }

    public static void task1() {
        int count = 150;
        if (count < 100) {
            System.out.println("Мало");
        } else {
            System.out.println("Много");
        }
    }

    public static void task2() {
        int count = 50;
        if (count < 100) {
            System.out.println("Мало");
        } else {
            System.out.println("Много");
        }
    }
}
