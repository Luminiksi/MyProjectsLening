package try_2.conditions;

import try_2.myFeatures.Printer;

public class Lesson_2_3 {
    public static void run() {
        Printer.printLessonNumber(3, 2);
        Printer.printTaskName("Условные операторы “if”и “else”");
        Printer.printDescription("Практика");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Задание 1. Напишите код с использованием оператора if");
        task1();
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Задание 2. Напишите код с использованием операторов if и else");
        task2();
        System.out.println();

        Printer.printTaskNumber(3);
        Printer.printTaskName("Задание 3. Напишите код с использованием операторов if, else и их комбинации");
        task3();
    }

    public static void task1() {
        int count = 50;
        System.out.println("Для count = " + count);
        check(count);
        count = 150;
        System.out.println("Для count = " + count);
        check(count);

    }

    public static void check(int count) {
        if (count < 100) {
            System.out.println("Мало");
        }
    }

    public static void task2() {
        int count = 50;
        System.out.println("Для count = " + count);
        check2(count);
        count = 150;
        System.out.println("Для count = " + count);
        check2(count);
    }

    public static void check2(int count) {
        if (count < 100) {
            System.out.println("Мало");
        } else {
            System.out.println("Много");
        }
    }

    public static void task3() {
        int count = 50;
        System.out.println("Для count = " + count);
        check3(count);
        count = 150;
        System.out.println("Для count = " + count);
        check3(count);
        count = 250;
        System.out.println("Для count = " + count);
        check3(count);
    }

    public static void check3(int count) {
        if (count < 100) {
            System.out.println("Мало");
        } else if (count < 200) {
            System.out.println("Средне");
        } else {
            System.out.println("Много");
        }
    }
}
