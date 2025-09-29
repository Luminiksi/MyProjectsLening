package main.try_2.InternetShop;

import main.try_2.myFeatures.Printer;

public class Lesson_5_7 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Printer.printLessonNumber(7, 5);
        Printer.printLessonName("Копирование объектов");

        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
    }

    public static void task1() {
        BankDetails details = new BankDetails();
        details.setBillNumber("23425675345234");
        Company company = new Company("New Company", details);
//        some code
        details.setBillNumber("54654674675675");
        System.out.println(company);
    }

    public static void task2() {

    }

    public static void task3() {

    }
}
