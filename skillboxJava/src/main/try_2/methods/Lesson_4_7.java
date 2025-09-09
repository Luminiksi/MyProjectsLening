package main.try_2.methods;

import main.try_1.myFeatures.Printer;

public class Lesson_4_7 {

    public static void run() {
        Printer.printLessonNumber(7, 4);
        Printer.printLessonName("Перегрузка методов");
        Printer.printDescription("Практика");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Создайте класс с перегруженными методами");
        task1();
    }

    public static void task1() {
        MyPrinter printer = new MyPrinter();
        printer.append("some text 133", "Справка");
        printer.append("some text 210", 544);
        System.out.println(printer.getPendingPagesCount());
        printer.print();
        printer.append("some text 8", 530);
        printer.clear();
        printer.append("some text 23", "Договор", 312);
        printer.append("some text 11");
        printer.print();
        System.out.println(printer.getPrintedPagesCount());
    }
}
