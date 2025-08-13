package main.try_2.demo;

import main.try_2.myFeatures.Printer;

public class Lesson_2_7 {
    public static void run() {
        Printer.printLessonNumber(7, 2);
        Printer.printTaskName("Тернарный оператор");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Без терарного оператора");
        task1();
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Тернарный оператор");
        task2();
        System.out.println();

        Printer.printTaskNumber(3);
        Printer.printTaskName("Как не стоит использовать тернарный оператор");
        task3();
        System.out.println();

        Printer.printTaskNumber(4);
        Printer.printTaskName("Лучше сделать так");
        task4();
        System.out.println();
    }

    public static void task1() {
        boolean passIsValid = false;
        boolean isCarantine = false;

        String message;
        if (passIsValid && !isCarantine) {
            message = "Проход открыт";
        } else {
            message = "Проход закрыт";
        }

        System.out.println(message);
    }

    public static void task2() {
        boolean passIsValid = false;
        boolean isCarantine = false;

        String message = passIsValid && !isCarantine ? "Проход открыт" : "Проход закрыт";

        System.out.println(message);
    }

    public static void task3() {
        boolean passIsValid = false;
        boolean isCarantine = false;

        boolean isPersonal = true;

        String message = passIsValid && !isCarantine ? "Проход открыт" : (isPersonal ? "Проход открыт только для персонала" :"Проход закрыт");

        System.out.println(message);
    }

    public static void task4() {
        boolean passIsValid = false;
        boolean isCarantine = false;

        boolean isPersonal = true;

        String message;

        if (passIsValid && !isCarantine) {
            message = "Проход открыт";
        } else if (isPersonal) {
            message = "Проход открыт только для персонала";
        }else {
            message = "Проход закрыт";
        }

        System.out.println(message);
    }

}
