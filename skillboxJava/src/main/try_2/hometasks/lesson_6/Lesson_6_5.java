package main.try_2.hometasks.lesson_6;

import main.try_2.myFeatures.Printer;

public class Lesson_6_5 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Printer.printLessonNumber(5, 6);
        Printer.printLessonName("Enum");
        Printer.printDescription("Доп. задание");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Задание 1. Создание класса ArithmeticCalculator, использующего enum-переменную");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Задание 2. Создание нескольких связанных классов и enum");
        task2();
    }

    public static void task1() {
        ArithmeticCalculator calculator = new ArithmeticCalculator(7, 3);
        System.out.println("ADD - " + calculator.calculate(Operation.ADD));
        System.out.println("MULTIPLY - " + calculator.calculate(Operation.MULTIPLY));
        System.out.println("SUBTRACT - " + calculator.calculate(Operation.SUBTRACT));
    }

    public static void task2() {
        Engine engine = new Engine(EngineType.HYBRID, 3.5, 125);
        Car car = new Car(engine, CarType.SEDAN, 2300);
        System.out.println(car);
    }
}
