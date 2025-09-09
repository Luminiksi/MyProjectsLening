package main.try_2.methods;

import main.try_1.myFeatures.Printer;

public class Lesson_4_4 {

    public static void run() {
        Printer.printLessonNumber(4, 4);
        Printer.printLessonName("Возвращаемые значения");
        Printer.printDescription("Практика");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Напишите метод, рассчитывающий и возвращающий сумму трёх переданных ему в качестве параметров чисел");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Напишите метод, возвращающий большее из двух переданных ему в качестве параметров чисел");
        task2();
    }

    public static void task1() {
        int sum = calculateSum(300, 200, 700);
        System.out.println(sum);
    }

    public static void task2() {
        int maxNumber = max(300, 10);
        System.out.println(maxNumber);
    }

    public static int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
}
