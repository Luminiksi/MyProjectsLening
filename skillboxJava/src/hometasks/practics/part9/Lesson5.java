package hometasks.practics.part9;

import myFeatures.Printer;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Printer.printLessonNumber(5, 9);
        Printer.printPracticeInfo();
        Printer.printTaskNumber(1);
        Printer.printTaskName("Напишите консольное приложение, разделяющее строку с фамилией, именем и отчеством на компоненты");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("ННапишите приложение, извлекающее из строки заработные платы людей и суммирующее их");
        task2();
        System.out.println();
    }

    public static void task1() {
        System.out.println("Введите ФИО");
        String str = new Scanner(System.in).nextLine();
        str = str.trim();
        int end = str.indexOf(' ');
        if (end < 0) {
            if (!str.isBlank()) {
                printFIO(str, "-", "-");
            } else {
                System.out.println("Вы ничего не ввели...");
            }
            return;
        }
        String lastName = str.substring(0, end);
        int start = end + 1;
        end = str.indexOf(" ", start);
        String name;
        if (end < 0 && str.length() > start) {
            name = str.substring(start);
            printFIO(lastName, name, "-");
            return;
        } else if (end < 0) {
            printFIO(lastName, "-", "-");
            return;
        }
        name = str.substring(start, end);
        String middleName = str.substring(end + 1);
        printFIO(lastName, name, middleName);
    }

    public static void printFIO(String lastName, String name, String middleName) {
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + middleName);
    }

    public static void task2() {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int summ = 0;
        int start = 0;
        while (true) {
            int end = text.indexOf(" ", start);
//            Делю такое условие, потому что в строке число не последнее слово, иначе это условие надо ещё дописывать
            if (end < 0) {
                break;
            }
            boolean isDigit = Character.isDigit(text.charAt(start));
            if (isDigit) {
                String number = text.substring(start, end);
                summ += Integer.parseInt(number);
            }
            start = end + 1;
        }
        System.out.println("Сумма из строки равна " + summ);
    }
}
