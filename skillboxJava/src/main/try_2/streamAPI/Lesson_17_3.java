package main.try_2.streamAPI;

import main.try_2.myFeatures.Printer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Lesson_17_3 {
    public static void run() {
        Printer.printLessonNumber(3, 17);
        Printer.printLessonName("Промежуточные операторы");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Умножение элементов на 2");
        task1();
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Умножение элементов на 2 - сокращенный вариант");
        task2();
        System.out.println();

        Printer.printTaskNumber(3);
        Printer.printTaskName("Фильтрация с помощью filter");
        task3();
        System.out.println();

        Printer.printTaskNumber(4);
        Printer.printTaskName("Фильтрация с помощью filter - сокращенный вариант");
        task4();
        System.out.println();

        Printer.printTaskNumber(5);
        Printer.printTaskName("Получаем String массив, но вывод будет корявым");
        task5();
        System.out.println();

        Printer.printTaskNumber(6);
        Printer.printTaskName("Тоже что и в 5ом, но импользуем flatMap и не будет множества массивов");
        task6();
        System.out.println();

        Printer.printTaskNumber(7);
        Printer.printTaskName("Убираем повторы - использование distinct(сравнение через equals и hashcode)");
        task7();
        System.out.println();

        Printer.printTaskNumber(8);
        Printer.printTaskName("Сортировка - использование sorted(работает как и в коллекции - нужен интерфейс Comparable)");
        task8();
        System.out.println();

        Printer.printTaskNumber(9);
        Printer.printTaskName("Сортировка с использованием компоратора(по длине строки)");
        task9();
        System.out.println();

        Printer.printTaskNumber(10);
        Printer.printTaskName("Использование peek для строки (используем для логирования, т.к. объекты внутри стрима не изменяются)");
        task10();
        System.out.println();

        Printer.printTaskNumber(11);
        Printer.printTaskName("Использование limit - орагничение");
        task11();
        System.out.println();

        Printer.printTaskNumber(12);
        Printer.printTaskName("Использование skip - пропуск элементов(первых)");
        task12();
        System.out.println();

        Printer.printTaskNumber(13);
        Printer.printTaskName("Пропуск первых 3х и вывод 4х (skip и limit)");
        task13();
        System.out.println();
    }

    public static void task1() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> integerStream = stream.map(i -> i * 2);
        integerStream.forEach(System.out::println);
    }

    public static void task2() {
        Stream.of(1, 2, 3, 4, 5)
                .map(i -> i * 2)
                .forEach(System.out::println);
    }

    public static void task3() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(number -> {
                    if (number % 3 == 0) {
                        return true;
                    }
                    return false;

                })
                .forEach(System.out::println);
    }

    public static void task4() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(number -> number % 3 == 0)
                .forEach(System.out::println);
    }

    public static void task5() {
        Stream.of("one, two, three", "four, five, six", "seven, eight, nine")
                .map(str -> str.split(", "))
                .forEach(System.out::println);
    }

    public static void task6() {
        Stream.of("one, two, three", "four, five, six", "seven, eight, nine")
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .forEach(System.out::println);
    }

    public static void task7() {
        Stream.of("skill", "box", "skill", "box")
                .distinct()
                .forEach(System.out::println);
    }

    public static void task8() {
        Stream.of("skill", "java", "art", "box")
                .sorted()
                .forEach(System.out::println);
    }

    public static void task9() {
        Stream.of("skill", "java coding", "art")
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    public static void task10() {
        "wqerqwer".chars()
                .peek(c -> System.out.println("char: " + (char) c))
                .forEach(System.out::println);
    }

    public static void task11() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .limit(2)
                .forEach(System.out::println);
    }

    public static void task12() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .skip(2)
                .forEach(System.out::println);
    }

    public static void task13() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .skip(3)
                .limit(4)
                .forEach(System.out::println);
    }
}
