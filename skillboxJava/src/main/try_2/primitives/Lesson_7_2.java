package main.try_2.primitives;

import main.try_2.myFeatures.Printer;

public class Lesson_7_2 {
    public static void run() {
        Printer.printLessonNumber(2, 7);
        Printer.printLessonName("Примитивы и объекты");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Работа с объектами");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Работа с примитивами");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Работа с примитивами внутри объекта и ссылками на объект");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Работа с примитивами внутри объекта и ссылками на объект - 2");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Работа с примитивами внутри метода");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Работа с примитивами внутри класса внутри метода");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Сравнение примитивов");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Сравнение классов с помощью ==");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        Printer.printTaskName("Сравнение классов с помощью ==(когда одинаковые ссылки)");
        task9();
    }

    public static void task1() {
        Product milk = new Product("Milk", 108);
        Product milk2 = milk;
        milk.setPrice(90);
        System.out.println(milk2);
    }

    public static void task2() {
        int milkPrice = 75;
        int icecreamePrice = milkPrice;
        milkPrice = 100;
        System.out.println(icecreamePrice);
    }

    public static void task3() {
        System.out.println(calculate(5, 10, 15));
    }

    public static void task4() {
        Calculator calculator = getCalculator(5, 10, 15);
        System.out.println(calculator.multiply());
    }

    public static int calculate(int s, int b, int c) {
        Calculator calculator = new Calculator(s, b, c);
        return calculator.multiply();
    }

    public static Calculator getCalculator(int s, int b, int c) {
        return new Calculator(s, b, c);
    }

    public static void task5() {
        int milkPrice = 75;
        addCommission(milkPrice);
        System.out.println(milkPrice);
    }

    public static void addCommission(int price) {
        price = price + 10;
    }

    public static void task6() {
        Product milk = new Product("Milk", 75);
        addCommission(milk);
        System.out.println(milk.getPrice());
    }

    public static void addCommission(Product product) {
        product.setPrice(product.getPrice() + 10);
    }

    public static void task7() {
        int milkPrice = 75;
        int icecreamePrice = 75;
        if (milkPrice == icecreamePrice) {
            System.out.println("Цена одинаковы");
        }
    }

    public static void task8() {
        Product product1 = new Product("Milk", 75);
        Product product2 = new Product("Milk", 75);
        if (product1 == product2) {
            System.out.println("Одинаковые");
        }
    }

    public static void task9() {
        Product product1 = new Product("Milk", 75);
        Product product2 = product1;
        if (product1 == product2) {
            System.out.println("Одинаковые");
        }
    }
}
