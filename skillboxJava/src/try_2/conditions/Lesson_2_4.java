package try_2.conditions;

import try_2.myFeatures.Printer;

public class Lesson_2_4 {
    public static void run() {
        Printer.printLessonNumber(4, 2);
        Printer.printTaskName("Булевы операции");
        Printer.printDescription("Практика");

        Printer.printTaskNumber(1);
        Printer.printTaskName("1. Напишите код с использованием булева оператора “И”");
        task1();
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Задание 2. Напишите код с использованием булева оператора “ИЛИ”");
        task2();
        System.out.println();

        Printer.printTaskNumber(3);
        Printer.printTaskName("Задание 3. Напишите код с использованием булева оператора “НЕ”");
        task3();
    }

    public static void task1() {
        int weight = 3200;
        int cost = 1750;
        System.out.println("Со значениями weight = " + weight + ", cost = " + cost);
        check(weight, cost);

        weight = 6000;
        System.out.println("Со значениями weight = " + weight + ", cost = " + cost);
        check(weight, cost);

        weight = 3200;
        cost = 750;
        System.out.println("Со значениями weight = " + weight + ", cost = " + cost);
        check(weight, cost);
    }

    public static void check(int weight, int cost) {
        int maxWeight = 5000;
        int minCost = 1000;

        if (weight <= maxWeight && cost >= minCost) {
            System.out.println("Доставка бесплатная");
        }
    }

    public static void task2() {
        int weight = 3200;
        int cost = 1750;
        System.out.println("Со значениями weight = " + weight + ", cost = " + cost);
        check2(weight, cost);

        weight = 6000;
        System.out.println("Со значениями weight = " + weight + ", cost = " + cost);
        check2(weight, cost);

        weight = 3200;
        cost = 750;
        System.out.println("Со значениями weight = " + weight + ", cost = " + cost);
        check2(weight, cost);
    }

    public static void check2(int weight, int cost) {
        int maxWeight = 5000;
        int minCost = 1000;

        if (weight > maxWeight || cost < minCost) {
            System.out.println("Доставка платная");
        }
    }

    public static void task3() {
        boolean isDeliveryFree = false;
        if (!isDeliveryFree) {
            System.out.println("Доставка платная");
        }
    }
}
