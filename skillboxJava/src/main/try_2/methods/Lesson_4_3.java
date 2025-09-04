package main.try_2.methods;

import main.try_1.myFeatures.Printer;

import java.util.Scanner;

public class Lesson_4_3 {
    public static void run() {
        Printer.printLessonNumber(3, 4);
        Printer.printLessonName("Параметры методов");
        Printer.printDescription("Практика");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Напишите метод с одним параметром");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Напишите метод с несколькими параметрами");
        task2();
    }

    public static void task1() {
        System.out.println("Введите число и нажмите <Enter>: ");
        double value = new Scanner(System.in).nextDouble();
        square(value);
    }

    public static void square(double value) {
        System.out.println(value * value);
    }


    public static void task2() {
        calculateTriangleSquare(3, 4, 5);
    }

    public static void calculateTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(square);
    }
}
