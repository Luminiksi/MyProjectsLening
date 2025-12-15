package main.try_2.setAndMap.lesson_2;

import main.try_2.myFeatures.Printer;

import java.util.ArrayList;
import java.util.HashSet;

public class Lesson_11_2 {

    public static void run() {
        Printer.printLessonNumber(2, 11);
        Printer.printLessonName("Коллекция HashSet");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Пример с повторяющимися элементами в ArrayList");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Пример с повторяющимися элементами в HashSet");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Пример с повторяющимися элементами в HashSet - объекты(без прописанных в классе  hashCode и equals)");
        task3();
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
        boolean horseAgain = todoList.add("Купить лошадь");
        System.out.println(horseAgain);
        todoList.add("Купить молоко");

        for (String item : todoList) {
            System.out.println(item);
        }

        System.out.println("2. Тестим метон нахождения в коллекции - contains");
        System.out.println(todoList.contains("Test!!!"));
        System.out.println(todoList.contains("Купить молоко"));

        System.out.println("3.1 Тестим метод - isEmpty");
        System.out.println(todoList.isEmpty());

        System.out.println("4.1 Тестим метод - remove");
        boolean isDeleted =  todoList.remove("Покормить кота");
        System.out.println(isDeleted);

        System.out.println("5. А сейчас очистим коллекцию:");
        todoList.clear();

        for (String item : todoList) {
            System.out.println(item);
        }
        System.out.println("3.2 Тестим метод - isEmpty");
        System.out.println(todoList.isEmpty());
    }

    public static void task3() {
        HashSet<Task> todoList = new HashSet<>();
        todoList.add(new Task("Купить молоко"));
        todoList.add(new Task("Купить лошадь"));
        todoList.add(new Task("Покормить кота"));
        todoList.add(new Task("Купить лошадь"));
        todoList.add(new Task("Купить молоко"));

        for (Task task : todoList) {
            System.out.println(task);
        }
    }
}
