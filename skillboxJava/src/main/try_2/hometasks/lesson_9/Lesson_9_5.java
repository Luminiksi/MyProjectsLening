package main.try_2.hometasks.lesson_9;

import main.try_2.myFeatures.Printer;

import java.util.Scanner;

public class Lesson_9_5 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Printer.printLessonNumber(5, 9);
        Printer.printLessonName("Методы работы с подстроками");

        Printer.printTaskNumber(1);
        Printer.printDescription("Доп. задание");
        Printer.printTaskName("Задание 1. Напишите консольное приложение, разделяющее строку с фамилией, именем и отчеством на компоненты");
        //task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printDescription("Доп. задание");
        Printer.printTaskName("Задание 2. Напишите приложение, извлекающее из строки заработные платы людей и суммирующее их");
        task2();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        separatorSplit(str);
        System.out.println();
        separator(str);
    }

    public static void task2() {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(sumSplit(text));
        System.out.println();
        System.out.println(sum(text));
    }

    public static int sumSplit(String str) {
        System.out.println("Разделение с помощью split:");
        str = str.trim();
        String[] strArray = str.split(" ");
        int sum = 0;
        for (int i = 0; i < strArray.length; i++) {
            sum += getInt(strArray[i]);
        }
        return sum;
    }

    public static int sum(String str) {
        System.out.println("Разделение с помощью substring:");
        str = str.trim();
        int sum = 0;
        int startIndex = 0;

        while (startIndex < str.length()) {
            int lastIndex = str.indexOf(" ", startIndex);
            String subStr;
            if (lastIndex < 0) {
                subStr = str.substring(startIndex);
                sum += getInt(subStr);
                break;
            }
            subStr = str.substring(startIndex, lastIndex);
            sum += getInt(subStr);
            startIndex = lastIndex + 1;
        }
        return sum;
    }

    public static int getInt(String str) {
        boolean isDigit = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isDigit = false;
                break;
            }
        }
        if (isDigit) {
            return Integer.parseInt(str);
        }
        return 0;
    }


    public static void separatorSplit(String str) {
        System.out.println("Разделение с помощью split:");
        str = str.trim();
        String[] strArray = str.split(" ");
        if (strArray.length == 3) {
            printFIO(strArray[0], strArray[1], strArray[2]);
        } else {
            printErrorInfo();
        }
    }

    public static void separator(String str) {
        System.out.println("Разделение с помощью substring:");
        str = str.trim();

        int index = str.indexOf(" ");
        if (index <= 0) {
            printErrorInfo();
            return;
        }
        String lastName = str.substring(0, index);

        int lastIndex = str.indexOf(" ", index + 1);
        if (lastIndex < 0) {
            printErrorInfo();
            return;
        }
        String firstName = str.substring(index + 1, lastIndex);

        if (lastIndex + 1 >= str.length()) {
            printErrorInfo();
            return;
        }
        String middleName = str.substring(lastIndex + 1);

        printFIO(lastName, firstName, middleName);
    }

    public static void printFIO(String lastName, String name, String middleName) {
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + middleName);
    }

    public static void printErrorInfo() {
        System.out.println("Нужно вводить по шаблону:");
        System.out.println("Фамилия Имя Отчество");
    }
}
