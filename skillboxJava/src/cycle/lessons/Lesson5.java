package cycle.lessons;

import myFeatures.Printer;

import java.util.Scanner;

public class Lesson5 {
    public static void run() {
        Printer.printLessonNumber(5, 3);
        Printer.printLessonName("Оператор “switch … case”");
        Printer.printDescription("Т.к. циклы бесконечны - просто описание выводим, для тестов - раскоментировать");
        Printer.printTaskNumber(1);
//        task1();
        System.out.println();
        Printer.printTaskNumber(2);
//        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printDescription("Начиная с 14 вепрсии java можно использовать этот синтаксис");
//        task3();
        System.out.println();
        Printer.printTaskNumber(4);
//        task4();
        System.out.println();
    }

    public static void task1() {
        while (true) {
            System.out.println("Введите сообщение:");
            String input = new Scanner(System.in).nextLine();

            if (input.equals("Привет!")) {
                System.out.println("Привет!)");
            } else if(input.equals("Как дела?")) {
                System.out.println("Отлично! А у тебя как?");
            } else {
                System.out.println("Не понимаю сообщение :(");
            }
        }
    }

    public static void task2() {
        while (true) {
            System.out.println("Введите сообщение:");
            String input = new Scanner(System.in).nextLine();

            switch (input){
                case "Привет!":
                    System.out.println("Привет!)");
                    break;
                case "Как дела?":
                    System.out.println("Отлично! А у тебя как?");
                    break;
                default:
                    System.out.println("Не понимаю сообщение :(");
            }
        }
    }

    public static void task3() {
        while (true) {
            System.out.println("Введите сообщение:");
            String input = new Scanner(System.in).nextLine();

            switch (input){
                case "Привет!" -> System.out.println("Привет!)");
                case "Как дела?" -> System.out.println("Отлично! А у тебя как?");
                default -> System.out.println("Не понимаю сообщение :(");
            }
        }
    }

    public static void task4() {
        while (true) {
            System.out.println("Введите сообщение:");
            String input = new Scanner(System.in).nextLine();

            switch (input){
                case "Привет!" -> System.out.println("Привет!)");
                case "Как дела?" -> {
                    System.out.println("Отлично!");
                    System.out.println("А у тебя как?");
                }
                default -> System.out.println("Не понимаю сообщение :(");
            }
        }
    }
}
