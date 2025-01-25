package hometasks.practics.part3.lesson2;

import myFeatures.Printer;

public class Task1 {
    public static void run() {
        Printer.printLessonNumber(3, 2);
        Printer.printPracticeInfo();
        Printer.printTaskNumber(1);
        Printer.printTaskName("Написать цикл, который будет выводить числа от 0 до 10");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Написать цикл, который будет выводить числа от 5 до 15");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Написать цикл, который будет выводить числа от 10 до 0");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Написать цикл, который будет выводить числа от 17 до 9");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Написать цикл, который будет выводить чётные числа от 0 до 10");
        task5();
    }

    public static void task1() {
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2() {
        for (int i = 5; i <= 15; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task3() {
        for (int i = 10; i >= 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task4() {
        for (int i = 17; i >= 9; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5() {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }
}
