package setAndMap.lesson7;

import myFeatures.Printer;

import java.util.HashMap;
import java.util.TreeMap;

public class Lesson7 {
    public static void run() {
        Printer.printLessonNumber(7, 11);
        Printer.printLessonName("Коллекции HashMap и TreeMap");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        task4();
        System.out.println();

        System.out.println();
        System.out.println();
    }

    public static void task1() {
        HashMap<String, Car> cars = new HashMap<>();
        cars.put("A765MT77", new Car("A765MT77"));
        cars.put("E637OO97", new Car("E637OO97"));
        cars.put("Y789KX77", new Car("Y789KX77"));
        cars.put("T372MH199", new Car("T372MH199"));
        cars.put("E637OO97", new Car("324535333"));

        System.out.println(cars.get("E637OO97"));
        System.out.println(cars.get("E637O197"));
    }

    public static void task2() {
        Basket basket = new Basket();
        basket.add(new Product("Молоко", 300), 20);
        basket.add(new Product("Масло", 50), 10);
        basket.add(new Product("Молоко", 300), 30);
        System.out.println(basket);
    }

    public static void task3() {
        BasketTree basket = new BasketTree();
        basket.add(new Product("Хлеб", 50), 10);
        basket.add(new Product("Молоко", 75), 20);
        basket.add(new Product("Масло", 150), 10);
        basket.add(new Product("Молоко", 75), 30);
        System.out.println(basket);
    }

    public static void task4() {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "1231");
        map.put("2342", "23423424");
        System.out.println(map.get(null));

        TreeMap<String, String> mapT = new TreeMap<>();
        mapT.put(null, "1231");
        mapT.put("2342", "23423424");
        try {
            System.out.println(mapT.get(null));
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }


}
