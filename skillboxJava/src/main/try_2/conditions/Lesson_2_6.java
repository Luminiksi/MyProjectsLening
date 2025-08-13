package main.try_2.conditions;

import main.try_2.myFeatures.Printer;

public class Lesson_2_6 {
    public static void run() {
        Printer.printLessonNumber(6, 2);
        Printer.printTaskName("Вложенные условия");
        Printer.printDescription("Практика");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Задание 1. Упрощение кода с вложенными условиями");
        task1();
        System.out.println();
    }

    public static void task1() {
        int pagesInBook = 530;
        int booksCount = 2000;

        boolean coldPrintingMode = false;
        double printRollerTemp = 90;

        System.out.println(checkTask1(pagesInBook, booksCount, coldPrintingMode, printRollerTemp));
    }

    public static String checkTask1(int pagesInBook, int booksCount, boolean coldPrintingMode, double printRollerTemp) {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int papersCount = pagesInBook * booksCount / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean paperIsEnough = papersCount <= paperReserve;
        boolean inkIhsEnough = inkedPapersCount <= inkReserve;
        boolean coversAreEnough = booksCount <= coverReserve;
        boolean rollerTempIsNormal = coldPrintingMode
                || (printRollerTemp > printRollerMinTemp && printRollerTemp < printRollerMaxTemp);

        boolean errors = false;
        if (!paperIsEnough || !inkIhsEnough) {
            errors = true;
            System.out.println("Бумаги или чернил недостаточно");
        } else if (coversAreEnough) {
            if (!coldPrintingMode && !rollerTempIsNormal) {
                errors = true;
                System.out.println("Неверный режим печати или температура печатающего ролла непустимая");
            } else {
                errors = true;
                System.out.println("Обложек недостаточно");
            }
        }

        if (!errors) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }

        if (paperIsEnough && inkIhsEnough && coversAreEnough && rollerTempIsNormal) {
            return "Печать разрешена";
        } else {
            return "Печать запрещена";
        }
    }
}
