package main.try_2.strings;

import main.try_2.myFeatures.Printer;

import java.time.LocalDate;

public class Lesson_9_2 {

    public static void run() {
        Printer.printLessonNumber(2, 9);
        Printer.printLessonName("Строки, конкатенация и сравнение");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Создание строк");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("3 метода как узнать пустая ли строка");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Конкатинация (объединение строк)");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Метод toString у объектов");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Опасности со String - 1(множественное добавление в строку)");
//        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Исправляем опасность 1 с помощью StringBuilder");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Опасности со String - 2(прибавление большой строки)");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Исправляем опасность 2 с помощью concat");
        Printer.printDescription("Но у меня почему-то получилось наоборот =(");
        task8();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Исправляем опасность 1 с помощью StringBuilder + concat в классе");
        task8();
        System.out.println();
        Printer.printTaskNumber(10);
        Printer.printTaskName("Сравнение строк");
        task10();
    }

    public static void task1() {
        String name = "Настя";
        String empty = "";
    }

    public static void task2() {
        String empty = "";

        boolean isEmpty = empty.length() == 0;
        System.out.println("1. empty.length() == 0");
        System.out.println(isEmpty);
        System.out.println();
        System.out.println("2. isEmpty");
        System.out.println(empty.isEmpty());
        System.out.println();
        System.out.println("3. isBlank - так же если там только пустые символы(чисто, пробелы, табуляции и т.д.");
        System.out.println(empty.isBlank());
        String blank = "     \t   \n  ";
        System.out.println(blank.isBlank());
    }

    public static void task3() {
        String name = "Алиса";
        String surname = "Иванова";
        int age = 35;

        String fullName = name + " " + surname;
        System.out.println(fullName);

        String personInfo = name + ' ' + surname + " - " + age + " лет";
        System.out.println(personInfo);

        LocalDate birthday = LocalDate.of(1986, 4, 15);
        personInfo = name + ' ' + surname + " - " + birthday;
        System.out.println(personInfo);
    }

    public static void task4() {
        Product soap = new Product("Мыло", 55);
        String productInfo = "Информация о продукте: " + soap;
        System.out.println(productInfo);

        ProductWithoutString soap2 = new ProductWithoutString("Мыло", 55);
        String productInfo2 = "Информация о продукте: " + soap2;
        System.out.println(productInfo2);
    }

    public static void task5() {
        Product mask = new Product("Маска", 50);
        String goods = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            goods += mask + "\n";
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());
    }

    public static void task6() {
        Product mask = new Product("Маска", 50);
        StringBuilder goods = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            goods.append(mask).append("\n");
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());
    }

    public static void task7() {
        Product mask = new Product("Маска", 50);
        StringBuilder goods = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            goods.append(mask).append("\n");
        }

        long start = System.currentTimeMillis();
        String allGoods = goods.toString();
        allGoods = allGoods + mask;
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void task8() {
        Product mask = new Product("Маска", 50);
        StringBuilder goods = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            goods.append(mask).append("\n");
        }

        long start = System.currentTimeMillis();
        String allGoods = goods.toString();
        allGoods = allGoods.concat(mask.toString());
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void task9() {
        ProductConcat mask = new ProductConcat("Маска", 50);
        StringBuilder goods = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            goods.append(mask).append("\n");
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());
    }

    public static void task10() {
        String managerName = "Василий";
        String customerName = "Василий";
        System.out.println(managerName == customerName);
        String customerName1 = "Васил".concat("ий");
        System.out.println(managerName == customerName1);

        System.out.println(managerName.equals(customerName1));
    }
}
