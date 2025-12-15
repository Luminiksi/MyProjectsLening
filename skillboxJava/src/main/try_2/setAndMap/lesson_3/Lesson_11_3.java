package main.try_2.setAndMap.lesson_3;

import main.try_2.myFeatures.Printer;

import java.util.HashSet;

public class Lesson_11_3 {

    public static void run() {
        Printer.printLessonNumber(3, 11);
        Printer.printLessonName("Механизм работы HashSet");

        Printer.printTaskNumber(1);
        Printer.printTaskName("hashCode");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Пример с повторяющимися элементами в HashSet - реализация методов hashCode и equals");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Длительность работы без hashCode");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Длительность работы hashCode по умолчанию(из класса Object)");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Длительность работы hashCode, который прописан в классе");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Сравнение объектов (с учетом регистра");
        task6();
    }

    public static void task1() {
        TaskWithoutString task = new TaskWithoutString("Купить лошадь");
        System.out.println(task.hashCode());

        System.out.println("Сравнение toString и 16ричного hashCode");
        System.out.println(task.toString());
        System.out.println(Integer.toHexString(task.hashCode()));
    }

    public static void task2() {
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

    public static void task3() {
        HashSet<TaskWithoutHash> taskList = new HashSet<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            TaskWithoutHash task = new TaskWithoutHash("Некая задача для списка " + (int) (1000 * Math.random()));
            taskList.add(task);
        }
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println("Должно быть не больше 1000, если больше - значит сравнение не работает");
        System.out.println(taskList.size());
        System.out.println("equals был вызван: ");
        System.out.println(TaskWithoutHash.getEqualsCount());
    }

    public static void task4() {
        HashSet<TaskDefaultHash> taskList = new HashSet<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            TaskDefaultHash task = new TaskDefaultHash("Некая задача для списка " + (int) (1000 * Math.random()));
            taskList.add(task);
        }
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println("Должно быть не больше 1000, если больше - значит сравнение не работает");
        System.out.println(taskList.size());
    }

    public static void task5() {
        HashSet<Task> taskList = new HashSet<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            Task task = new Task("Некая задача для списка " + (int) (1000 * Math.random()));
            taskList.add(task);
        }
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println("Должно быть не больше 1000, если больше - значит сравнение не работает");
        System.out.println(taskList.size());
        System.out.println("equals был вызван: ");
        System.out.println(Task.getEqualsCount());
    }

    public static void task6() {
        HashSet<Task> taskList = new HashSet<>();
        taskList.add(new Task("покормить лошадь"));
        System.out.println(taskList.contains(new Task("Покормить лошадь")));
    }
}
