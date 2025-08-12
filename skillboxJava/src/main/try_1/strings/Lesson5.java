package main.try_1.strings;

import main.try_1.myFeatures.Printer;

import java.util.StringJoiner;

import static main.try_1.myFeatures.Colors.ANSI_PURPLE;
import static main.try_1.myFeatures.Colors.ANSI_RESET;

public class Lesson5 {
    public static void run() {
        Printer.printLessonNumber(5, 9);
        Printer.printLessonName("Методы работы с подстроками");
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
        Printer.printTaskNumber(5);
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        task7();
        System.out.println();
        printInfo();
    }

    public static void task1() {
        String header1 = "Content-Type: text/html; charset=utf-8;";
        String header2 = "Content-Type: text/html; charset=windows-1251;";
        String header3 = "Content-Type: text/html; charset=ISO-8859-1;";

        System.out.println(getEncoding(header1));
        System.out.println(getEncoding(header2));
        System.out.println(getEncoding(header3));
    }

    public static String getEncoding(String header) {
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr) + charsetStr.length();
        int end = header.indexOf(";", start);
        String encoding = header.substring(start, end);
        return encoding;
    }

    public static void task2() {
        String header1 = "Content-Type: text/html;";
        String header2 = "Content-Type: text/html; charset=";
        String header3 = "Content-Type: text/html; charset=;";

        System.out.println("encoding = '" + getEncoding2(header1) + "'");
        System.out.println("encoding = '" + getEncoding2(header2) + "'");
        System.out.println("encoding = '" + getEncoding2(header3) + "'");
    }

    public static String getEncoding2(String header) {
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr);
        int end = header.indexOf(";", start);
        if(start < 0 || end < 0) {
            return "";
        }
        String encoding = header.substring(start + charsetStr.length(), end);
        return encoding;
    }

    public static void task3() {
        String name1 = "Василий";
        String name2 = "Георгий";
        String name3 = "Алексей";

        StringJoiner joiner = new StringJoiner(", ");
        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);
        System.out.println(joiner);
    }

    public static void task4() {
        String name1 = "Василий";
        String name2 = "Георгий";
        String name3 = "Алексей";

        String list = String.join(", ", name1, name2, name3);
        System.out.println(list);
    }

    public static void task5() {
        String name = "Макасим";
        int birthday = 1986;
//        {"name" : "Макасим", "birthday": "1986"}
        String result = "{\"name\" : \"" + name + "\", \"birthday\": \"" + birthday + "\"}";
        System.out.println(result);
    }

    public static void task6() {
        String name = "Макасим";
        int birthday = 1986;
//        {"name" : "Макасим", "birthday": "1986"}
        String template = "{\"name\" : \"%s\", \"birthday\": \"%d\"}";
        String result = String.format(template, name, birthday);
        System.out.println(result);
    }

    public static void task7() {
        String name = "Макасим";
        int birthday = 1986;
//        {"name" : "Макасим", "birthday": "1986"}
        String template = "{\"name\" : \"%s\", \"birthday\": \"%d\"}";
        System.out.printf(template, name, birthday);
    }

    public static void printInfo() {
        System.out.println(ANSI_PURPLE + "Информация из урока!!!!");
        System.out.println("______________________________________________");
        System.out.println("\t\t\tФорматирование строк");
        System.out.println("______________________________________________" + ANSI_RESET);
        System.out.println("\tОбозначение\t\t|\t\tОписание");
        System.out.println("\t\t%s\t\t\t|\tстрока (String)");
        System.out.println("\t\t%d\t\t\t|\tцелое число");
        System.out.println("\t\t%f\t\t\t|\tчисло float или double");
        System.out.println("\t\t%b\t\t\t|\tboolean");
        System.out.println("\t\t%n\t\t\t|\tперенос строки");
        System.out.println("\t\t%t\t\t\t|\tдата (Date)");
        System.out.println("\t\t%%\t\t\t|\tсимвол процента (%)");
        System.out.println(ANSI_PURPLE+ "______________________________________________" + ANSI_RESET);
    }
}
