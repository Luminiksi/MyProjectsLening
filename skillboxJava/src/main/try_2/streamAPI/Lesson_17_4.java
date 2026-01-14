package main.try_2.streamAPI;

import main.try_2.myFeatures.Printer;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson_17_4 {
    public static void run() {
        Printer.printLessonNumber(4, 17);
        Printer.printLessonName("Терминальные операторы");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Оператор count() - подсчет");
        task1();
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Оператор min() - минимальный элемент");
        task2();
        System.out.println();

        Printer.printTaskNumber(3);
        Printer.printTaskName("Оператор max() - максимальный элемент");
        task3();
        System.out.println();

        Printer.printTaskNumber(4);
        Printer.printTaskName("Оператор max() - если ничего не найдено(т.к. есть метод filter)");
        task4();
        System.out.println();

        Printer.printTaskNumber(5);
        Printer.printTaskName("Оператор collect() - перобразование в коллекцию -> List");
        task5();
        System.out.println();

        Printer.printTaskNumber(6);
        Printer.printTaskName("Оператор collect() - перобразование в коллекцию -> Set");
        task6();
        System.out.println();

        Printer.printTaskNumber(7);
        Printer.printTaskName("Оператор collect() - перобразование в коллекцию -> Map");
        task7();
        System.out.println();

        Printer.printTaskNumber(8);
        Printer.printTaskName("Оператор collect() - перобразование в коллекцию -> Map(правим дубликаты)");
        task8();
        System.out.println();

        Printer.printTaskNumber(9);
        Printer.printTaskName("Оператор collect() - перобразование в коллекцию -> Map(с групировками)");
        task9();
        System.out.println();

        Printer.printTaskNumber(10);
        Printer.printTaskName("Оператор collect() - перобразование в коллекцию -> Map(с групировками)");
        task10();
        System.out.println();

        Printer.printTaskNumber(11);
        Printer.printTaskName("anyMatch / noneMatch / allMatch");
        task11();
        System.out.println();
    }

    public static void task1() {
        long count = Stream.of("skill", "box", "skill", "box")
                .distinct()
                .count();
        System.out.println(count);
    }

    public static void task2() {
        Optional<String> result = Stream.of("skill", "box", "skill", "box")
                .min(Comparator.comparing(String::length));
        System.out.println(result);
    }

    public static void task3() {
        Optional<String> result = Stream.of("skill", "box", "skill", "box")
                .max(Comparator.comparing(String::length));
        System.out.println(result);
    }

    public static void task4() {
        Optional<String> result = Stream.of("skill", "box", "skill", "box")
                .filter(str -> str.equals("skillbox"))
                .max(Comparator.comparing(String::length));
        System.out.println(result);
    }

    public static void task5() {
        List<Integer> collection = Stream.of(10, 100,5, 100)
                .map(x -> x * 2)
                .collect(Collectors.toList());
        collection.forEach(System.out::println);
    }

    public static void task6() {
        Set<Integer> collection = Stream.of(10, 100,5, 100)
                .map(x -> x * 2)
                .collect(Collectors.toSet());
        collection.forEach(System.out::println);
    }

    public static void task7() {
        Map<String, Person> map = Stream.of(
                new Person("1"),
                new Person("2"),
                new Person("3")
        ).collect(Collectors.toMap(Person::getPhone, person -> person));

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void task8() {
        Map<String, Person> map = Stream.of(
                new Person("1"),
                new Person("1"),
                new Person("3")
        ).collect(Collectors.toMap(Person::getPhone, person -> person, (existing, current) -> existing));

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void task9() {
        Map<Integer, List<Person>> map = Stream.of(
                new Person("1"),
                new Person("2"),
                new Person("3"),
                new Person("24"),
                new Person("33")
        ).collect(Collectors.groupingBy((p) -> p.getPhone().length()));

        map.forEach((integer, people) -> System.out.println(integer + ": " + people));
    }

    public static void task10() {
        Map<String, Long> map = Stream.of(
                "a", "a", "c", "b", "c", "a"
        ).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

    public static void task11() {
        System.out.println("Если хоть один элемент проходит условие - anyMatch");
        boolean hasMoreThan10_1 = Stream.of(1, 2, 3, 4, 5).anyMatch(i -> i > 10);
        System.out.println(hasMoreThan10_1);

        System.out.println("Если ни один элемент проходит условие - noneMatch");
        boolean hasMoreThan10_2 = Stream.of(1, 2, 3, 4, 5).noneMatch(i -> i > 10);
        System.out.println(hasMoreThan10_2);

        System.out.println("Если все элементы проходят условие - allMatch");
        boolean hasMoreThan10_3 = Stream.of(1, 2, 3, 4, 5).allMatch(i -> i > 10);
        System.out.println(hasMoreThan10_3);
    }
}
