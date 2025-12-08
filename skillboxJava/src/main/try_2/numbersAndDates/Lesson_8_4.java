package main.try_2.numbersAndDates;

import main.try_2.myFeatures.Printer;

public class Lesson_8_4 {
    public static void run() {
        Printer.printLessonNumber(4, 8);
        Printer.printLessonName("Преобразование (приведение) чисел");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Явное приведение типов");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Не явное приведение типов");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Ещё примеры преобразований");
        task3();
    }

    public static void task1() {
        RemoteControl control = new RemoteControl();
        int temp = (int) control.getTemperature();

        AirConditioner airConditioner = new AirConditioner();
        airConditioner.setTemperature(temp);
    }

    public static void task2() {
        RemoteControl control = new RemoteControl();
        int temp = 22;
        control.setTemperature(temp);
        System.out.println(control.getTemperature());
    }

    public static void task3() {
        double value = 56;
        System.out.println(value);
        value = 5 / 2;
        System.out.println(value);
        value = 5.0 / 2;
        System.out.println(value);
        value = (double) 5 / 2;
        System.out.println(value);
        System.out.println();
        value = 35 / 20 + 75.5;
        System.out.println(value);
        value = (double) 35 / 20 + 75.5;
        System.out.println(value);
        System.out.println();

        double param = 0.75;
        int valueInt = (int) param;
        System.out.println(valueInt);
        System.out.println();

        System.out.println("Работа с long");
        long now = System.currentTimeMillis();
        int seconds = (int) (now / 1000);
        System.out.println(seconds);

        long valueLong = 1_000_000_000_000L;
        System.out.println((int) valueLong);

        System.out.println("Работа с float");
        int number = 987654321;
        float valueF = number;
        System.out.println(valueF);
        System.out.println((int) valueF);
    }
}
