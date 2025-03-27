package functionalProgramming.lesson3;

import myFeatures.Printer;

import java.util.function.*;

public class Lesson3 {
    public static void run() {
        Printer.printLessonNumber(3, 16);
        Printer.printLessonName("Функциональные интерфейсы. Часть 1");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Калькулятор с помощью функционального интерфейса");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Работа с Supplier");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Работа с Consumer");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Работа с Predicate");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Работа с Function");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Калькулятор с помощью интерфейса BiFunction");
        task7();
    }

    public static void task1() {
        int a = 5;
        int b = 3;
        Action<Integer> action = new ActionSum();
        int result = calculate(a, b, action);
        System.out.println(result);
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
    }

    private static int calculate(int a, int b, Action<Integer> action) {
        return action.calculate(a, b);
    }

    public static void task3() {
        var supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "In JDK 8";
            }
        };

        System.out.println(supplier.get());
        System.out.println();
    }

    public static void task4() {
        var consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("<b>" + s + "</b>");
            }
        };

        consumer.accept("Test!!!");
        System.out.println();
    }

    public static void task5() {
        var isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        System.out.println(isEven.test(2));
        System.out.println(isEven.test(3));
        System.out.println();
    }

    public static void task6() {
        var function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return (int) Math.pow(integer, 2);
            }
        };

        System.out.println(function.apply(5));
        System.out.println(function.apply(100));
        System.out.println();
    }

    public static void task7() {
        int a = 5;
        int b = 3;
        int result = calculate(a, b, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        });
        System.out.println(result);
    }

    public static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(a, b);
    }
}
