package main.try_2.streamAPI;

import main.try_2.myFeatures.Printer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson_17_2 {
    public static void run() {
        Printer.printLessonNumber(2, 17);
        Printer.printLessonName("Создание Stream");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Создание Stream");
        task1();
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Цикл со счетчиком - 10");
        task2();
        System.out.println();
    }

    public static void task1() {
        System.out.println("Создание пустого стрима");
        Stream<String> streamEmpty = Stream.empty();

        System.out.println("Создание стрима на основе Array");
        Stream<String> streamOfArray = Stream.of("a", "b", "c");

        System.out.println("Создание стрима на основе коллекции");
        List<Double> doubleList = List.of(1d, 2d, 3d);
        Stream<Double> streamOfDouble = doubleList.stream();

        System.out.println("Создание стрима на основе коллекции массива");
        double[] arrayDouble = {1.3, 2.4, 5.2};
        DoubleStream doubleStream = Arrays.stream(arrayDouble);

        System.out.println("Создание бесконечного стрима");
        Stream<Double> streamOfDouble2 = Stream.generate(Math::random);

        System.out.println("Создание бесконечного стрима с ограничением");
        Stream<Double> streamOfDouble3 = Stream.generate(Math::random).limit(10);
        streamOfDouble3.forEach(System.out::println);
    }

    public static void task2() {
        IntStream.range(0, 10).forEach(System.out::println);
    }
}
