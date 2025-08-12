package main.try_1.hometasks.practics.part8;

import main.try_1.myFeatures.Printer;

public class numberAndDateExperiments {
    public static void main(String[] args) {
        Printer.printLessonNumber(2, 8);
        Printer.printTaskNumber(1);
        Printer.printTaskName("Напишите метод расчёта количества кассет с деньгами, вставляемых в банкомат");
        Printer.printAttemptNumber(1);
        System.out.println("For 1999: " + MoneyCalculator.calculateCassetteCount(1999));
        Printer.printAttemptNumber(2);
        System.out.println("For 2000: " + MoneyCalculator.calculateCassetteCount(2000));
        Printer.printAttemptNumber(3);
        System.out.println("For 2001: " + MoneyCalculator.calculateCassetteCount(2001));
        Printer.printAttemptNumber(4);
        System.out.println("For 2500: " + MoneyCalculator.calculateCassetteCount(2500));
        Printer.printAttemptNumber(5);
        System.out.println("For 4000: " + MoneyCalculator.calculateCassetteCount(4000));
        Printer.printAttemptNumber(6);
        System.out.println("For 4500: " + MoneyCalculator.calculateCassetteCount(4500));
    }
}
