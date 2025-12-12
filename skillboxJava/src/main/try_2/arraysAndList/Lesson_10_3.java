package main.try_2.arraysAndList;

import main.try_2.myFeatures.Printer;

public class Lesson_10_3 {

    public static void run() {
        Printer.printLessonNumber(3, 10);
        Printer.printLessonName("Работа с массивами в циклах");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Сгенерируем 1000 различных сертификатов");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Находим выигрышные номера");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Находим выигрышные номера - 2");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Работа с несколькими массивами (перебирвем обычным for)");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Работа с foreach");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("ЦИкл с заменой элементов");
        task6();
    }

    public static void task1() {
        int certCount = 1000;
        int[] certNumbers = new int[certCount];
        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
        }

//        for (int i = 0; i < certNumbers.length; i++) {
//            System.out.println(certNumbers[i]);
//        }
    }

    public static void task2() {
        int certCount = 1000;
        int[] certNumbers = new int[certCount];
        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
        }

        int winnersRate = 100;
        int[] winnersNumbers = new int[certNumbers.length / winnersRate];

        int winnerNumberIndex = 0;
        for (int i = 0; i < certNumbers.length; i += winnersRate) {
            winnersNumbers[winnerNumberIndex++] = certNumbers[i];
        }
    }

    public static void task3() {
        int certCount = 1000;
        int winnersRate = 100;
        int[] certNumbers = new int[certCount];
        boolean[] certIsWin = new boolean[certCount];

        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            certIsWin[i] = i % winnersRate == 0;
        }
    }

    public static void task4() {
        int[] rooms = {15, 22, 22, 23, 22, 22, 23};
        double roomArea = 5.72;

        double[] roomsAreas = new double[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            roomsAreas[i] = rooms[i] * roomArea;
        }
    }

    public static void task5() {
        Product[] products = {
                new Product("Молоко", 75),
                new Product("Масло", 187),
                new Product("Сыр", 230),
                new Product("Чайник", 1890),
                new Product("Фильтр для воды", 1200)
        };

        int MIN_PRICE_FOR_DISCOUNT = 1000;
        double discount = 0.1;
        for (Product product : products) {
            int price = product.getPrice();
            if (price >= MIN_PRICE_FOR_DISCOUNT) {
                product.setPrice((int) (price * (1 - discount)));
            }
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void task6() {
        ProductFinal[] products = {
                new ProductFinal("Молоко", 75),
                new ProductFinal("Масло", 187),
                new ProductFinal("Сыр", 230),
                new ProductFinal("Чайник", 1890),
                new ProductFinal("Фильтр для воды", 1200)
        };

        int MIN_PRICE_FOR_DISCOUNT = 1000;
        double discount = 0.1;
        for (int i = 0; i < products.length; i++) {
            ProductFinal product = products[i];
            int price = product.getPrice();
            if (price >= MIN_PRICE_FOR_DISCOUNT) {
                int newPrice = (int) (price * (1 - discount));
                products[i] = new ProductFinal(product.getName(), newPrice);
            }

        }

        for (ProductFinal product : products) {
            System.out.println(product);
        }
    }
}
