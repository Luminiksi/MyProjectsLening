package main.try_1.coffeMachine.lessons;

import main.try_1.myFeatures.Printer;

public class Lesson5 {
    public static void run() {
        Printer.printLessonNumber(5, 2);
        Printer.printLessonName("Преоритеты и скобки в условиях");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
    }

    public static void task1() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilkAmount = 1000;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;
        boolean isBlocked = true;

        if (milkAmount >= cappucinoMilkRequired ||
                skimmedMilkAmount >= cappucinoMilkRequired ||
                lowLactoseMilkAmount >= cappucinoMilkRequired) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так :(");
        }
    }

    public static void task2() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilkAmount = 1000;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;
        boolean isBlocked = true;

//        Что если такое условие, посмотрим на булевых(ниже
        /*if (!isBlocked && coffeeAmount >= cappucinoCoffeeRequired &&
                milkAmount >= cappucinoMilkRequired ||
                skimmedMilkAmount >= cappucinoMilkRequired) */
        if (true && true && false || true) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так :(");
        }
    }

    public static void task3() {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;
        boolean isBlocked = true;

        boolean milkIsEnough = milkAmount >= cappucinoMilkRequired ||
                skimmedMilkAmount >= cappucinoMilkRequired;
        boolean coffeIsEnogh = coffeeAmount >= cappucinoCoffeeRequired;

        if (!isBlocked && coffeIsEnogh && milkIsEnough) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так :(");
        }
    }
}
