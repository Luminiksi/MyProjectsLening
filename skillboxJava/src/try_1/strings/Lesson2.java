package try_1.strings;

import try_1.myFeatures.Printer;

import java.time.LocalDate;

public class Lesson2 {
    public static void run() {
        Printer.printLessonNumber(2, 9);
        Printer.printLessonName("Строки, конкатенация и сравнение");
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
        Printer.printDescription("конкатенация большого количества строк с использованиес String");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printDescription("конкатенация большого количества строк с использованиес StringBuilder");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printDescription("Без использования метода .concat()");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printDescription("С использованием метода .concat()");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printDescription("Тоже самое, что и 5ый паример, но - с использованием метода .concat() в классе Product в методе toString()");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        task9();
        System.out.println();
        Printer.printTaskNumber(10);
        task10();
        System.out.println();
        Printer.printTaskNumber(11);
        task11();
        System.out.println();
    }

    public static void task1() {
        String empty = "";

        boolean isEmpty = empty.length() == 0;
        System.out.println(isEmpty);
        System.out.println(empty.isEmpty());
        System.out.println(empty.isBlank());

        String blank = "  \t \n     ";
        System.out.println(blank.isEmpty());
        System.out.println(blank.isBlank());
    }

    public static void task2() {
        String name = "Дмитрий";
        String surname = "Петров";
        LocalDate birthday = LocalDate.of(1986, 4, 15);

        String fullName = name + " " + surname + " - " + birthday;
        System.out.println(fullName);
    }

    public static void task3() {
        Product soap = new Product("Мыло", 100);
        String productInfo = "Информация о продукте: " + soap;
        System.out.println(productInfo);
    }

    public static void task4() {
        Product mask = new Product("Маска", 50);
        String goods = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            goods += mask + "\n";
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());
    }

    public static void task5() {
        Product mask = new Product("Маска", 50);
        StringBuilder goods = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            goods.append(mask).append("\n");
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());
    }

    public static void task6() {
        Product mask = new Product("Маска", 50);
        StringBuilder goods = new StringBuilder();

        for (int i = 0; i < 100_000; i++) {
            goods.append(mask).append("\n");
        }

        String allGoods = goods.toString();

        long start = System.currentTimeMillis();
        allGoods = allGoods + mask;
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());
    }

    public static void task7() {
        Product mask = new Product("Маска", 50);
        StringBuilder goods = new StringBuilder();

        for (int i = 0; i < 100_000; i++) {
            goods.append(mask).append("\n");
        }

        String allGoods = goods.toString();

        long start = System.currentTimeMillis();
        allGoods = allGoods.concat(mask.toString());
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());
    }

    public static void task8() {
        Product2 mask = new Product2("Маска", 50);
        StringBuilder goods = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            goods.append(mask).append("\n");
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());
    }

    public static void task9() {
        String managerName = "Василий";
        String customerName = "Василий";
        System.out.println(managerName == customerName);
    }

    public static void task10() {
        String managerName = "Василий";
        String customerName = "Васи".concat("лий");
        System.out.println(managerName == customerName);
    }

    public static void task11() {
        String managerName = "Василий";
        String customerName = "Васи".concat("лий");
        System.out.println(managerName.equals(customerName));
    }


}
