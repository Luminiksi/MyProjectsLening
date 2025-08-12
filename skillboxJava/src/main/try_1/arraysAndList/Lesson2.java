package main.try_1.arraysAndList;

import main.try_1.myFeatures.Printer;

public class Lesson2 {
    public static void run() {
        Printer.printLessonNumber(3, 10);
        Printer.printLessonName("Работа с массивами в циклах");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        task4();

        System.out.println();
        System.out.println();
    }

    public static void task1() {
        int certCount = 1000;
        int[] certNumbers = new int[certCount];
        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
        }

        int winnersRate = 100;
        int[] winnerNumbers = new int[certNumbers.length / winnersRate];

        int winnerNumberIndex = 0;
        for (int i = 0; i < certNumbers.length; i += 100) {
            winnerNumbers[winnerNumberIndex++] = certNumbers[i];
        }
    }

    public static void task2() {
        int certCount = 1000;
        int winnersRate = 100;
        int[] certNumbers = new int[certCount];
        boolean[] certIsWin = new boolean[certCount];
        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            certIsWin[i] = i % winnersRate == 0;
        }
    }

    public static void task3() {
        int[] rooms = {15, 22, 23, 22, 22, 23};

        double roomArea = 5.72;

        double[] roomAreas = new double[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            roomAreas[i] = rooms[i] * roomArea;
        }
    }

    public static void task4() {
        Product[] products = {
                new Product("Молоко", 75),
                new Product("Масло", 120),
                new Product("Сыр", 180),
                new Product("Чайник", 1890),
                new Product("Фильтр для воды", 1200)
        };

        int MIN_PRICE_FOR_DISCOUNT = 1000;
        double discount = 0.1;
        for(Product product : products) {
            int price = product.getPrice();
            if(price >= MIN_PRICE_FOR_DISCOUNT) {
                product.setPrice((int) (price * (1 - discount)));
            }
        }

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
