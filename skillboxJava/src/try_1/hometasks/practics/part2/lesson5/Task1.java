package try_1.hometasks.practics.part2.lesson5;

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
        Printer.printAttemptNumber(4);
        task4();
        Printer.printAttemptNumber(5);
        task5();
        Printer.printAttemptNumber(6);
        task6();
        Printer.printAttemptNumber(7);
        task7();
    }

    public static void task1() {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2000;

        boolean coldPrintingMode = false;
        double printRollerTemp = 90;

        int papersCount  = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean hasPaper = papersCount <= paperReserve;
        boolean hasInk = inkedPapersCount <= inkReserve;
        boolean hasCover = booksCount <= coverReserve;

        boolean temp = false;
        if (coldPrintingMode) {
            temp = true;
        } else if (printRollerTemp >= printRollerMinTemp && printRollerTemp <= printRollerMaxTemp) {
            temp = true;
        }

        if(hasPaper && hasInk && temp && hasCover) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }

    public static void task2() {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2001;

        boolean coldPrintingMode = false;
        double printRollerTemp = 90;

        int papersCount  = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean hasPaper = papersCount <= paperReserve;
        boolean hasInk = inkedPapersCount <= inkReserve;
        boolean hasCover = booksCount <= coverReserve;

        boolean temp = false;
        if (coldPrintingMode) {
            temp = true;
        } else if (printRollerTemp >= printRollerMinTemp && printRollerTemp <= printRollerMaxTemp) {
            temp = true;
        }

        if(hasPaper && hasInk && temp && hasCover) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }

    public static void task3() {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 730;
        int booksCount = 2000;

        boolean coldPrintingMode = false;
        double printRollerTemp = 90;

        int papersCount  = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean hasPaper = papersCount <= paperReserve;
        boolean hasInk = inkedPapersCount <= inkReserve;
        boolean hasCover = booksCount <= coverReserve;

        boolean temp = false;
        if (coldPrintingMode) {
            temp = true;
        } else if (printRollerTemp >= printRollerMinTemp && printRollerTemp <= printRollerMaxTemp) {
            temp = true;
        }

        if(hasPaper && hasInk && temp && hasCover) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }

    public static void task4() {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2000;

        boolean coldPrintingMode = true;
        double printRollerTemp = 200;

        int papersCount  = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean hasPaper = papersCount <= paperReserve;
        boolean hasInk = inkedPapersCount <= inkReserve;
        boolean hasCover = booksCount <= coverReserve;

        boolean temp = false;
        if (coldPrintingMode) {
            temp = true;
        } else if (printRollerTemp >= printRollerMinTemp && printRollerTemp <= printRollerMaxTemp) {
            temp = true;
        }

        if(hasPaper && hasInk && temp && hasCover) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }

    public static void task5() {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2000;

        boolean coldPrintingMode = true;
        double printRollerTemp = 50;

        int papersCount  = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean hasPaper = papersCount <= paperReserve;
        boolean hasInk = inkedPapersCount <= inkReserve;
        boolean hasCover = booksCount <= coverReserve;

        boolean temp = false;
        if (coldPrintingMode) {
            temp = true;
        } else if (printRollerTemp >= printRollerMinTemp && printRollerTemp <= printRollerMaxTemp) {
            temp = true;
        }

        if(hasPaper && hasInk && temp && hasCover) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }

    public static void task6() {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2000;

        boolean coldPrintingMode = false;
        double printRollerTemp = 200;

        int papersCount  = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean hasPaper = papersCount <= paperReserve;
        boolean hasInk = inkedPapersCount <= inkReserve;
        boolean hasCover = booksCount <= coverReserve;

        boolean temp = false;
        if (coldPrintingMode) {
            temp = true;
        } else if (printRollerTemp >= printRollerMinTemp && printRollerTemp <= printRollerMaxTemp) {
            temp = true;
        }

        if(hasPaper && hasInk && temp && hasCover) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }

    public static void task7() {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2000;

        boolean coldPrintingMode = false;
        double printRollerTemp = 50;

        int papersCount  = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean hasPaper = papersCount <= paperReserve;
        boolean hasInk = inkedPapersCount <= inkReserve;
        boolean hasCover = booksCount <= coverReserve;

        boolean temp = false;
        if (coldPrintingMode) {
            temp = true;
        } else if (printRollerTemp >= printRollerMinTemp && printRollerTemp <= printRollerMaxTemp) {
            temp = true;
        }

        if(hasPaper && hasInk && temp && hasCover) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }
}
