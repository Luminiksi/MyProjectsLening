package main.try_2.InternetShop;

import main.try_2.myFeatures.Printer;

public class Lesson_5_6 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Printer.printLessonNumber(5, 5);
        Printer.printLessonName("Immutable-классы");

        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
    }

    public static void task1() {
        int a = 5;
        int b = a;
        a = a + 1;
        System.out.println(a);
        System.out.println(b);
    }

    public static void task2() {
        Product a = new Product("Milk", 56);
        Product b = a;
        a.setName("juice");
        System.out.println(a);
        System.out.println(b);
    }

    public static void task3() {
        Product product = new Product("Milk", 56);
        Order order = new Order();
        order.addProduct(product);
        System.out.println(product);
    }
}
