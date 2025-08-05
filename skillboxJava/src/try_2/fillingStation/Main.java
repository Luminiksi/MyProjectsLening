package try_2.fillingStation;

import try_2.myFeatures.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.printLessonNumber(8, 1);
        Printer.printLessonName("Пишем простое приложение");
        task0();
        Printer.printSeparator();


        Printer.printLessonNumber(14, 1);
        Printer.printLessonName("Практическая работа");
        Printer.getStringTaskNumber(1);
        Printer.printTaskName("Задание 1");
        task1();
        System.out.println();
        Printer.getStringTaskNumber(2);
        Printer.printTaskName("Задание 2");
        task2();
    }

    public static void task0() {
        System.out.println("Система расчёта стоимости топлива");

        int fuelType = 95;
        int amount = 50;

        double furl92price = 60.2;
        double furl95price = 67.33;

        double fuelPrice = 69.5;
        if (fuelType == 92) {
            fuelPrice = furl92price;
        } else if (fuelType == 95){
            fuelPrice = furl95price;
        } else {
            System.out.println("Указан не верный тип топлива");
        }

        if (amount < 1) {
            System.out.println("Указано слишком маленькое количество топлива");
            amount = 0;
        }

        System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");

        double totalPrice = fuelPrice * amount;

        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }

    public static void task1() {
        System.out.println("Информация о системе");
        System.out.print("Операционная система: ");
        System.out.println(System.getProperty("os.name") + " " + System.getProperty("os.version"));
        System.out.print("Количество ядер процессора: ");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.print("Количество памяти, доступной JVM: ");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "Mb");
    }

    public static void task2() {
        System.out.println("Система расчёта стоимости топлива");

        int fuelType = 95;
        int amount = 420;

        double furl92price = 60.2;
        double furl95price = 67.33;

        double fuelPrice = 69.5;

        int maxAmount = 400;

        if (fuelType == 92) {
            fuelPrice = furl92price;
        } else if (fuelType == 95){
            fuelPrice = furl95price;
        } else {
            System.out.println("Указан не верный тип топлива");
        }

        if (amount < 1) {
            System.out.println("Указано слишком маленькое количество топлива");
            amount = 0;
        } else if (amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
            amount = maxAmount;
        }

        System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");

        double totalPrice = fuelPrice * amount;

        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }



}
