package streamAPI;

import myFeatures.Printer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson2 {
    public static void run() {
        Printer.printLessonNumber(2, 17);
        Printer.printLessonName("Создание Stream");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Создание стримов");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();

    }

    public static void task1() {
        System.out.println("Пустой стрим");
        Stream<String> streamEmpty = Stream.empty();
        System.out.println("Стрим на основе перечисления");
        Stream<String> streamOfArray = Stream.of("a", "b", "c", "d");
        System.out.println("Стрим на основе списка");
        List<Double> doubleList = List.of(1d, 2d, 3d);
        Stream<Double> stream = doubleList.stream();
        System.out.println("Стрим на основе массива");
        int[] array = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(array);

        System.out.println("Стрим на основе рандомных значений (аналог бесконечного цикла будет)");
        Stream<Double> stream1 = Stream.generate(Math::random);
        System.out.println("Стрим на основе рандомных значений (с ограничением по количеству значений)");
        Stream<Double> stream2 = Stream.generate(Math::random).limit(10);
        stream2.forEach(System.out::println);
    }

    public static void task2() {
        System.out.println("Старвый вариант:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Новый вариант:");
        IntStream.range(0, 10).forEach(System.out::println);
    }
}
