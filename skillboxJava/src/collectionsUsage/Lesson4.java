package collectionsUsage;

import myFeatures.Printer;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson4 {
    public static void run() {
        Printer.printLessonNumber(4, 12);
        Printer.printLessonName("Итератор");
        Printer.printTaskNumber(1);
        Printer.printDescription("У меня почему-то не поломалось и нормально отработало... может прикол более новой java...\n" +
                "Но при этом не оторажает один из элементов - все равно работает не корректно");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();

        System.out.println();
        System.out.println();
    }

    public static void task1() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Красный");
        colors.add("Зеленый");
        colors.add("Синий");
        colors.add("Желтый");

        try {
            for (int i = 0; i < colors.size(); i++) {
                System.out.println(colors.get(i));
                if (colors.get(i).equals("Зеленый")) {
                    colors.remove("Красный");
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        System.out.println();

        try {
            for (int i = 0; i < colors.size(); i++) {
                System.out.println(colors.get(i));
                if (colors.get(i).equals("Зеленый")) {
                    colors.remove("Зеленый");
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
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
        System.out.println("Итого: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
