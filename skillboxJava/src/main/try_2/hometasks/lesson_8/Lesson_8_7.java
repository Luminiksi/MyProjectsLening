package main.try_2.hometasks.lesson_8;

import main.try_2.myFeatures.Printer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;

public class Lesson_8_7 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Printer.printLessonNumber(7, 8);
        Printer.printLessonName("Дата и время");

        Printer.printTaskNumber(1);
        Printer.printDescription("Доп. задание");
        Printer.printTaskName("Задание 1. Создайте метод, возвращающий количество лет, месяцев и дней с даты основания языка Java");
        task1();
    }

    public static void task1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate today = LocalDate.now();
        System.out.println(formatter.format(today));
        System.out.println(getLifeJava(today));
        System.out.println();

        LocalDate test = LocalDate.of(2022, 4, 1);
        System.out.println(formatter.format(test));
        System.out.println(getLifeJava(test));
    }

    public static String getLifeJava(LocalDate date) {
        LocalDate birthday = LocalDate.of(1995, 5, 23);
        int years = (int) birthday.until(date, ChronoUnit.YEARS);
        birthday = birthday.plusYears(years);
        int months = (int) birthday.until(date, ChronoUnit.MONTHS);
        birthday = birthday.plusMonths(months);
        int days = (int) birthday.until(date, ChronoUnit.DAYS);
        return years + " years, " + months + " months, " + days + " days";
    }
}
