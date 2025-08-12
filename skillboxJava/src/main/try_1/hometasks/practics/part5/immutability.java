package main.try_1.hometasks.practics.part5;

import main.try_1.myFeatures.Printer;

public class immutability {
    public static void main(String[] args) {
        Printer.printLessonNumber(5,5);
        Printer.printTaskNumber(1);
        Printer.printTaskName("Модифицируйте класс и добавьте в него неизменяемое поле");
        lesson6task1();
        System.out.println();
        Printer.printTaskNumber(1);
        Printer.printTaskName("Создайте иммутабельный класс");
        lesson6task2();
    }

    public static void lesson6task1() {
        Product product = new Product("Продукт", 123, "asfda123");
        product.setPrice(32);
        System.out.println(product.getPrice());
    }

    public static void lesson6task2() {
        Book book = new Book("Горе от ума", "Александр Сергеевич Грибоедов", 164, 1233166345345L);
        System.out.println("название: " + book.getName());
        System.out.println("автор: " + book.getAuthor());
        System.out.println("количество страниц: " + book.getPages());
        System.out.println("номер ISBN: " + book.getISBN());
    }
}
