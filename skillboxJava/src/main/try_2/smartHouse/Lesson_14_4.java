package main.try_2.smartHouse;

import main.try_2.myFeatures.Printer;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson_14_4 {
    public static void run() {
        Printer.printLessonNumber(4, 14);
        Printer.printLessonName("Интерфейсы в языке Java");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Пример интерфейса Comparable");
        task1();
    }

    public static void task1() {
        ArrayList<Lamp> lamps = new ArrayList<>();
        lamps.add(new Lamp(100));
        lamps.add(new Lamp(20));
        lamps.add(new Lamp(40));
        lamps.add(new Lamp(150));

        Collections.sort(lamps);
        for (Lamp lamp : lamps) {
            System.out.println(lamp);
        }
    }
}
