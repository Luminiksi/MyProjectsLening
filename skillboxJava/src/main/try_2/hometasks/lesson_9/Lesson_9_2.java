package main.try_2.hometasks.lesson_9;

import main.try_2.myFeatures.Printer;
import main.try_2.strings.Product;
import main.try_2.strings.ProductConcat;
import main.try_2.strings.ProductWithoutString;

import java.time.LocalDate;
import java.util.Scanner;

public class Lesson_9_2 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Printer.printLessonNumber(2, 9);
        Printer.printLessonName("Строки, конкатенация и сравнение");

        Printer.printTaskNumber(1);
        Printer.printDescription("Доп. задание");
        Printer.printTaskName("Задание 1");
        task1();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String value1 = scanner.nextLine();
            if (value1.equals("exit")) {
                break;
            }
            String value2 = scanner.nextLine();
            if (value1.equals(value2)) {
                System.out.println(value1 + " == " + value2);
            } else {
                System.out.println(value1 + " != " + value2);
            }
        }
    }

}
