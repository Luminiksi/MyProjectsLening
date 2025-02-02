package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        StringBuilder builder = new StringBuilder();
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE").localizedBy(new Locale("us"));
        int i = 0;
        while (birthday.compareTo(now) <= 0) {
            builder.append(i + " - " + formatter.format(birthday) + "\n");
            i++;
            birthday = birthday.plusYears(1);
        }

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue

        return builder.toString();
    }
}
