package main.try_2.cycles;

import main.try_1.myFeatures.Printer;

public class Lesson_3_4 {
    public static void run() {
        Printer.printLessonNumber(3, 3);
        Printer.printLessonName("Операторы “break” и “continue”");
        Printer.printDescription("Из лекции");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Перебираем года в поисках нужного");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Перебираем года в поисках нужного (Улучшенный)");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Перебираем года в поисках четных");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Перебираем года в поисках четных (Улучшенный)");
        task4();
        System.out.println();
    }

    public static void task1() {
        int soughtYear = 1994;

        int firstYear = 1922;
        int lastYear = 2025;

        for (int year = firstYear; year <= lastYear; year++) {
            if (year == soughtYear) {
                System.out.println("Год найден!");
                break;
            }
        }
    }

    public static void task2() {
        int soughtYear = 1994;

        int firstYear = 1922;
        int lastYear = 2025;

        boolean yearExists = false;

        for (int year = firstYear; year <= lastYear; year++) {
            if (year == soughtYear) {
                yearExists = true;
                break;
            }
        }

        String found = "Год найден";
        String notFound = "Год не найден";

        System.out.println(yearExists ? found : notFound);
    }

    public static void task3() {

        int firstYear = 1922;
        int lastYear = 2025;

        for (int year = firstYear; year <= lastYear; year++) {
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

        int firstYear = 1969;
        int lastYear = 2025;

        for (int year = firstYear; year <= lastYear; year++) {
            if (year % 4 != 0) {
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
