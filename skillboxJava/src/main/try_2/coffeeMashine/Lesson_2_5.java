package main.try_2.coffeeMashine;

import main.try_1.myFeatures.Printer;

public class Lesson_2_5 {
    public static void run() {
        Printer.printLessonNumber(5, 2);
        Printer.printLessonName("Приоритеты и скобки в условиях");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
    }

    public static void task1() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowlactoseMilkAmount = 1000;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        boolean isBlocked = false;

        if (skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired ||
                lowlactoseMilkAmount >= cappuchinoMilkRequired) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Молока не достаточно");
        }
    }

    public static void task2() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowlactoseMilkAmount = 1000;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        boolean isBlocked = true;

        if (!isBlocked && coffeeAmount >= cappuchinoCoffeeRequired &&
                (skimmedMilkAmount>= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired ||
                lowlactoseMilkAmount >= cappuchinoMilkRequired)) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Сообщение об ошибке");
        }
    }
}
