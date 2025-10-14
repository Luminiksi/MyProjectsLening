package main.try_2.InternetShop;

import main.try_2.myFeatures.Printer;

public class Lesson_6_5 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Printer.printLessonNumber(5, 6);
        Printer.printLessonName("Enum");

        Printer.printTaskNumber(1);
        task1();
        System.out.println();
    }

    public static void task1() {
        DeliveryOrder order = new DeliveryOrder(DeliveryType.AUTO, Fragile.YES, Cold.YES);
    }
}
