package main.try_2.strings;

import main.try_2.myFeatures.Printer;

public class Lesson_9_3 {

    public static void run() {
        Printer.printLessonNumber(3, 9);
        Printer.printLessonName("Преобразование чисел в строки и обратно");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Неявное преобразование (автоматическое) int в String");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Явное преобразование int в String (и не только int)");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Явное преобразование String в int (и не только int)");
        task3();
    }

    public static void task1() {
        int age = 37;
        String name = "Анна";
        String personInfo = name + " " + age;
        System.out.println(personInfo);
    }

    public static void task2() {
        int age = 37;
        String value = Integer.toString(age);
        Integer ageObject = 37;
        value = ageObject.toString();
        Double weight = 37.0;
        value = weight.toString();
        value = String.valueOf(weight);
    }

    public static void task3() {
        String value = "462943829";
        int count = Integer.parseInt(value);
        System.out.println(count);
        value = "4.62943829";
        double weight = Double.parseDouble(value);
        System.out.println(weight);
        value = "46294382956454646466666666666666666664564629438295645464646666666666666666666456462943829564546464666" +
                "666666666666666645646294382956454646466666666666666666664564629438295645464646666666666666666666456462" +
                "943829564546464666666666666666666645646294382956454646466666666666666666664564629438295645464646666666" +
                "666666666666456462943829564546464666666666666666666645646294382956454646466666666666666666664564629438" +
                "295645464646666666666666666666456462943829564546464666666666666666666645646294382956454646466666666666" +
                "666666664564629438295645464646666666666666666666456462943829564546464666666666666666666645646294382956";
        weight = Double.parseDouble(value);
        System.out.println(weight);
        value = "-46294382956454646466666666666666666664564629438295645464646666666666666666666456462943829564546464666" +
                "666666666666666645646294382956454646466666666666666666664564629438295645464646666666666666666666456462" +
                "943829564546464666666666666666666645646294382956454646466666666666666666664564629438295645464646666666" +
                "666666666666456462943829564546464666666666666666666645646294382956454646466666666666666666664564629438" +
                "295645464646666666666666666666456462943829564546464666666666666666666645646294382956454646466666666666" +
                "666666664564629438295645464646666666666666666666456462943829564546464666666666666666666645646294382956";
        weight = Double.parseDouble(value);
        System.out.println(weight);
    }
}
