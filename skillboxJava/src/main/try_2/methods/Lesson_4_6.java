package main.try_2.methods;

import main.try_1.myFeatures.Printer;

public class Lesson_4_6 {

    public static void run() {
        Printer.printLessonNumber(6, 4);
        Printer.printLessonName("Конструкторы");
        Printer.printDescription("Практика");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Создайте класс с конструктором и используйте его");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Создайте класс с несколькими конструкторами");
        task2();
    }

    public static void task1() {
        User dmitry = new User("Дмитрий", 45);
        User nastya = new User("Настя", 31);
        User misha = new User("Миша", 47);

        printUerInfo(dmitry);
        printUerInfo(nastya);
        printUerInfo(misha);
    }

    public static void task2() {
        Employee alex = new Employee("Александр", 4326);
        Employee vasya = new Employee("Василий", "vasya@mail.com");
        Employee masha = new Employee("Александр", "masha@mail.com", 1234);

        alex.printInfo();
        System.out.println();
        vasya.printInfo();
        System.out.println();
        masha.printInfo();
    }

    public static void printUerInfo(User user) {
        System.out.println("Пользователь: " + user.getName() + ", " + user.getAge() + " лет");
    }
}
