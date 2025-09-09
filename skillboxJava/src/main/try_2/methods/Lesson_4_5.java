package main.try_2.methods;

import main.try_1.myFeatures.Printer;

public class Lesson_4_5 {

    public static void run() {
        Printer.printLessonNumber(5, 4);
        Printer.printLessonName("Классы и объекты");
        Printer.printDescription("Практика");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Создайте класс с одной переменной и двумя методами");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Создайте класс с одной переменной и двумя методами");
        task2();
    }

    public static void task1() {
        Order order1 = new Order();
        order1.addProducts(54);
        order1.addProducts(600);
        System.out.println(order1.getProductsCount());
    }

    public static void task2() {
        Order order1 = new Order();
        order1.addProducts(201, 40000);
        order1.addProducts(317, 12000);
        System.out.println(
                "Количество: " + order1.getProductsCount()
        );
        System.out.println(
                "Стоимость: " + order1.getTotalCost()
        );
    }
}
