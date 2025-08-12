package main.try_1.hometasks.practics.part5;

import main.try_1.myFeatures.Printer;

public class EncapsulationExperiments {
    public static void main(String[] args) {
        Printer.printLessonNumber(2,5);
        Printer.printTaskNumber(1);
        Printer.printTaskName("Напишите код класса с применением принципа инкапсуляции");
        lesson2task1();
        Printer.printSeparator();
        System.out.println();
        Printer.printLessonNumber(4,5);
        Printer.printTaskNumber(1);
        Printer.printTaskName("Создайте класс для хранения данных о странах");
        lesson4task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Создайте класс для хранения данных о любом объекте реального мира");
        lesson4task2();
        System.out.println();
    }

    public static void lesson2task1() {
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

    public static void lesson4task1() {
        Country country = new Country("Зазеркалье");
        country.setCapital("Дворец королевы");
        country.setPopulationCount(4475);
        System.out.println("Название страны - " + country.getName() + "");
        System.out.println("Столица - " + country.getCapital() + "");
        System.out.println("Количество жителей - " + country.getPopulationCount() + "");
    }

    public static void lesson4task2() {
        Milk milk = new Milk("Молочная станция");
        milk.setFatContent(3.2);
        milk.setLactoseFree(false);
        System.out.println("Наименование бренда - \"" + milk.getFirm() + "\"");
        System.out.println("Жирность - " + milk.getFatContent() + "");
        System.out.println("Безлактозность - " + (milk.isLactoseFree() ? "да" : "нет") + "");
    }
}
