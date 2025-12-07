package main.try_2.hometasks.lesson_8;

import main.try_2.myFeatures.Printer;

public class Lesson_8_2 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Printer.printLessonNumber(2, 8);
        Printer.printLessonName("Операции с числами");

        Printer.printTaskNumber(1);
        Printer.printDescription("Доп. задание");
        Printer.printTaskName("Задание 1. Напишите метод расчёта количества кассет с деньгами, вставляемых в банкомат");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printDescription("Доп. задание");
        Printer.printTaskName("Задание 2. Реализуйте класс для расчёта различных параметров геометрических фигур");
        task2();
        System.out.println();
    }

    public static void task1() {
        System.out.println("Проверено тестами");
        System.out.println(MoneyCalculator.calculateCassetteCount(1999));
        System.out.println(MoneyCalculator.calculateCassetteCount(2000));
        System.out.println(MoneyCalculator.calculateCassetteCount(2001));
        System.out.println(MoneyCalculator.calculateCassetteCount(2500));
        System.out.println(MoneyCalculator.calculateCassetteCount(4000));
        System.out.println(MoneyCalculator.calculateCassetteCount(4001));
    }

    public static void task2() {

    }
}
