package main.try_2.cycles;

import main.try_1.myFeatures.Printer;

import java.util.Scanner;

public class LessonTasks_3_3 {

    public static void run() {
        Printer.printLessonNumber(3, 3);
        Printer.printLessonName("Циклы “while” и “do while”");
        Printer.printDescription("Доп. задания к уроку");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Задание 1. Код с циклом while");
        task1();
    }

    public static void task1() {
        int sum = 0;
        System.out.println("Введите число и нажмите <Enter>:");
        while (true) {
            int value = new Scanner(System.in).nextInt();
            if (value > 0) {
                sum += value;
                System.out.println("Сумма: " + sum);
                System.out.println("Введите ещё одно число или 0 для сбросса суммы: ");
            } else if (value == 0) {
                sum = 0;
                System.out.println("Сумма сброшена. Введите новое число: ");
            } else if (value == -1) {
                System.out.println("Выход из программы...");
                break;
            }
        }
    }
}
