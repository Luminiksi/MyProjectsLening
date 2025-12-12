package main.try_2.hometasks.lesson_9;

import main.try_2.myFeatures.Printer;

import java.util.Scanner;

public class Lesson_9_3 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Printer.printLessonNumber(3, 9);
        Printer.printLessonName("Преобразование чисел в строки и обратно");

        Printer.printTaskNumber(1);
        Printer.printDescription("Доп. задание");
        Printer.printTaskName("Задание 1. Создайте консольное приложение, которое будет вычислять значения простых арифметических выражений");
        task1();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String value1 = scanner.nextLine();
            if (value1.equals("exit")) {
                break;
            }
            String operation = scanner.nextLine();
            String value2 = scanner.nextLine();
            System.out.println(calculation(value1, value2, operation));
        }
    }

    public static String calculation(String value1, String value2, String operation) {
        int a = Integer.parseInt(value1);
        int b = Integer.parseInt(value2);
        String result = switch (operation) {
            case "+" -> String.format("%d + %d = %d", a, b, a + b);
            case "-" -> String.format("%d - %d = %d", a, b, a - b);
            case "*" -> String.format("%d * %d = %d", a, b, a * b);
            case "/" -> String.format("%d * %d = %d", a, b, a / b);
            default -> "Неизвестная операция...";
        };
        return result;
    }
}
