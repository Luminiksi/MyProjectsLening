package main.try_2.functionalProgramming.lesson_16_7;

import main.try_2.myFeatures.Printer;

public class Lesson_16_7 {
    public static void run() {
        Printer.printLessonNumber(7, 16);
        Printer.printLessonName("Lombok");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Аннотации Getter и Setter и NoArgsConstructor");
        task1();
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Аннотации Getter и Setter и AllArgsConstructor");
        task2();
        System.out.println();

        Printer.printDescription("В одном классе можно прописать обе аннотации - NoArgsConstructor и AllArgsConstructor, " +
                "чтобы были конструкторы и с аргументами и без");
        System.out.println();

        Printer.printTaskNumber(3);
        Printer.printTaskName("Аннотация ToString (+ Exclude)");
        task3();
        System.out.println();

        Printer.printTaskNumber(4);
        Printer.printTaskName("Аннотация ToString (+ includeFieldNames = false)");
        task4();
        System.out.println();

        Printer.printTaskNumber(5);
        Printer.printTaskName("Аннотация ToString (+ onlyExplicitlyIncluded = true");
        task5();
        System.out.println();
    }

    public static void task1() {
        Product product = new Product();
        product.setName("Test");
        product.setPrice(100);
        System.out.println(product.getName() + ": " + product.getPrice());
    }

    public static void task2() {
        ProductAll product = new ProductAll("Test 1", 120);
        System.out.println(product.getName() + ": " + product.getPrice());
    }

    public static void task3() {
        ProductAll product = new ProductAll("Test 1", 120);
        System.out.println(product);
    }

    public static void task4() {
        Product product = new Product();
        product.setName("Test");
        product.setPrice(100);
        System.out.println(product);
    }

    public static void task5() {
        ProductReq product = new ProductReq();
        product.setName("Test");
        product.setPrice(100);
        System.out.println(product);
    }
}
