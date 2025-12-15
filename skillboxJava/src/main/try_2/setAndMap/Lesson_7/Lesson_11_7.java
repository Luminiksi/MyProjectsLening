package main.try_2.setAndMap.Lesson_7;

import main.try_2.myFeatures.Printer;

import java.util.HashMap;

public class Lesson_11_7 {

    public static void run() {
        Printer.printLessonNumber(7, 11);
        Printer.printLessonName("Коллекции HashMap и TreeMap");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Пример в HashMap");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Работа с HashMap");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Работа с TreeMap");
        task3();
    }

    public static void task1() {
        HashMap<String, Car> cars = new HashMap<>();
        cars.put("A765MT77", new Car("A765MT77"));
        cars.put("E637OO97", new Car("E637OO97"));
        cars.put("Y789KX77", new Car("Y789KX77"));
        cars.put("T372MH199", new Car("T372MH199"));
        cars.put("E637OO97", new Car("34534533535353"));

        System.out.println("Элемент найден:");
        System.out.println(cars.get("Y789KX77"));
        System.out.println("Элемент не найден:");
        System.out.println(cars.get("Y789KX79"));

        System.out.println("Элементы с одинаковым ключом - заменяются");
        System.out.println(cars.get("E637OO97"));

    }

    public static void task2() {
        Basket basket = new Basket();
        basket.add(new Product("Молоко", 75), 20);
        basket.add(new Product("Масло", 150), 10);
        basket.add(new Product("Молоко", 75), 30);
        System.out.println(basket);
    }

    public static void task3() {
        BasketTree basket = new BasketTree();
        basket.add(new Product("Хлеб", 50), 20);
        basket.add(new Product("Молоко", 75), 20);
        basket.add(new Product("Масло", 150), 10);
        basket.add(new Product("Молоко", 75), 30);
        System.out.println(basket);

    }
}
