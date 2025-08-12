package main.try_1.collectionsUsage.lesson3;

import main.try_1.myFeatures.Printer;

import java.util.*;

public class Lesson3 {
    public static void run() {
        Printer.printLessonNumber(3, 12);
        Printer.printLessonName("Преобразование массивов и коллекций");
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
        Printer.printTaskNumber(5);
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        task7();
        System.out.println();

        System.out.println();
        System.out.println();
    }

    public static void task1() {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        ArrayList<String> colorsList = new ArrayList<>();
        for (int i = 0; i < colors.length; i++) {
            colorsList.add(colors[i]);
        }
    }

    public static void task2() {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.addAll(Arrays.asList(colors));

        String[] newColors = new String[colorsList.size()];
        for (int i = 0; i < newColors.length; i++) {
            newColors[i] = colorsList.get(i);
        }

        System.out.println(Arrays.toString(newColors));
    }

    public static void task3() {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colors));

        for (int i = 0; i < colorsList.size(); i++) {
            System.out.println(colorsList.get(i));
        }
    }

    public static void task4() {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colors));

        HashSet<String> colorsSet = new HashSet<>(colorsList);
        TreeSet<String> colorsTreeSet = new TreeSet<>(colorsSet);

        for (String color : colorsTreeSet) {
            System.out.println(color);
        }
    }

    public static void task5() {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colors));

        HashSet<String> colorsSet = new HashSet<>(colorsList);
        TreeSet<String> colorsTreeSet = new TreeSet<>(new ColorComparator());
        colorsTreeSet.addAll(colorsSet);

        for (String color : colorsTreeSet) {
            System.out.println(color);
        }
    }

    public static void task6() {
        HashMap<String, Integer> basket = new HashMap<>();
        basket.put("Молоко", 20);
        basket.put("Масло", 10);
        basket.put("Хлеб", 5);

        TreeMap<String, Integer> basketTree = new TreeMap<>(basket);

        for (Map.Entry pair : basketTree.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static void task7() {
        HashMap<String, Integer> basket = new HashMap<>();
        basket.put("Молоко", 20);
        basket.put("Масло", 10);
        basket.put("Хлеб", 5);

        TreeMap<String, Integer> basketTree = new TreeMap<>(new ProductComparator());
        basketTree.putAll(basket);

        for (String product : basketTree.keySet()) {
            System.out.println(product + " - " + basketTree.get(product));
        }
        System.out.println();
        for (Integer count : basketTree.values()) {
            System.out.println(count);
        }
        System.out.println();
        for (Map.Entry pair : basketTree.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
