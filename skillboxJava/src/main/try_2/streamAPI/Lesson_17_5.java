package main.try_2.streamAPI;

import main.try_2.myFeatures.Printer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Lesson_17_5 {
    public static void run() {
        Printer.printLessonNumber(5, 17);
        Printer.printLessonName("Parallel, reduce и комбинирование операторов");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Обработка жирного стрима (Parallel) - 100_000 строк");
        task1();
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Обработка мелкого стрима (Parallel) - 10 строк");
        task2();
        System.out.println();

        Printer.printTaskNumber(3);
        Printer.printTaskName("reduce");
        task3();
        System.out.println();

        Printer.printTaskNumber(4);
        Printer.printTaskName("reduce - 2");
        task4();
        System.out.println();
        
        Printer.printTaskNumber(5);
        Printer.printTaskName("Работа с sum");
        Printer.printDescription("Для получания суммы");
        task5();
        System.out.println();
        
        Printer.printTaskNumber(6);
        Printer.printTaskName("Работа с average");
        Printer.printDescription("Получение среднего значения (или значения по умолчанию)");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Работа с min");
        Printer.printDescription("Получение минимального значения (или значения по умолчанию)");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Работа с max");
        Printer.printDescription("Получение максимального значения (или значения по умолчанию)");
        task8();
        System.out.println();
        
        Printer.printTaskNumber(10);
        Printer.printTaskName("'Практика - 1' - Сумма заработных плат сотрудников, которые работают меньше 5 лет");
        task10();
        System.out.println();

        Printer.printTaskNumber(11);
        Printer.printTaskName("'Практика - 2' - Максимальная заработная плата сотрудников, которые работают меньше 5 лет");
        task11();
        System.out.println();
    }

    public static void task1() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            strings.add(Double.toString(Math.random()));
        }

        long start = System.currentTimeMillis();
        long count = strings.stream().filter(s -> {
            String text = "";
            for (int i = 0; i < 50; i++) {
                text += s;
            }
            return text.contains("absd");
        }).count();
        long duration = System.currentTimeMillis() - start;
        System.out.println("Sequential: " + duration);
        System.out.println(count);
        System.out.println();

        start = System.currentTimeMillis();
        count = strings.stream()
                .parallel()
                .filter(s -> {
            String text = "";
            for (int i = 0; i < 50; i++) {
                text += s;
            }
            return text.contains("absd");
        }).count();
        duration = System.currentTimeMillis() - start;
        System.out.println("Parallel: " + duration);

        System.out.println(count);
    }

    public static void task2() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(Double.toString(Math.random()));
        }

        long start = System.currentTimeMillis();
        long count = strings.stream().filter(s -> {
            String text = "";
            for (int i = 0; i < 50; i++) {
                text += s;
            }
            return text.contains("absd");
        }).count();
        long duration = System.currentTimeMillis() - start;
        System.out.println("Sequential: " + duration);
        System.out.println(count);
        System.out.println();

        start = System.currentTimeMillis();
        count = strings.stream()
                .parallel()
                .filter(s -> {
                    String text = "";
                    for (int i = 0; i < 50; i++) {
                        text += s;
                    }
                    return text.contains("absd");
                }).count();
        duration = System.currentTimeMillis() - start;
        System.out.println("Parallel: " + duration);

        System.out.println(count);
    }

    public static void task3() {
        int[] numbers = {4, 5, 3};
        int result = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }

    public static void task4() {
        int[] numbers = {4, 5, 3};
        int result = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println(result);
    }

    public static void task5() {
        int[] numbers = {4, 5, 6};
        int result = Arrays.stream(numbers).sum();
        System.out.println(result);
    }

    public static void task6() {
        int[] numbers = {4, 5, 6};
        Object result = Arrays.stream(numbers).average().orElse(0.0);
        System.out.println(result);
    }

    public static void task7() {
        int[] numbers = {4, 5, 6};
        Object result = Arrays.stream(numbers).max().orElse(Integer.MAX_VALUE);
        System.out.println(result);
    }

    public static void task8() {
        int[] numbers = {4, 5, 6};
        Object result = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        System.out.println(result);
    }

    public static void task9() {
        int[] numbers = {4, 5, 6};
        Object result = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        System.out.println(result);
    }

    public static void task10() {
        Stream<Employee> employess = Stream.of(
                new Employee(100000, LocalDate.of(2020, 12, 10)),
                new Employee(120000, LocalDate.of(2022, 10, 4)),
                new Employee(80000, LocalDate.of(2019, 1, 30)),
                new Employee(205000, LocalDate.of(2018, 7, 17)),
                new Employee(95000, LocalDate.of(2020, 8, 26)),
                new Employee(170000, LocalDate.of(2023, 10, 14)),
                new Employee(145000, LocalDate.of(2020, 9, 3)),
                new Employee(112000, LocalDate.of(2020, 5, 1))
        );

        int sum = employess
                .filter(e -> e.getHiringDate().isAfter(LocalDate.now().minusYears(5)))
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);
        System.out.println("Summ = " + sum);
    }

    public static void task11() {
        Stream<Employee> employess = Stream.of(
                new Employee(100000, LocalDate.of(2020, 12, 10)),
                new Employee(120000, LocalDate.of(2022, 10, 4)),
                new Employee(80000, LocalDate.of(2019, 1, 30)),
                new Employee(205000, LocalDate.of(2018, 7, 17)),
                new Employee(95000, LocalDate.of(2020, 8, 26)),
                new Employee(170000, LocalDate.of(2023, 10, 14)),
                new Employee(145000, LocalDate.of(2020, 9, 3)),
                new Employee(112000, LocalDate.of(2020, 5, 1))
        );
        Optional<Employee> max = employess
                .filter(e -> e.getHiringDate().isAfter(LocalDate.now().minusYears(5)))
                .max(Comparator.comparing(Employee::getSalary));
        if (max.isPresent()) {
            System.out.println("max = " + max.get().getSalary());
        }
    }

}
