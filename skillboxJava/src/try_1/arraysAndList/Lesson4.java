package try_1.arraysAndList;

import try_1.myFeatures.Printer;

import java.util.Arrays;

public class Lesson4 {
    public static void run() {
        Printer.printLessonNumber(5, 10);
        Printer.printLessonName("Класс Arrays");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Работа с Arrays.toString()");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Работа с Arrays.equals()");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Работа с Arrays.compare()");
        Printer.printDescription("Метод Arrays.compare() сравнивает поэлементно, до разницы в каких-либо элементах, длянна массива при этом роли не играет(если есть разница до конца");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        task9();
        System.out.println();
        Printer.printTaskNumber(10);
        Printer.printTaskName("Работа с Arrays.copyOf()");
        task10();
        System.out.println();
        Printer.printTaskNumber(11);
        Printer.printTaskName("Работа с Arrays.copyOfRange()");
        task11();
        System.out.println();
        Printer.printTaskNumber(12);
        task12();
        System.out.println();
        Printer.printTaskNumber(13);
        Printer.printTaskName("Работа с Arrays.fill()");
        task12();

        System.out.println();
        System.out.println();
    }

    public static void task1() {
        int[] values = {234, 79, 4342, 789};
        System.out.println(values);
    }

    public static void task2() {
        int[] values = {234, 79, 4342, 789};
        System.out.println(Arrays.toString(values));
    }

    public static void task3() {
        int[] values = {234, 79, 4342, 789};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
    }

    public static void task4() {
        int[] a = {5, 6, 7};
        int[] b = {5, 6, 7};
        System.out.println(Arrays.equals(a, b));
    }

    public static void task5() {
        int[] a = {5, 6, 7};
        int[] b = {5, 6, 8};
        System.out.println(Arrays.equals(a, b));
    }

    public static void task6() {
        int[] a = {5, 6, 7};
        int[] b = {5, 6, 7};
        System.out.println(Arrays.compare(a, b));
    }

    public static void task7() {
        int[] a = {5, 6, 7};
        int[] b = {5, 6, 8};
        System.out.println(Arrays.compare(a, b));
    }

    public static void task8() {
        int[] a = {5, 6, 7, 10};
        int[] b = {5, 6, 8};
        System.out.println(Arrays.compare(a, b));
    }

    public static void task9() {
        int[] a = {5, 6, 7, 10};
        int[] b = {5, 6, 7};
        System.out.println(Arrays.compare(a, b));
    }

    public static void task10() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] firstElements = Arrays.copyOf(values, 5);
        System.out.println(Arrays.toString(firstElements));
    }

    public static void task11() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] firstElements = Arrays.copyOfRange(values, 2, 5);
        System.out.println(Arrays.toString(firstElements));
    }

    public static void task12() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] firstElements = Arrays.copyOfRange(values, 2, 3);
        System.out.println(Arrays.toString(firstElements));
    }

    public static void task13() {
        int[] values = new int[20];
        Arrays.fill(values, -1);
        System.out.println(Arrays.toString(values));
    }
}
