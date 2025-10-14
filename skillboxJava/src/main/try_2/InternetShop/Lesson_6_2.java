package main.try_2.InternetShop;

import main.try_2.myFeatures.Printer;

public class Lesson_6_2 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Printer.printLessonNumber(2, 6);
        Printer.printLessonName("Статические переменные");

        Printer.printTaskNumber(1);
        task1();
        System.out.println();
    }

    public static void task1() {
        Basket basket = new Basket("товары", 2345123);
        Session session = new Session();
        System.out.println(Basket.count);
    }
}
