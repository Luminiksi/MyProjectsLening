package try_1.coffeMachine.lessons;

import try_1.myFeatures.Printer;

public class Lesson6 {
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
        Printer.printDescription("Избегаем большой вложенности условных операторов, а также слишком больших условий - " +
                "для лучшей читаемости кода");
    }

    public static void task1() {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;
        boolean isBlocked = true;

        boolean milkIsEnough = milkAmount >= cappucinoMilkRequired ||
                skimmedMilkAmount >= cappucinoMilkRequired;
        boolean coffeIsEnogh = coffeeAmount >= cappucinoCoffeeRequired;

        if (isBlocked) {
            System.out.println("Кофе-машинв заблокирована");
        } else {
            if (coffeIsEnogh && milkIsEnough) {
                System.out.println("Готовим кофе");
            } else {
                if (!coffeIsEnogh) {
                    System.out.println("Кофе недостаточно");
                }
                if (!milkIsEnough) {
                    System.out.println("Молока не достаточно");
                }
            }
        }
    }

    public static void task2() {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;
        boolean isBlocked = true;

        boolean milkIsEnough = milkAmount >= cappucinoMilkRequired ||
                skimmedMilkAmount >= cappucinoMilkRequired;
        boolean coffeIsEnogh = coffeeAmount >= cappucinoCoffeeRequired;

        if (isBlocked) {
            System.out.println("Кофе-машинв заблокирована");
        } else {
            if (coffeIsEnogh && milkIsEnough) {
                System.out.println("Готовим кофе");
            }
            if (!coffeIsEnogh) {
                System.out.println("Кофе недостаточно");
            }
            if (!milkIsEnough) {
                System.out.println("Молока не достаточно");
            }
        }
    }

    public static void task3() {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;
        boolean isBlocked = true;

        boolean hasErrors = false;

        boolean milkIsEnough = milkAmount >= cappucinoMilkRequired ||
                skimmedMilkAmount >= cappucinoMilkRequired;
        boolean coffeIsEnogh = coffeeAmount >= cappucinoCoffeeRequired;

        if (isBlocked) {
            System.out.println("Кофе-машинв заблокирована");
            hasErrors = true;
        }
        if (!coffeIsEnogh) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;
        }
        if (!milkIsEnough) {
            System.out.println("Молока не достаточно");
            hasErrors = true;
        }

        if(!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}
