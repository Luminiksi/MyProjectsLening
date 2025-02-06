package prictice;

import java.util.Scanner;

public class StringExperiments3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите первое число: ");
            String a = scanner.next();
            System.out.print("Введите операцию:");
            String operation = scanner.next();
            System.out.print("Введите второе число: ");
            String b = scanner.next();
            System.out.println(operations(a, b, operation));
        }
    }

    public static String operations(String a, String b, String operation) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        operation = operation.trim();
//        почему-то идея подчеркивает как ошибка, но все хорошо работает...
        String result = switch (operation) {
            case "+" -> num1 + " + " + num2 + " = " + (num1 + num2);
            case "-" -> num1 + " - " + num2 + " = " + (num1 - num2);
            case "*" -> num1 + " * " + num2 + " = " + (num1 * num2);
            case "/" -> num1 + " / " + num2 + " = " + (num1 / num2);
            default -> "Неизвестная операция...";
        };
        return result;
    }
}
