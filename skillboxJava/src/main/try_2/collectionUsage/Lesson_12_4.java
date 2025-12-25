package main.try_2.collectionUsage;

import main.try_2.myFeatures.Printer;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson_12_4 {

    public static void run() {
        Printer.printLessonNumber(4, 12);
        Printer.printLessonName("Итератор");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Если мы попытаемся в for удалить элемент");
        try {
            task1();
        } catch (Exception e) {
            System.out.println("Ошибочка!!!");
            System.out.println(e.toString());
        }
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("А теперь безопасно перебираемся с итератором");
        task2();
    }

    public static void task1() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Красный");
        colors.add("Зеленый");
        colors.add("Синий");
        colors.add("Желтый");

        for (String color : colors) {
            System.out.println(color);
            if (color.equals("Зеленый")) {
                colors.remove("Синий");
            }
        }
    }

    public static void task2() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Красный");
        colors.add("Зеленый");
        colors.add("Синий");
        colors.add("Желтый");

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
            if (color.equals("Зеленый")) {
                iterator.remove();
            }
        }
        System.out.println();

        System.out.println("Итого:");
        for (String color : colors) {
            System.out.println(color);
        }

    }
}
