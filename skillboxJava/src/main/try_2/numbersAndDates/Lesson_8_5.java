package main.try_2.numbersAndDates;

import main.try_2.myFeatures.Printer;

public class Lesson_8_5 {

    public static final double EPSILON = 0.00000000001;

    public static void run() {
        Printer.printLessonNumber(5, 8);
        Printer.printLessonName("Точность вычислений");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Пример не точности с double");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Пример не точности с float");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Пример не точности с PI");
        task3();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Сравнение чисел с плавающей точкой");
        task4();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Сравнение чисел с плавающей точкой и тип long(не точность double)");
        task5();
    }

    public static void task1() {
        double value = 24.0 * 0.1;
        System.out.println(value);
    }

    public static void task2() {
        float value = 0.3f + 0.4f;
        System.out.println(value);
    }

    public static void task3() {
        System.out.println(Math.PI);
        System.out.println((float) Math.PI);
    }

    public static void task4() {
        double value1 = 2.0 - 1.1;
        double value2 = 0.9;
        System.out.println(value1 + " = " + value2);

        System.out.println("Сравнение с помощью ==");
        boolean comparison = value1 == value2;
        System.out.println(comparison);

        System.out.println("Сравнение с помощью epsilon");
        boolean comparisonTrue = Math.abs(value1 - value2) < EPSILON;
        System.out.println(comparisonTrue);
    }

    public static void task5() {
        long valueL = 100_000_000_000_000_000L;
        double valueD = 100_000_000_000_000_000.0;
        System.out.println(valueL + " = " + valueD);
        double valueD2 = 100_000_000_000_000_001.0;
        System.out.println("double = 100_000_000_000_000_001.0");
        System.out.println(valueL + " = " + valueD2);
        double valueD3 = 100_000_000_000_000_010.0;
        System.out.println("double = 100_000_000_000_000_010.0");
        System.out.println(valueL + " = " + valueD3);
    }
}
