package main.try_2.hometasks.lesson_6;

import main.try_2.myFeatures.Printer;

public class Lesson_6_3 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Printer.printLessonNumber(3, 6);
        Printer.printLessonName("Статические методы");

        Printer.printTaskNumber(1);
        Printer.printDescription("Доп. задание");
        Printer.printTaskName("Задание 1. Создание класса с двумя статическими переменными и методами");
        task1();
        System.out.println();
    }

    public static void task1() {
        Product product1 = new Product("Молоко", 99);
        Product product2 = new Product("Масло", 169);
        Product product3 = new Product("Хлеб", 46);
        System.out.println("Общее количество продуктов: " + Product.getCount());
        System.out.println("Общая цена продуктов: " + Product.getTotalPrice());
        System.out.println("Средняя цена продуктов: " + Product.getAveragePrice());
    }
}
