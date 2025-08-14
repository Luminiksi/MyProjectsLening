package main.try_2.cycles;

import main.try_1.myFeatures.Printer;

public class LessonTasks_3_2 {
    public static void run() {
        Printer.printLessonNumber(2, 3);
        Printer.printLessonName("Цикл “for”");
        Printer.printDescription("Доп. задания к уроку");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Задание 1. Написать цикл, который будет выводить числа от 0 до 10");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Задание 2. Написать цикл, который будет выводить числа от 5 до 15");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Задание 3. Написать цикл, который будет выводить числа от 10 до 0");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Задание 4. Написать цикл, который будет выводить числа от 17 до 9");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Задание 5. Написать цикл, который будет выводить чётные числа от 0 до 10");
        task5();
    }

    public static void task1() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }
    }

    public static void task3() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void task4() {
        for (int i = 17; i >= 9; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
