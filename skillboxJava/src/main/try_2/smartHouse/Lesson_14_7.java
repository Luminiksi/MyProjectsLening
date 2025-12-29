package main.try_2.smartHouse;

import main.try_2.myFeatures.Printer;

import java.util.Comparator;
import java.util.TreeSet;

public class Lesson_14_7 {
    public static void run() {
        Printer.printLessonNumber(7, 14);
        Printer.printLessonName("Вложенные классы");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Вложенный enum");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Анонимные классы");
        task2();
    }

    public static void task1() {
        Lamp lamp = new Lamp(100);
        lamp.setType(Lamp.Type.LED);
    }

    public static void task2() {
        TreeSet<LightingDevice> devises = new TreeSet<>(new Comparator<LightingDevice>() {
            @Override
            public int compare(LightingDevice o1, LightingDevice o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        });

        LightingDevice device = new LightingDevice(400) {
            @Override
            public double getEnergyConsumption() {
                return power * brightness;
            }
        };
    }
}
