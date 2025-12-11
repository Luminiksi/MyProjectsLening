package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BirthdaysPart2 {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE").localizedBy(new Locale("us"));;
        StringBuilder birthdays = new StringBuilder();
        LocalDate now = LocalDate.now();
        for (int i = 0; i <= now.getYear(); i++) {
            int newYear = year + i;
            LocalDate birthday = LocalDate.of(newYear, month, day);
            if (birthday.isAfter(now)) {
                break;
            }
            if (!birthdays.isEmpty()) {
                birthdays.append("\n");
            }

//            DayOfWeek dayOfWeek = birthday.getDayOfWeek();
//            birthdays.append(i + " - " + formatter.format(birthday) + " - " + dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
            birthdays.append(i + " - " + formatter.format(birthday));
        }


        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue

        return birthdays.toString();
    }
}
