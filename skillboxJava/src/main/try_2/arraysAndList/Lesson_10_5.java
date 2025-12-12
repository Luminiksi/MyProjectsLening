package main.try_2.arraysAndList;

import main.try_2.myFeatures.Printer;

import java.util.Arrays;

public class Lesson_10_5 {

    public static void run() {
        Printer.printLessonNumber(5, 10);
        Printer.printLessonName("Класс Arrays");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Преобразование массивов в строки (Arrays.toString)");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Сортировка массивов (Arrays.sort)");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Сравнение массивов (Arrays.equals)");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Сравнение массивов (Arrays.compare)");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Копирование массивов (Arrays.copyOf Arrays.copyOfRange)");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Заполнение массивов (Arrays.fill)");
        task6();
    }

    public static void task1() {
        int[] values = {234, 79, 4342, 789};
        System.out.println(values);
        System.out.println(Arrays.toString(values));
    }

    public static void task2() {
        int[] values = {234, 79, 4342, 789};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
    }

    public static void task3() {
        int[] a = {5, 6, 7};
        int[] b = {5, 6, 7};
        int[] c = {5, 6, 8};
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a, c));
    }

    public static void task4() {
        int[] a = {5, 6, 7};
        int[] b = {5, 6, 7};
        int[] c = {5, 6, 8};
        int[] f = {5, 1, 8};
        System.out.println(Arrays.compare(a, b));
        System.out.println(Arrays.compare(a, c));
        System.out.println(Arrays.compare(a, f));
    }

    public static void task5() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] firstElement = Arrays.copyOf(a, 5);
        int[] element = Arrays.copyOfRange(a, 5, 8); // не включая 8
        System.out.println(Arrays.toString(firstElement));
        System.out.println(Arrays.toString(element));
    }

    public static void task6() {
        int[] values = new int[20];
        Arrays.fill(values, -1);
        System.out.println(Arrays.toString(values));
    }
}
