package coffeMachine.lessons;

import myFeatures.Printer;

public class Lesson8 {
    public static void run() {
        Printer.printLessonNumber(8, 2);
        Printer.printLessonName("Комментарии в коде");
    }

    public static void task() {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        int cappucinoMilkRequired = 60; // in grams
        int cappucinoCoffeeRequired = 15; // in grams
        boolean isBlocked = true;

        boolean hasErrors = false;

        boolean milkIsEnough = milkAmount >= cappucinoMilkRequired ||
                skimmedMilkAmount >= cappucinoMilkRequired;

//        Данный комментарий можно найти через вкладку идеи(вкладка TODO внизу)
        //TODO: check another types of coffee
        boolean coffeIsEnogh = coffeeAmount >= cappucinoCoffeeRequired;

        if (isBlocked) {
            System.out.println("Кофе-машинв заблокирована");
            hasErrors = true;
        }
        if (!coffeIsEnogh) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;
        }
        /*
        многострочный
        комментарий
        */
        /**
         * javadoc-комментарий
         */
        if (!milkIsEnough) {
            System.out.println("Молока не достаточно");
            hasErrors = true;
        }

        if(!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}
