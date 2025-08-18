package main.try_2.cycles;

import main.try_1.myFeatures.Printer;

import java.util.Scanner;

public class Lesson_3_3 {
    public static void run() {
        Printer.printLessonNumber(3, 3);
        Printer.printLessonName("Циклы “while” и “do while”");
        Printer.printDescription("Из лекции");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Цикл с помощью while");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Цикл с помощью for");
        Printer.printDescription("Не рекомендуется так делать");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Проверка пин-кода");
        task3();
    }

    public static void task1() {
        int sum = 0;
        int value = -1;

        while (value != 0) {
            value = new Scanner(System.in).nextInt();
            sum += value;
        }
        System.out.println("Сумма введенных чисел равно: " + sum);
    }

    public static void task2() {
        int sum = 0;

        for (int value = -1; value != 0; ) {
            value = new Scanner(System.in).nextInt();
            sum += value;
        }

        System.out.println("Сумма введенных чисел равно: " + sum);
    }

    public static void task3() {
        int secretPinCode = 7567;
        int pinCode = -1;

        while (pinCode != secretPinCode) {
            if (pinCode == -1) {
                System.out.println("Введите PIN-код: ");
            } else {
                System.out.println("PIN-код введен не верно. Введите верный PIN-код: ");
            }

            pinCode = new Scanner(System.in).nextInt();
        }

        System.out.println("PIN-код введен верно!!!");
    }
}
