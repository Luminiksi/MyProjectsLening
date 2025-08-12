package main.try_1.coffeMachine.lessons;

import main.try_1.myFeatures.Printer;

public class Lesson4 {
    public static void run() {
        Printer.printLessonNumber(4, 2);
        Printer.printLessonName("Булевы операции");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        task4();
    }

    public static void task1() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        if (coffeeAmount >= cappucinoCoffeeRequired &&
                milkAmount >= cappucinoMilkRequired) {
            System.out.println("Готовим капучино");
        } else {
            System.out.println("Ингредиентов недостаточно :(");
        }
    }

    public static void task2() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        if (skimmedMilkAmount >= cappucinoMilkRequired ||
                milkAmount >= cappucinoMilkRequired) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Молока недостаточно :(");
        }
    }

    public static void task3() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;
        boolean isBlocked = true;

        if (!isBlocked) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Кофе-машина заблокирована");
        }
    }

    public static void task4() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;
        boolean isBlocked = true;

        if (!isBlocked && milkAmount >= cappucinoMilkRequired &&
                coffeeAmount >= cappucinoCoffeeRequired) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Кофе-машина заблокирована");
        }
    }
}
