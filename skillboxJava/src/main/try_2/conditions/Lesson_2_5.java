package main.try_2.conditions;

import main.try_2.myFeatures.Printer;

public class Lesson_2_5 {
    public static void run() {
        Printer.printLessonNumber(5, 2);
        Printer.printTaskName("Приоритеты и скобки в условиях");
        Printer.printDescription("Практика");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Задание 1. Напишите булево выражение из нескольких элементов");
        task1();
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Задание 2. Выделите элементы булева выражения в переменные");
        task2();
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

        if (papersCount <= paperReserve
                && inkedPapersCount <= inkReserve
                && booksCount <= coverReserve
                && (coldPrintingMode
                || (printRollerTemp > printRollerMinTemp && printRollerTemp < printRollerMaxTemp))) {
            return "Печать разрешена";
        } else {
            return "Печать запрещена";
        }
    }

    public static void task2() {
        int pagesInBook = 530;
        int booksCount = 2000;

        boolean coldPrintingMode = false;
        double printRollerTemp = 90;

        System.out.println(checkTask2(pagesInBook, booksCount, coldPrintingMode, printRollerTemp));

    }

    public static String checkTask2(int pagesInBook, int booksCount, boolean coldPrintingMode, double printRollerTemp) {
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

        if (paperIsEnough && inkIhsEnough && coversAreEnough && rollerTempIsNormal) {
            return "Печать разрешена";
        } else {
            return "Печать запрещена";
        }
    }
}
