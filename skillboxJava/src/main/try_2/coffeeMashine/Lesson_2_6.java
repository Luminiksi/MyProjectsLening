package main.try_2.coffeeMashine;

import main.try_1.myFeatures.Printer;

public class Lesson_2_6 {
    public static void run() {
        Printer.printLessonNumber(6, 2);
        Printer.printLessonName("Вложенные условия");
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
        System.out.println();
    }

    public static void task1() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowlactoseMilkAmount = 1000;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        boolean isBlocked = true;

        boolean milkIsEnough = skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired ||
                lowlactoseMilkAmount >= cappuchinoMilkRequired;
        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        if (!isBlocked) {
            System.out.println("Кофе-машина заблокирована");
        } else {
            if (coffeeIsEnough && milkIsEnough) {
                System.out.println("Готовим кофе");
            } else {
                if (!coffeeIsEnough) {
                    System.out.println("Кофе недостаточно");
                }

                if (!milkIsEnough) {
                    System.out.println("Молока недостаточно");
                }
            }
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

        boolean milkIsEnough = skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired ||
                lowlactoseMilkAmount >= cappuchinoMilkRequired;
        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
        } else {
            if (coffeeIsEnough && milkIsEnough) {
                System.out.println("Готовим кофе");
            }

            if (!coffeeIsEnough) {
                System.out.println("Кофе недостаточно");
            }

            if (!milkIsEnough) {
                System.out.println("Молока недостаточно");
            }
        }
    }

    public static void task3() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowlactoseMilkAmount = 1000;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        boolean isBlocked = true;

        boolean milkIsEnough = skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired ||
                lowlactoseMilkAmount >= cappuchinoMilkRequired;
        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
        } else if (coffeeIsEnough && milkIsEnough) {
            System.out.println("Готовим кофе");
        } else if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно");
        } else if (!milkIsEnough) {
            System.out.println("Молока недостаточно");
        }
    }

    public static void task4() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowlactoseMilkAmount = 1000;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        boolean isBlocked = true;

        boolean milkIsEnough = skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired ||
                lowlactoseMilkAmount >= cappuchinoMilkRequired;
        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
            hasErrors = true;
        }
        if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;
        }
        if (!milkIsEnough) {
            System.out.println("Молока недостаточно");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}
