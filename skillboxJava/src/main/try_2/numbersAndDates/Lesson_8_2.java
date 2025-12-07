package main.try_2.numbersAndDates;

import main.try_2.myFeatures.Printer;

public class Lesson_8_2 {

    public static void run() {
        Printer.printLessonNumber(2, 8);
        Printer.printLessonName("Операции с числами");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Работа с дробными числами -> 5/2");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Работа с целыми числами -> 5/2");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Работа с целыми числами (остаток от деления) -> 5/2");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Операции с присваениями (деление)");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Операции с присваениями (остаток от деления)");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Оператор сравнения ==");
        task6();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Оператор сравнения == с присваением");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Оператор сравнения < с присваением");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Оператор сравнения >= с присваением");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        Printer.printTaskName("Работа с Math");
        task9();
    }

    public static void task1() {
        double value = 5.0 / 2;
        System.out.println(value);
    }

    public static void task2() {
        int value = 5 / 2;
        System.out.println(value);
    }

    public static void task3() {
        int value = 5 % 2;
        System.out.println(value);
    }

    public static void task4() {
        int value = 55;
        value /= 11;
        System.out.println(value);
    }

    public static void task5() {
        int value = 55;
        value %= 49;
        System.out.println(value);
    }

    public static void task6() {
        double a = 5.674;
        double b = 5.674;
        if (a == b) {
            System.out.println("a equals b");
        }
    }

    public static void task7() {
        double a = 5.674;
        double b = 5.874;
        boolean comparison = a < b;
        if (comparison) {
            System.out.println("a is less than b");
        }
    }

    public static void task8() {
        double a = 5.674;
        double b = 5.874;
        boolean comparison = a >= b;
        if (!comparison) {
            System.out.println("a is less than b");
        }
    }

    public static void task9() {
        System.out.println("Модуль:");
        System.out.println(Math.abs(-21342));
        System.out.println("Максимальное число:");
        System.out.println(Math.max(4, 6));
        System.out.println("Возведение в степень(2 в 6):");
        System.out.println(Math.pow(2, 6));
        System.out.println("Квадратный корень(из 625)");
        System.out.println(Math.sqrt(625));
        System.out.println("Округление по математическим правилам(3.54)");
        System.out.println(Math.round(3.54));
        System.out.println("Генерация случайного числа (от 0 до 1, но не включая 1)");
        System.out.println(Math.random());
    }
}
