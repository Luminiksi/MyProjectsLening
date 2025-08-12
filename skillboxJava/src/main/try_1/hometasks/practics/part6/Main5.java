package main.try_1.hometasks.practics.part6;

import main.try_1.myFeatures.Printer;

public class Main5 {
    public static void main(String[] args) {
        Printer.printLessonNumber(6,6);
        Printer.printTaskNumber(1);
        Printer.printTaskName("Создание класса ArithmeticCalculator, использующего enum-переменную");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Создание нескольких связанных классов и enum");
        task2();
    }

    public static void task1() {
        ArithmeticCalculator calculator = new ArithmeticCalculator(3, 2);
        System.out.println(calculator.calculate(Operation.ADD));
        System.out.println(calculator.calculate(Operation.MULTIPLY));
        System.out.println(calculator.calculate(Operation.SUBTRACT));
    }

    public static void task2() {
        Engine engine = new Engine(EngineType.DIESEL,3.5, 156);
        Car car = new Car(engine, CarType.SUV, 2300);
        car.printInfo();
    }
}
