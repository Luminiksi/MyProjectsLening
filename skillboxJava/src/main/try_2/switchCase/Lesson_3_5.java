package main.try_2.switchCase;

import main.try_1.myFeatures.Printer;

import java.util.Scanner;

public class Lesson_3_5 {
    public static void run() {
        Printer.printLessonNumber(5, 3);
        Printer.printLessonName("Оператор “switch … case”");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Без использования switch");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("С использования switch (старый вариант использования)");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("С использования switch (новый вариант использования)");
        Printer.printDescription("Начиная с Java 14");
        task3();
    }

    public static void task1() {
        System.out.println("Введите сообщение:");
        String input = new Scanner(System.in).nextLine();

        if (input.equals("Привет!")) {
            System.out.println("Привет! =)");
        } else if (input.equals("Как дела?")) {
            System.out.println("Отлично! У тебя как?");
        } else {
            System.out.println("Не понимаю сообщение =(");
        }
    }

    public static void task2() {
        System.out.println("Введите сообщение:");
        String input = new Scanner(System.in).nextLine();

        switch (input) {
            case "Привет!" :
                System.out.println("Привет! =)");
                break;
            case "Как дела?" :
                System.out.println("Отлично! У тебя как?");
                break;
            default :
                System.out.println("Не понимаю сообщение =(");
        }
    }

    public static void task3() {
        System.out.println("Введите сообщение:");
        String input = new Scanner(System.in).nextLine();

        switch (input) {
            case "Привет!" -> System.out.println("Привет! =)");
            case "Как дела?" -> {
                System.out.println("Отлично! У тебя как?");
                System.out.println("У тебя как?");
            }
            default -> System.out.println("Не понимаю сообщение =(");
        }
    }
}
