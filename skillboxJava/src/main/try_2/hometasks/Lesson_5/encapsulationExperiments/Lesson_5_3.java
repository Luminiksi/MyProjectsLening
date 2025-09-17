package main.try_2.hometasks.Lesson_5.encapsulationExperiments;

import main.try_2.myFeatures.Printer;

public class Lesson_5_3 {
    public static void run() {
        Printer.printLessonNumber(3, 5);
        Printer.printLessonName("POJO-классы, геттеры и сеттеры");

        Printer.getStringTaskNumber(1);
        Printer.printTaskName("Создайте класс для хранения данных о странах");
        task1();
        System.out.println();
        Printer.getStringTaskNumber(2);
        Printer.printTaskName("Создайте класс для хранения данных о любом объекте реального мира");
        task2();
    }

    public static void task1() {
        Country country = new Country("My Country");
        country.setCapital("Capital");
        country.setPopulation(5000);
        country.setHasSea(true);
        country.setSquare(6000);
        System.out.println("Country name - " + country.getName());
        System.out.println("Country capital - " + country.getCapital());
        System.out.println("Country population - " + country.getPopulation());
        System.out.println("Country has sea? - " + country.hasSea());
        System.out.println("Country square - " + country.getSquare());
    }

    public static void task2() {
        Book book = new Book("My Book");
        book.setAuthor("Author");
        book.setPages(356);
        System.out.println("Book name - " + book.getName());
        System.out.println("Book author - " + book.getAuthor());
        System.out.println("Book pages - " + book.getPages());
    }
}
