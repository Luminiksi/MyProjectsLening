package main.try_2.InternetShop;

import main.try_2.myFeatures.Printer;

public class Lesson_6_3 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Printer.printLessonNumber(3, 6);
        Printer.printLessonName("Статические методы");

        Printer.printTaskNumber(1);
        task1();
        System.out.println();
    }

    public static void task1() {
        createBasket();
        Session session = new Session();
        System.out.println(Basket.getCount());
    }

    public static void createBasket() {
        Basket basket = new Basket("товары", 2345123);
    }
}
