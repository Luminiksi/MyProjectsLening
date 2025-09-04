package main.try_2.methods;

import main.try_1.myFeatures.Printer;

import java.time.LocalDateTime;

public class Lesson_4_2 {
    public static int i = 0;
    public static int max = 10;

    public static void run() {
        Printer.printLessonNumber(2, 4);
        Printer.printLessonName("Методы");
        Printer.printDescription("Практика");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Создайте метод, который будет выводить в консоль текущую дату и текущее время");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Создайте метод, вызывающий сам себя");
        task2();
    }

    public static void task1() {
        printCurrentDateTime();
    }

    public static void task2() {
        iterate();
    }

    public static void printCurrentDateTime() {
        System.out.print("Дата и время: ");
        System.out.println(LocalDateTime.now());
    }

    public static void iterate() {
        if (i < max) {
            i = i + 1;
            System.out.println(i);
            iterate();
        }
    }


}
