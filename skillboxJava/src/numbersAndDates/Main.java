package numbersAndDates;

import myFeatures.Printer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Printer.getStringLessonNumber(7, 8);
        Printer.printLessonName("Дата и время");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        Printer.printTaskNumber(1);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate birthday = LocalDate.of(1994, 1, 31);
        System.out.println(birthday);
        System.out.println(birthday.plusYears(31));
        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(nowNY);

        System.out.println();
    }

    public static void task2() {
        Printer.printTaskNumber(2);

        String date = "23/01/2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);

        System.out.println();
    }

    public static void task3() {
        Printer.printTaskNumber(3);

        String date = "29/02/2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);

        System.out.println();
    }

    public static void task4() {
        Printer.printTaskNumber(4);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));

        System.out.println();
    }

    public static void task5() {
        Printer.printTaskNumber(5);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));

        System.out.println();
    }

    public static void task6() {
        Printer.printTaskNumber(6);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));

        System.out.println();
    }

    public static void task7() {
        Printer.printTaskNumber(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                .localizedBy(new Locale("us"));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));

        System.out.println();
    }

    public static void task8() {
        Printer.printTaskNumber(8);

        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.now().minusDays(2);
        if (time1.isAfter(time2)) {
            System.out.println("time1 is after time2");
        }
        System.out.println(time1.compareTo(time2));
        System.out.println(time1.until(time2, ChronoUnit.HOURS));

        System.out.println();
    }
}
