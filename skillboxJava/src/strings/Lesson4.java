package strings;

import myFeatures.Colors;
import myFeatures.Printer;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Lesson4 {
    public static void run() {
        Printer.printLessonNumber(4, 9);
        Printer.printLessonName("Символы и кодировки");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Выводим строку побуквенно");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Выводим конкретную букву(по номеру в строке)");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Попытка передать значение, которое больше, чем длина строки");
        try {
            task3();
        }catch (Exception e) {
            Printer.printException(e.toString());
        }
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Считаем количество пробелов в строке");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Убираем лишние пробелы в конце и начале - при помощи trim()");
        Printer.printDescription("Так же есть strip() - убирает не только пробелы, но и другие символы, " +
                "которые могут считаться пробелами в различных кодировках (начиная с 11 java)");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Проверка текста - начинается ли он с цифры (метод isDigit())");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Проверка текста - 8ой символ является ли буквой (метод isLetter())");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Проверка текста - 8ой символ является ли иероглифом (метод isIdeographic())");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        Printer.printTaskName("Проверка текста - 8ой символ является ли допустимым при именовании переменных и " +
                "методов в Java (метод isJavaLetterOrDigit())");
        task9();
        System.out.println();
        Printer.printSeparator();
        System.out.println();
        Printer.printTaskNumber(10);
        Printer.printTaskName("Выводим текущую кодировку");
        task10();
        System.out.println();
        Printer.printTaskNumber(11);
        Printer.printTaskName("Узнаем коды символов в кодировке UTF-8 (используем метод getBytes класса String)");
        task11();
        System.out.println();
        Printer.printTaskNumber(12);
        Printer.printTaskName("Узнаем коды символов в кодировке Windows (используем метод getBytes класса String)");
        task12();
        System.out.println();
        Printer.printTaskNumber(13);
        Printer.printTaskName("Изменяем кодировку");
        task13();
        System.out.println();
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
        System.out.println("Первая буква: " + firstChar);
    }

    public static void task3() {
        String hello = "Hello";
//передаём значение 5, которое больше максимального индекса
        char firstChar = hello.charAt(hello.length());
        System.out.println(firstChar);
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
        String text = "1990 year";
        System.out.println("Character = " + text.charAt(7));
        if (Character.isLetter(text.charAt(7))) {
            System.out.println("This is a letter");
        } else {
            System.out.println("This is not a letter");
        }
    }

    public static void task8() {
        String text = "1990 year";
        System.out.println("Character = " + text.charAt(7));
        if (Character.isIdeographic(text.charAt(7))) {
            System.out.println("This is a ideographic");
        } else {
            System.out.println("This is not a ideographic");
        }
    }

    public static void task9() {
        String text = "1990 year";
        System.out.println("Character = " + text.charAt(7));
        if (Character.isJavaLetterOrDigit(text.charAt(7))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void task10() {
        System.out.println(Charset.defaultCharset());
    }

    public static void task11() {
        String text = "Привет";
        byte[] textBytes = text.getBytes(StandardCharsets.UTF_8);
        for (byte textByte : textBytes) {
            System.out.print(textByte + " ");
        }
        System.out.println();
    }

    public static void task12() {
        try {
            String text = "Привет";
            byte[] textBytes = text.getBytes("Windows-1251");
            for (byte textByte : textBytes) {
                System.out.print(textByte + " ");
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }

    public static void task13() {
        String text = "Hello всем";
        String encoded = new String(text.getBytes(), StandardCharsets.US_ASCII); //создаём новую строку
        System.out.println(encoded);
    }
}
