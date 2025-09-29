package main.try_2.hometasks.Lesson_5.immutability;

import main.try_2.myFeatures.Printer;

public class Lesson_5_5 {
    public static void run() {
        Printer.printLessonNumber(5, 5);
        Printer.printLessonName("Immutable-классы");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Модифицируйте класс и добавьте в него неизменяемое поле");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Создайте иммутабельный класс");
        task2();
    }

    public static void task1() {
        Product product = new Product("Product", "123231sdfs");
        product.setPrice(321);
        System.out.println("Product: " + product.getName() + "\n Barcode: " + product.getBarCode() + "\n Price: " + product.getPrice());
        product.setPrice(123);
        System.out.println("Product: " + product.getName() + "\n Barcode: " + product.getBarCode() + "\n Price: " + product.getPrice());
    }

    public static void task2() {
        Book book = new Book("My book", "Mishel", 320, "2334jk34224");
        System.out.println(book);
    }
}
