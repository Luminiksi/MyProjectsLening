package main.try_2.functionalProgramming;

import main.try_2.myFeatures.Printer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lesson_16_4 {
    public static void run() {
        Printer.printLessonNumber(4, 16);
        Printer.printLessonName("Лямбда-выражения");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Использование лямбда-выражения в BiFunction");
        task1();
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Использование лямбда-выражения в BiFunction - 2");
        task2();
        System.out.println();

        Printer.printTaskNumber(3);
        Printer.printTaskName("Использование лямбда-выражения в forEach");
        task3();
        System.out.println();

        Printer.printTaskNumber(4);
        Printer.printTaskName("Использование лямбда-выражения в forEach - 2");
        task4();
        System.out.println();

        Printer.printTaskNumber(5);
        Printer.printTaskName("Использование лямбда-выражения в Consumer");
        task5();
        System.out.println();

        Printer.printTaskNumber(6);
        Printer.printTaskName("Использование лямбда-выражения в Consumer - использование собственного нового метода");
        task6();
        System.out.println();

        Printer.printTaskNumber(7);
        Printer.printTaskName("Использование лямбда-выражения в Supplier");
        task7();
        System.out.println();
    }

    public static void task1() {
        int a = 5;
        int b = 3;

        int result = calculateBiFunc(a, b, (x, y) -> x + y);
        System.out.println(result);
    }

    public static void task2() {
        int a = 5;
        int b = 3;

        int result = calculateBiFunc(a, b, Integer::sum);
        System.out.println(result);
    }

    public static void task3() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        integers.forEach(item -> System.out.println(item));
    }

    public static void task4() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        integers.forEach(System.out::println);
    }

    public static void task5() {
//        Consumer<String> consumer = str -> System.out.println(str);
        Consumer<String> consumer = System.out::println;
    }

    public static void task6() {
        Consumer<String> consumer = Lesson_16_4::print;
    }

    public static void task7() {
        Supplier<String> supplier = String::new;
        System.out.println(supplier.get());
    }


    private static int calculateBiFunc(int a, int b, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(a, b);
    }

    private static void print(String str) {
        System.out.println(str);
    }

}
