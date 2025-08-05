package try_1.setAndMap;

import try_1.myFeatures.Printer;

import java.util.ArrayList;
import java.util.HashSet;

public class Lesson2 {
    public static void run() {
        Printer.printLessonNumber(2, 11);
        Printer.printLessonName("Коллекция HashSet");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Добавление в ArrayList");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Добавление в HashSet");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Добавление в HashSet повторного");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("HashSet.clear()");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("HashSet.contains()");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("HashSet.isEmpty()");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("HashSet.remove()");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Пример с объектами");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        task9();
        System.out.println();

        System.out.println();
        System.out.println();
    }

    public static void task1() {
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        todoList.add("Купить лошадь");
        todoList.add("Купить молоко");

        for (String item : todoList) {
            System.out.println(item);
        }
    }

    public static void task2() {
        HashSet<String> todoList = new HashSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        todoList.add("Купить лошадь");
        todoList.add("Купить молоко");

        for (String item : todoList) {
            System.out.println(item);
        }
    }

    public static void task3() {
        HashSet<String> todoList = new HashSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        boolean horseAgain = todoList.add("Купить лошадь");
        System.out.println(horseAgain);
        todoList.add("Купить молоко");

        for (String item : todoList) {
            System.out.println(item);
        }
    }

    public static void task4() {
        HashSet<String> todoList = new HashSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        todoList.add("Купить лошадь");
        todoList.add("Купить молоко");

        todoList.clear();

        for (String item : todoList) {
            System.out.println(item);
        }
    }

    public static void task5() {
        HashSet<String> todoList = new HashSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        todoList.add("Купить лошадь");
        todoList.add("Купить молоко");

        System.out.println(todoList.contains("sdfsdfs"));
        System.out.println(todoList.contains("Купить молоко"));

        for (String item : todoList) {
            System.out.println(item);
        }
    }

    public static void task6() {
        HashSet<String> todoList = new HashSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        todoList.add("Купить лошадь");
        todoList.add("Купить молоко");

        System.out.println(todoList.isEmpty());
        todoList.clear();
        System.out.println(todoList.isEmpty());

        for (String item : todoList) {
            System.out.println(item);
        }
    }

    public static void task7() {
        HashSet<String> todoList = new HashSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        todoList.add("Купить лошадь");
        todoList.add("Купить молоко");

        todoList.remove("Купить лошадь");

        for (String item : todoList) {
            System.out.println(item);
        }
    }

    public static void task8() {
        HashSet<String> todoList = new HashSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        todoList.add("Купить лошадь");
        todoList.add("Купить молоко");

        System.out.println(todoList.size());

        for (String item : todoList) {
            System.out.println(item);
        }
    }

    public static void task9() {
        HashSet<Task> todoList = new HashSet<>();
        todoList.add(new Task("Купить молоко"));
        todoList.add(new Task("Купить лошадь"));
        todoList.add(new Task("Покормить кота"));
        todoList.add(new Task("Купить лошадь"));
        todoList.add(new Task("Купить молоко"));

        System.out.println(todoList.size());

        for (Task item : todoList) {
            System.out.println(item);
        }
    }
}
