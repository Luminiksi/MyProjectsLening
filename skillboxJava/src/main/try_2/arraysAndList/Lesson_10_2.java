package main.try_2.arraysAndList;

import main.try_2.myFeatures.Printer;

public class Lesson_10_2 {

    public static void run() {
        Printer.printLessonNumber(2, 10);
        Printer.printLessonName("Создание массивов");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Работа с массивами");
        task1();
    }

    public static void task1() {
        int[] floors = {3, 10, 17, 22, 16, 14};
        System.out.println(floors[3]);
        System.out.println(floors.length);
        floors[0] = 555;
        System.out.println(floors[0]);
    }
}
