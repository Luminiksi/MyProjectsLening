package try_1.hometasks.practics.part2.lesson4;

import try_1.myFeatures.Printer;

public class Task1 {
    public static void run() {
        Printer.printLessonNumber(3, 2);
        Printer.printPracticeInfo();
        Printer.printTaskNumber(1);
        Printer.printAttemptNumber(1);
        task1();
        Printer.printAttemptNumber(2);
        task2();
        Printer.printAttemptNumber(3);
        task3();
    }

    public static void task1() {
        int maxWeight = 5000;
        int minCost = 1000;

        int weight = 3200;
        int cost = 1750;

        if (weight <= maxWeight && cost > minCost) {
            System.out.println("Доставка бесплатная");
        }
    }

    public static void task2() {
        int maxWeight = 5000;
        int minCost = 1000;

        int weight = 6000;
        int cost = 1750;

        if (weight <= maxWeight && cost > minCost) {
            System.out.println("Доставка бесплатная");
        }
    }

    public static void task3() {
        int maxWeight = 5000;
        int minCost = 1000;

        int weight = 3200;
        int cost = 750;

        if (weight <= maxWeight && cost > minCost) {
            System.out.println("Доставка бесплатная");
        }
    }
}
