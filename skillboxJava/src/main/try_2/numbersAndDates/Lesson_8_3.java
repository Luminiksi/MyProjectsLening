package main.try_2.numbersAndDates;

import main.try_2.myFeatures.Printer;

public class Lesson_8_3 {

    public static void run() {
        Printer.printLessonNumber(3, 8);
        Printer.printLessonName("Инкремент и декремент");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Инкремент");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Декремент");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Инкремент с символами");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Инкремент максимального значения");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Декремент минимального значения");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Пре и пост инкремент");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Постинкремент");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Преинкремент");
        task8();
        System.out.println();
    }

    public static void task1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        char c = 'b';
        c++;
        System.out.println(c);
    }

    public static void task4() {
        Integer value = Integer.MAX_VALUE;
        value++;
        System.out.println(value);
    }

    public static void task5() {
        Integer value = Integer.MIN_VALUE;
        value--;
        System.out.println(value);
    }

    public static void task6() {
        int value = 10;
        int post = value++;
        System.out.println(post + " - " + value);
        int pre = ++value;
        System.out.println(pre + " - " + value);
    }

    public static void task7() {
        for (int i = 0; i < 10;) {
            System.out.println(i++);
        }
    }

    public static void task8() {
        for (int i = 0; i < 10;) {
            System.out.println(++i);
        }
    }
}
