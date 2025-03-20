package interfaces;

import myFeatures.Printer;

public class Lesson5 {
    public static void run() {
        Printer.printLessonNumber(5, 14);
        Printer.printLessonName("Методы с дефолтной реализацией в интерфейсах");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Дефолтные методы и множественное наследование");
        task2();
        System.out.println();

    }

    public static void task1() {
        interfaces.Printer printer = new SimplePrinter();
        printer.printBlackAndWhite();
        printer.printColor();
    }

    public static void task2() {
        interfaces.Printer printer = new SimplePrinter2();
        printer.printBlackAndWhite();
        printer.printColor();
    }
}
