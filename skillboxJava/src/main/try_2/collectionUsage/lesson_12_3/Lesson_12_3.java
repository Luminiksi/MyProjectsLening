package main.try_2.collectionUsage.lesson_12_3;

import main.try_2.myFeatures.Printer;

import java.util.*;

public class Lesson_12_3 {

    public static void run() {
        Printer.printLessonNumber(3, 12);
        Printer.printLessonName("Преобразование массивов и коллекций");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Первый вариант");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Второй вариант");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Обратное преобразование");
        task3();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Третий вариант");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Добвление в Map");
        task5();
        System.out.println();
    }

    public static void task1() {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        ArrayList<String> colorList = new ArrayList<>();
        for (String color : colors) {
            colorList.add(color);
        }
    }

    public static void task2() {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        ArrayList<String> colorList = new ArrayList<>();

        colorList.addAll(Arrays.asList(colors));
    }

    public static void task3() {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        ArrayList<String> colorList = new ArrayList<>();

        colorList.addAll(Arrays.asList(colors));

        String[] newColors = new String[colorList.size()];
        for (int i = 0; i < newColors.length; i++) {
            newColors[i] = colorList.get(i);
        }

        System.out.println(Arrays.toString(newColors));
    }

    public static void task4() {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        ArrayList<String> colorList = new ArrayList<>(Arrays.asList(colors));

        String[] newColors = new String[colorList.size()];
        for (int i = 0; i < newColors.length; i++) {
            newColors[i] = colorList.get(i);
        }

        HashSet<String> colorSet = new HashSet<>(colorList);
        TreeSet<String> colorTreeSet1 = new TreeSet<>(colorSet);

        TreeSet<String> colorTreeSet2 = new TreeSet<>(new ColorComparator());
        colorTreeSet2.addAll(colorSet);

        System.out.println(Arrays.toString(newColors));
    }

    public static void task5() {
        HashMap<String, Integer> basket = new HashMap<>();
        basket.put("Молоко", 20);
        basket.put("Масло", 10);
        basket.put("Хлеб", 5);

        TreeMap<String, Integer> basketTreeMap = new TreeMap<>(new ProductComparator());
        basketTreeMap.putAll(basket);

        for (String product : basketTreeMap.keySet()) {
            System.out.println(product + " - " + basketTreeMap.get(product));
        }
        System.out.println();

        for (Integer count : basketTreeMap.values()) {
            System.out.println(count);
        }
        System.out.println();

        for (Map.Entry<String, Integer> entry : basketTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
