package streamAPI;

import myFeatures.Printer;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson4 {
    public static void run() throws InterruptedException {
        Printer.printLessonNumber(4, 17);
        Printer.printLessonName("Создание Stream");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Терминальный оператор forEach");
        Printer.printDescription("применяет консьюмер к стриму");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Терминальный оператор count");
        Printer.printDescription("подсчет количества элементов");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Терминальный оператор min");
        Printer.printDescription("находит минимальный элемент изх стрима, по правилу компоратора в нем");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Терминальный оператор max");
        Printer.printDescription("находит максимальный элемент изх стрима, по правилу компоратора в нем");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printDescription("если ничего не найдет после фильтра");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printDescription("работа с Optional");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Терминальный оператор collect");
        Printer.printDescription("преобразует итоговый стрим в коллекцию");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Терминальный оператор collect");
        Printer.printDescription("работа с map");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        Printer.printDescription("работа с map, если одинаковые ключи");
        try {
            task9();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(100);
        System.out.println();
        Printer.printTaskNumber(10);
        Printer.printDescription("исправляем ошибку");
        task10();
        System.out.println();
        Printer.printTaskNumber(11);
        Printer.printDescription("работаем с Collectors.groupingBy");
        task11();
        System.out.println();
        Printer.printTaskNumber(12);
        Printer.printDescription("работаем с Collectors.groupingBy(Function.identity(), Collectors.counting()) - аля водсчет элементов");
        task12();
        System.out.println();
        Printer.printTaskNumber(13);
        Printer.printTaskName("Терминальный оператор anyMatch");
        Printer.printDescription("возвращает true, если хотя бы один элемент удовлетворяет условию");
        task13();
        System.out.println();
        Printer.printTaskNumber(14);
        Printer.printTaskName("Терминальный оператор noneMatch");
        Printer.printDescription("возвращает true, если ни один из элементов не удовлетворяет условию");
        task14();
        System.out.println();
        Printer.printTaskNumber(15);
        Printer.printTaskName("Терминальный оператор allMatch");
        Printer.printDescription("возвращает true, если все элементы удовлетворяют условию");
        task15();
        System.out.println();
    }

    public static void task1() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .skip(3)
                .forEach(System.out::println);
    }

    public static void task2() {
        long count = Stream.of("skill", "box", "skill", "box")
                .distinct()
                .count();
        System.out.println(count);
    }

    public static void task3() {
        Optional<String> shortest = Stream.of("skill", "box", "skill", "box")
                .min(Comparator.comparing(String::length));
        System.out.println(shortest);
    }

    public static void task4() {
        Optional<String> shortest = Stream.of("skill", "box", "skill", "box")
                .max(Comparator.comparing(String::length));
        System.out.println(shortest);
    }

    public static void task5() {
        Optional<String> shortest = Stream.of("skill", "box", "skill", "box")
                .filter(str -> str.equals("1231"))
                .max(Comparator.comparing(String::length));
        System.out.println(shortest);
    }

    public static void task6() {
        Optional<String> shortest = Stream.of("skill", "box", "skill", "box")
                .filter(str -> str.equals("1231"))
                .max(Comparator.comparing(String::length));
        System.out.println(shortest);
        if (shortest.isPresent()) {
            System.out.println("Есть значение - " + shortest.get() + "!");
        } else {
            System.out.println("Тут пусто");
        }
    }

    public static void task7() {
        List<Integer> collection = Stream.of(10, 100, 5, 100)
                .map(x -> x * 2)
                .collect(Collectors.toList());
        collection.forEach(System.out::println);
    }

    public static void task8() {
        Map<String, Person> map = Stream.of(
                new Person("1"), new Person("2"), new Person("3")
        ).collect(Collectors.toMap(Person::getPhone, person -> person));
        map.forEach((s, person) -> System.out.println(s + " = " + person));
    }

    public static void task9() {
        Map<String, Person> map = Stream.of(
                new Person("1"), new Person("1"), new Person("3")
        ).collect(Collectors.toMap(Person::getPhone, person -> person));
        map.forEach((s, person) -> System.out.println(s + " = " + person));
    }

    public static void task10() {
        Map<String, Person> map = Stream.of(
                new Person("1"), new Person("1"), new Person("3")
        ).collect(Collectors.toMap(Person::getPhone, person -> person,
                (existing, current) -> existing));
        map.forEach((s, person) -> System.out.println(s + " = " + person));
    }

    public static void task11() {
        Map<Integer, List<Person>> map = Stream.of(
                new Person("1"),
                new Person("2"),
                new Person("3"),
                new Person("24"),
                new Person("53")
        ).collect(Collectors.groupingBy((p) -> p.getPhone().length()));
        map.forEach((integer, people) -> System.out.println(integer + " - " + people));
    }

    public static void task12() {
        Map<String, Long> map = Stream.of(
                "a", "a", "c", "b", "c", "a"
        ).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

    public static void task13() {
        boolean hasMoreThan10 = Stream.of(1, 2, 3, 4, 5)
                .anyMatch(i -> i > 10);
        System.out.println(hasMoreThan10);
    }

    public static void task14() {
        boolean hasMoreThan10 = Stream.of(1, 2, 3, 4, 5)
                .noneMatch(i -> i > 10);
        System.out.println(hasMoreThan10);
    }

    public static void task15() {
        boolean hasMoreThan10 = Stream.of(1, 2, 3, 4, 5)
                .allMatch(i -> i > 10);
        System.out.println(hasMoreThan10);
    }
}
