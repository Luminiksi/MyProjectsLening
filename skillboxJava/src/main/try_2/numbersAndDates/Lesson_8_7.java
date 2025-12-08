package main.try_2.numbersAndDates;

import main.try_2.myFeatures.Printer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Lesson_8_7 {
    public static void run() {
        Printer.printLessonNumber(7, 8);
        Printer.printLessonName("Дата и время");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Текущая время и дата (Date)");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Текущая дата (LocalDate)");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Текущая дата и время (LocalDateTime)");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Конкретная дата (LocalDate)");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Дата и время в Нью-Йорке (LocalDateTime)");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Преобразование строки в дату (DateTimeFormatter)");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Преобразование строки в дату (DateTimeFormatter) - не существующая дата");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Преобразование в нужный формат LocalDateTime с помощью DateTimeFormatter");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        Printer.printTaskName("Преобразование в нужный формат LocalDateTime с помощью DateTimeFormatter (шаблонные - FormatStyle)");
        task9();
        System.out.println();
        Printer.printTaskNumber(10);
        Printer.printTaskName("Сравнение");
        task10();
        System.out.println();
        Printer.printTaskNumber(11);
        Printer.printTaskName("Вычисление разницы");
        task11();
    }

    public static void task1() {
        Date now = new Date();
        System.out.println(now);
    }

    public static void task2() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }

    public static void task3() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }

    public static void task4() {
        LocalDate birthday = LocalDate.of(1994, 1, 31);
        System.out.println(birthday);
        System.out.println("18 years in " + birthday.plusYears(18));
    }

    public static void task5() {
        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(nowNY);
    }

    public static void task6() {
        String date = "23/01/2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
    }

    public static void task7() {
        String date = "29/02/2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
    }

    public static void task8() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));
    }

    public static void task9() {
        DateTimeFormatter formatterShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter formatterMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter formatterMediumAmerican = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).localizedBy(new Locale("us"));
        DateTimeFormatter formatterDateMediumAmerican = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(new Locale("us"));
        LocalDateTime now = LocalDateTime.now();
        System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT):");
        System.out.println(formatterShort.format(now));
        System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM):");
        System.out.println(formatterMedium.format(now));
        System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).localizedBy(new Locale(\"us\")):");
        System.out.println(formatterMediumAmerican.format(now));
        System.out.println("DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(new Locale(\"us\")):");
        System.out.println(formatterDateMediumAmerican.format(now));
    }

    public static void task10() {
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.now().minusDays(2);
        System.out.println("если time1 находиться до time2 (isBefore)");
        System.out.println("если time1 после до time2 (isAfter)");
        System.out.println("если time1 равны time1 (isEqual)");
        if (time1.isBefore(time2)) {
            System.out.println("time1 is before time2");
        } else if (time1.isAfter(time2)) {
            System.out.println("time1 is after time2");
        }
        if (time1.isEqual(time2)) {
            System.out.println("time1 equals time2");
        }
        if (time1.isEqual(time1)) {
            System.out.println("time1 equals time1 =))");
        }
        System.out.println();

        System.out.println("Сравнение с compareTo");
        System.out.println("time1.compareTo(time2) - первая дата больше второй : \n" + time1.compareTo(time2));
        System.out.println("time2.compareTo(time1) - первая дата меньше второй : \n" + time2.compareTo(time1));
        System.out.println("time1.compareTo(time1) - обе даты равны : \n" + time1.compareTo(time1));
    }

    public static void task11() {
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = time1.minusDays(2);

        System.out.println("Разница в часах");
        System.out.println(time1.until(time2, ChronoUnit.HOURS));
    }
}
