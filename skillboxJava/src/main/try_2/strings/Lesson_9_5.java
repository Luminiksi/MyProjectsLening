package main.try_2.strings;

import main.try_2.myFeatures.Printer;

import java.util.StringJoiner;

public class Lesson_9_5 {

    public static void run() {
        Printer.printLessonNumber(5, 9);
        Printer.printLessonName("Методы работы с подстроками");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Вычлиняем куски строк из строк");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Объединение строк");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("СОздание строки из несольких типов данных(форматирование строк)");
        task3();
    }

    public static void task1() {
        String header1 = "Content-Type: text/html; charset=utf-8;";
        String header2 = "Content-Type: text/html; charset=windows-1251;";
        String header3 = "Content-Type: text/html; charset=ISO-8859-1;";


        String header4 = "Content-Type: text/html;";
        String header5 = "Content-Type: text/html; charset=";
        String header6 = "Content-Type: text/html; charset=;";

        System.out.println(getEncoding(header1));
        System.out.println(getEncoding(header2));
        System.out.println(getEncoding(header3));

        System.out.println(getEncoding(header4));
        System.out.println(getEncoding(header5));
        System.out.println(getEncoding(header6));
    }

    public static String getEncoding(String header) {
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr);
        int end = header.indexOf(";", start);
        if (start < 0 || end < 0) {
            return "";
        }
        String encoding = header.substring(start + charsetStr.length(), end); //символ с индексом end - не пойдет
        return encoding;
    }

    public static void task2() {
        String name1 = "Василий";
        String name2 = "Герогий";
        String name3 = "Алексей";

//        String list = name1 + ", " + name2 + ", " + name3;
        System.out.println("С использованием StringJoiner:");
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);
        System.out.println(joiner);
        System.out.println();

        String list = String.join(", ", name1, name2, name3);
        System.out.println("С использованием String.join:");
        System.out.println(list);
    }

    public static void task3() {
        String name = "Maksim";
        int birthday = 1986;
        // {"name" : "Maksim", "birthday": "1986"}
        System.out.println("С помощью конкотинации: ");
        String result = "{\"name\" : \"" + name + "\", \"birthday\": \"" + birthday + "\"}";
        System.out.println(result);

        System.out.println("С помощью форматирования: ");
        // %s - строка; %d - целое число; %f - число float/double ; %b - boolean; %n - перенос строки; %t - дата(Date); %% - символ процента
        // формируем шаблон:
        String template = "{\"name\" : \"%s\", \"birthday\": \"%d\"}";
        String resultF = String.format(template, name, birthday);
        System.out.println(resultF);

        System.out.println("Использование printf:");
        System.out.printf(template, name, birthday);
    }
}
