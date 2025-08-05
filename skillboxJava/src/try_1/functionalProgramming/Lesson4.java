package try_1.functionalProgramming;

import try_1.myFeatures.Printer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lesson4 {
    public static void run() {
        Printer.printLessonNumber(4, 16);
        Printer.printLessonName("Лямбда-выражения");
        Printer.printTaskNumber(0);
        Printer.printDescription("Это пример без лямбды, которую мы будет преобразовывать в лямбду");
        task0();
        System.out.println();
        Printer.printTaskNumber(1);
        Printer.printDescription("Первый вариант сокращения");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printDescription("Второй вариант сокращения");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printLessonName("Вывод списка");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printLessonName("Вывод списка - лямбда только метод");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printLessonName("Создание консьюмера");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printLessonName("Создание консьюмера - лямбда только метод");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printLessonName("Создание консьюмера - лямбда только метод");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printLessonName("Создание Supplier - лямбда только метод");
        task8();
        System.out.println();
    }

    public static void task0() {
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

    public static void task1() {
        int a = 5;
        int b = 3;
        int result = calculate(a, b, (x, y) -> x + y);
        System.out.println(result);
    }

    public static void task2() {
        int a = 5;
        int b = 3;
        int result = calculate(a, b, Integer::sum);
        System.out.println(result);
    }

    public static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(a, b);
    }

    public static void task3() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        integers.forEach(integer -> System.out.println(integer));
    }

    public static void task4() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        integers.forEach(System.out::println);
    }

    public static void task5() {
        Consumer<String> consumer = str -> System.out.println(str);
    }

    public static void task6() {
        Consumer<String> consumer = System.out::println;
    }

    public static void task7() {
        Consumer<String> consumer = Lesson4::print;
    }

    public static void print(String string) {
        System.out.println(string);
    }

    public static void task8() {
        Supplier<String> supplier = String::new;
        System.out.println(supplier.get());
    }
}
