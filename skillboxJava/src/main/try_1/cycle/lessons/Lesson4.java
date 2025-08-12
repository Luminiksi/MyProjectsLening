package main.try_1.cycle.lessons;

import main.try_1.myFeatures.Printer;

public class Lesson4 {
    public static void run() {
        Printer.printLessonNumber(4, 3);
        Printer.printLessonName("Операторы “break” и “continue”");
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
        int soughtYear = 1985;

        int firstYear = 1992;
        int lastYear = 2022;

        for (int year = firstYear; year < lastYear; year++) {
            if (year == soughtYear) {
                System.out.println("Год найден!");
                break;
            }
        }
    }

    public static void task2() {
        int soughtYear = 1985;

        int firstYear = 1992;
        int lastYear = 2022;

        boolean yearExist = false;

        for (int year = firstYear; year < lastYear; year++) {
            if (year == soughtYear) {
                System.out.println("Год найден!");
                yearExist = true;
                break;
            }
        }

        String found = "Год найден";
        String notFound = "Год не найден";
        System.out.println(yearExist ? found : notFound);
    }

    public static void task3() {
        int firstYear = 1992;
        int lastYear = 2022;

        for (int year = firstYear; year < lastYear; year++) {
            if (year % 4 == 0) {
                System.out.println(year);
                for (int month = 1; month <= 12; month++) {
                    String zero = month < 10 ? "0" : "";
                    System.out.println("29." + zero + month + "." + year);
                }
            }
        }
    }

    public static void task4() {
        int firstYear = 1992;
        int lastYear = 2022;

        for (int year = firstYear; year < lastYear; year++) {
            if (year % 4 == 0) {
                continue;
            }
            System.out.println(year);
            for (int month = 1; month <= 12; month++) {
                String zero = month < 10 ? "0" : "";
                System.out.println("29." + zero + month + "." + year);
            }
        }
    }
}
