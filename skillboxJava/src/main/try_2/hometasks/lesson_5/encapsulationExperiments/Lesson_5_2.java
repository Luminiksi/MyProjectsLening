package main.try_2.hometasks.lesson_5.encapsulationExperiments;

import main.try_2.myFeatures.Printer;

public class Lesson_5_2 {
    public static void run() {
        Printer.printLessonNumber(2, 5);
        Printer.printLessonName("Инкапсуляция");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Напишите код класса с применением принципа инкапсуляции");
        task1();
    }

    public static void task1() {
        ChildBankAccount account =
                new ChildBankAccount(10000);
        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(10000);
        account.depositMoney(-1000);
        System.out.println("Balance: " + account.getBalance());

        account.debitMoney(500);
        account.debitMoney(422.75);
        account.debitMoney(50000);
        account.debitMoney(-50);
        System.out.println("Balance: " + account.getBalance());
    }
}
