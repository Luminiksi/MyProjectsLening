package try_1.hometasks.practics.part8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class numberAndDateExperiments7 {
    public static void main(String[] args) {
        LocalDate creationDateJ = LocalDate.of(1995, 5, 23);
        LocalDate now = LocalDate.now();
        int years = - (int) now.until(creationDateJ, ChronoUnit.YEARS);
        int months = - (int) now.until(creationDateJ.plusYears(years), ChronoUnit.MONTHS);
        int days = - (int) now.until(creationDateJ.plusYears(years).plusMonths(months), ChronoUnit.DAYS);

        System.out.println(years + " years, " + months + " months, " + days + " days");
    }
}
