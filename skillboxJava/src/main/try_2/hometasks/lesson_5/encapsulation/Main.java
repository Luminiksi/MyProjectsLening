package main.try_2.hometasks.lesson_5.encapsulation;

import main.try_2.myFeatures.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Printer.printLessonNumber(9, 5);
        Printer.printLessonName("Практическая работа");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Задание 1");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Задание 2");
        task2();
    }

    public static void task1() {
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа(если хотите прервать, напишите '999'): ");
            int floor = new Scanner(System.in).nextInt();
            if (floor == 999) {
                break;
            }
            elevator.move(floor);
        }
    }

    public static void task2() {
        Dimensions dimensions = new Dimensions(45, 67, 13);
        Cargo cargo = new Cargo(dimensions, 34.2, "my address", true, "32423sdfsdf3423", false);
        System.out.println(cargo);
        System.out.println();
        Cargo changeCargo = cargo.setAddress("new address");
        System.out.println(changeCargo);
        System.out.println();
        changeCargo = changeCargo.setDimensions(new Dimensions(1, 1, 1));
        System.out.println(changeCargo);
        System.out.println();
        changeCargo = changeCargo.setWeight(12.4);
        System.out.println(changeCargo);
    }
}
