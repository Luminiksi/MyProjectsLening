package main.try_2.coffeeMashine;

import main.try_1.myFeatures.Printer;

public class Lesson_2_4 {
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
        System.out.println();
    }

    public static void task1() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        if (coffeeAmount >= cappuchinoCoffeeRequired &&
                milkAmount >= cappuchinoMilkRequired) {
            System.out.println("Готовим капучино");
        } else {
            System.out.println("Ингредиентов не достаточно =((");
        }
    }

    public static void task2() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        System.out.println("Добавим дополнительную переменную и проверим на условие || молоко:");

        int skimmedMilkAmount = 1290;

        if (skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Молока не достаточно =(( ");
        }
    }

    public static void task3() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        int skimmedMilkAmount = 1290;

        System.out.println("Добавим дополнительную переменную isBlocked и проверим на блокировку машины:");

        boolean isBlocked = false;

        if (!isBlocked) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Кофе-машина заблокирована");
        }
    }

    public static void task4() {
        int coffeeAmount = 2330;
        int milkAmount = 3210;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        int skimmedMilkAmount = 1290;

        boolean isBlocked = false;

        System.out.println("Сложное условие:");

        if (!isBlocked && milkAmount >= cappuchinoMilkRequired &&
                coffeeAmount >= cappuchinoCoffeeRequired) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так...");
        }
    }
}
