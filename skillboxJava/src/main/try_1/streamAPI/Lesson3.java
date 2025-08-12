package main.try_1.streamAPI;

import main.try_1.myFeatures.Printer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Lesson3 {
    public static void run() {
        Printer.printLessonNumber(3, 17);
        Printer.printLessonName("Промежуточные операторы");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printDescription("Сокращенный вариант написания первой задачи");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Работа с flatMap - преобразование в стрим то, с чем работали");
        Printer.printDescription("чтобы не выдавало подмножество массиво в результате");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Работа с distinct");
        Printer.printDescription("оставляет уникальные эементы(убирает дубли) - через equals и hachcode");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Работа с sorted");
        Printer.printDescription("оставляет уникальные эементы(убирает дубли) - через equals и hachcode");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Работа с sorted");
        Printer.printDescription("Работа с помощью компоратора");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Работа с peek");
        Printer.printDescription("Рекомендуется использовать данный метод только для логирования");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        Printer.printTaskName("Работа с limit / skip");
        Printer.printDescription("ограничение стрима по элементам");
        task9();
        System.out.println();
    }

    public static void task1() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Stream<Integer> integerStream = stream.map(i -> i * 2);
        integerStream.forEach(System.out::println);
    }

    public static void task2() {
        Stream.of(1, 2, 3)
                .map(i -> i * 2)
                .forEach(System.out::println);
    }

    public static void task3() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(number -> number % 3 == 0)
                .forEach(System.out::println);
    }

    public static void task4() {
        Stream.of("one, two, three",
                        "foer, five, six,",
                        "seven, eight, nine")
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .forEach(System.out::println);
    }

    public static void task5() {
        Stream.of("skill", "box", "skill", "box")
                .distinct()
                .forEach(System.out::println);
    }

    public static void task6() {
        Stream.of("skillbox", "java", "art-testing")
                .sorted()
                .forEach(System.out::println);
    }

    public static void task7() {
        Stream.of("skillbox", "java", "art-testing")
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    public static void task8() {
        "abcd".chars()
                .peek(c -> System.out.println("char: " + c))
                .forEach(System.out::println);
    }

    public static void task9() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .limit(3)
                .forEach(System.out::println);
        System.out.println();
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .skip(3)
                .forEach(System.out::println);
    }
}
