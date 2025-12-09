package main.try_2.strings;

import main.try_2.myFeatures.Printer;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Lesson_9_4 {

    public static void run() {
        Printer.printLessonNumber(4, 9);
        Printer.printLessonName("Символы и кодировки");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Перебор символов в строке");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("ПОлучаем первую букву из строки");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Попытаемся взять букву с несуществующим индексом из строки");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Подсчет количества символов");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Работа с пробелами по краям строки(убираем лишние пробелы с помощью trim");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Методы isDigit и isLetter");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Кодировки в Java (UTF_8)");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Узнаем кодировку по умолчанию");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        Printer.printTaskName("Кодировки в Java (Windows-1251)");
        task9();
        System.out.println();
        Printer.printTaskNumber(10);
        Printer.printTaskName("Смена кодировки для конкретной строки");
        task10();
    }

    public static void task1() {
        String hello = "Hello";
        char[] chars = hello.toCharArray(); //получаем массив
        for (char c : chars) {
            System.out.println(c); //выводим в консоль
        }
    }

    public static void task2() {
        String hello = "Hello";
        char firstChar = hello.charAt(0);
        System.out.println("Первая буква:" + firstChar);
    }

    public static void task3() {
        try {
            String hello = "Hello";
            //передаём значение 5, которое больше максимального индекса
            char firstChar = hello.charAt(hello.length());
            System.out.println(firstChar);
        } catch (Exception e) {
            System.out.println("Ошибочка: " + e.getMessage());
        }
    }

    public static void task4() {
        String str = "Это тестовая строка для подсчёта пробелов";
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Количество пробелов: " + spaceCount);
    }

    public static void task5() {
        String text = "  Some spaces at the start and at the end   ";
        System.out.println("Исходный текст '" + text + "'");
        String clearedText = text.trim();
        System.out.println("Полученный текст '" + clearedText + "'");
    }

    public static void task6() {
        String text = "1990 year";
        if (Character.isDigit(text.charAt(0))) {
            System.out.println("This is a digit");
        } else {
            System.out.println("This is not a digit");
        }
    }

    public static void task7() {
        String text = "Привет";
        byte[] textBytes = text.getBytes(StandardCharsets.UTF_8);
        for (byte textByte : textBytes) {
            System.out.print(textByte + " ");
        }
    }

    public static void task8() {
        System.out.println(Charset.defaultCharset());
    }

    public static void task9() {
        try {
            String text = "Привет";
            byte[] textBytes = text.getBytes("Windows-1251");
            for (byte textByte : textBytes) {
                System.out.print(textByte + " ");
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void task10() {
        String text = "Hello всем";
        String encoded = new String(text.getBytes(), StandardCharsets.US_ASCII); //создаём новую строку
        System.out.println(encoded);
    }
}
