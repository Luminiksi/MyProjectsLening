package try_1.setAndMap.lesson3;

import try_1.myFeatures.Printer;

import java.util.HashSet;

public class Lesson3 {
    public static void run() {
        Printer.printLessonNumber(3, 11);
        Printer.printLessonName("Механизм работы HashSet");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Смотрим как отображается дефолнтый хешкод");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Добавление с хешкодом и сравенением прописанным");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Добавление с хешом не прописанным");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Добавление с хешом который всегда возхвращает 1");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Добавление с хешом который сами прописали");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Пытаемся найти элемент(но регистр другой)");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Пытаемся найти элемент(но регистр другой), но в проверках мы сделали без учета регистра");
        task7();
        System.out.println();

        System.out.println();
        System.out.println();
    }


    public static void task1() {
        EmptyTask task = new EmptyTask("Покормить лошадь");
        System.out.println(task.hashCode());
        System.out.println(task);
        System.out.println(Integer.toHexString(task.hashCode()));
    }


    public static void task2() {
        HashSet<NewTask> todoList = new HashSet<>();
        todoList.add(new NewTask("Купить молоко"));
        todoList.add(new NewTask("Купить лошадь"));
        todoList.add(new NewTask("Покормить кота"));
        todoList.add(new NewTask("Купить лошадь"));
        todoList.add(new NewTask("Купить молоко"));

        System.out.println(todoList.size());

        for (NewTask item : todoList) {
            System.out.println(item);
        }
    }

    public static void task3() {
        HashSet<TaskNotHash> taskList = new HashSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            TaskNotHash task = new TaskNotHash("Некая задача для нашего списка " + (int) (1000 * Math.random()));
            taskList.add(task);
        }
        Printer.printTime(System.currentTimeMillis() - start);
        System.out.println(taskList.size());
    }

    public static void task4() {
        HashSet<TaskHash1> taskList = new HashSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            TaskHash1 task = new TaskHash1("Некая задача для нашего списка " + (int) (1000 * Math.random()));
            taskList.add(task);
        }
        Printer.printTime(System.currentTimeMillis() - start);
        System.out.println(taskList.size());
        System.out.println("Сколько раз вызвался equals: " + TaskHash1.getEqualsCount());
    }

    public static void task5() {
        NewTask.resetEqualsCount();
        HashSet<NewTask> taskList = new HashSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            NewTask task = new NewTask("Некая задача для нашего списка " + (int) (1000 * Math.random()));
            taskList.add(task);
        }
        Printer.printTime(System.currentTimeMillis() - start);
        System.out.println(taskList.size());
        System.out.println("Сколько раз вызвался equals: " + NewTask.getEqualsCount());
    }

    public static void task6() {
        HashSet<NewTask> taskList = new HashSet<>();
        taskList.add(new NewTask("покормить лошадь"));
        System.out.println(taskList.contains(new NewTask("Покормить лошадь")));
    }

    public static void task7() {
        HashSet<TaskLC> taskList = new HashSet<>();
        taskList.add(new TaskLC("покормить лошадь"));
        System.out.println(taskList.contains(new TaskLC("Покормить лошадь")));
    }
}
