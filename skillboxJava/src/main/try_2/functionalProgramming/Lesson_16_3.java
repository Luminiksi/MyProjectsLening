package main.try_2.functionalProgramming;

import main.try_2.myFeatures.Printer;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lesson_16_3 {
    public static void run() {
        Printer.printLessonNumber(3, 16);
        Printer.printLessonName("Функциональные интерфейсы. Часть 1");

        Printer.printTaskNumber(1);
        Printer.printTaskName("С использованием класса");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("А теперб только с интерфейсом (с анонимным классом)");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Пример с использованием Supplier");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Пример с использованием Consumer");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Пример с использованием Predicate");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Пример с использованием BiFunction");
        task6();
        System.out.println();

    }

    public static void task1() {
        int a = 5;
        int b = 3;


        Action<Integer> sum = new ActionSum();
        int result = calculate(a, b, sum);
        System.out.println(result);

        System.out.println();
    }

    public static void task2() {
        int a = 5;
        int b = 3;

        int result = calculate(a, b, new Action<Integer>() {
            @Override
            public Integer calculate(Integer t1, Integer t2) {
                return t1 + t2;
            }
        });
        System.out.println(result);

        System.out.println();
    }

    public static void task3() {
        var supplier = new Supplier<String>() {

            @Override
            public String get() {
                return "JDK 8 is cool!!!";
            }
        };
    }

    public static void task4() {
        var consumer = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println("<b>" + s + "</b>");
            }
        };
    }

    public static void task5() {
        var isEven = new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        System.out.println(isEven.test(5));
    }

    public static void task6() {
        int a = 5;
        int b = 3;

        int result = calculateBiFunc(a, b, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        });
        System.out.println(result);

        System.out.println();
    }


    private static int calculate(int a, int b, Action<Integer> action) {
        return action.calculate(a, b);
    }


    private static int calculateBiFunc(int a, int b, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(a, b);
    }
}
