package main.try_2.setAndMap.lesson_4;

import main.try_2.myFeatures.Printer;

import java.util.TreeSet;

public class Lesson_11_4 {

    private static TreeSet<Task> todoListNameComp;

    public static void run() {
        Printer.printLessonNumber(4, 11);
        Printer.printLessonName("Коллекция TreeSet");

        Printer.printTaskNumber(1);
        Printer.printTaskName("TreeSet - при добвалении строк они будут распологаться по алфовитному порядку");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("TreeSet - при добвалении объектов (без подготовки данных объектов)");
        try {
            task2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("TreeSet - при добвалении объектов (с интефейсом Comparable)");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("TreeSet - с помощью класса компаратора");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("TreeSet: методы (ceiling) - пытается найти по названию, а сортировка у нас по дате, поэтому null");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("TreeSet: методы (ceiling) - пытаеся найти по названию(или ближайший больший элемент), теперь солтрировка по имени");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("TreeSet: методы (floor) - пытаеся найти по названию(или ближайший меньший элемент), теперь солтрировка по имени");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("TreeSet: методы (contains) - есть ли данный элемент в коллекции");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        Printer.printTaskName("Другие методы TreeSet:");
        task9();
    }

    public static void task1() {
        TreeSet<String> todoList = new TreeSet<>();
        todoList.add("Покормить лошадь");
        todoList.add("Антону напомнить об отчете");
        todoList.add("Купить молоко");
        todoList.add("Выбросить мусор");

        for (String item : todoList) {
            System.out.println(item);
        }
    }

    public static void task2() {
        TreeSet<Task> todoList = new TreeSet<>();
        todoList.add(new Task("Покормить лошадь"));
        todoList.add(new Task("Антону напомнить об отчете"));
        todoList.add(new Task("Купить молоко"));
        todoList.add(new Task("Выбросить мусор"));

        for (Task item : todoList) {
            System.out.println(item);
        }
    }

    public static void task3() {
        TreeSet<TaskComparable> todoList = new TreeSet<>();
        System.out.println("Тут прописываем таймауты, потому что код слишком быстро отрабатывает и время получается одинаковым и элементы не добавляются");
        try {
            todoList.add(new TaskComparable("Покормить лошадь"));
            Thread.sleep(10);
            todoList.add(new TaskComparable("Антону напомнить об отчете"));
            Thread.sleep(10);
            todoList.add(new TaskComparable("Купить молоко"));
            Thread.sleep(10);
            todoList.add(new TaskComparable("Выбросить мусор"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (TaskComparable item : todoList) {
            System.out.println(item);
        }
    }

    public static void task4() {
        TreeSet<Task> todoList = new TreeSet<>(new TaskComparator());
        try {
            todoList.add(new Task("Покормить лошадь"));
            Thread.sleep(10);
            todoList.add(new Task("Антону напомнить об отчете"));
            Thread.sleep(10);
            todoList.add(new Task("Купить молоко"));
            Thread.sleep(10);
            todoList.add(new Task("Выбросить мусор"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (Task item : todoList) {
            System.out.println(item);
        }
    }

    public static void task5() {
        TreeSet<Task> todoList = new TreeSet<>(new TaskComparator());
        try {
            todoList.add(new Task("Покормить лошадь"));
            Thread.sleep(10);
            todoList.add(new Task("Антону напомнить об отчете"));
            Thread.sleep(10);
            todoList.add(new Task("Купить молоко"));
            Thread.sleep(10);
            todoList.add(new Task("Выбросить мусор"));
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(todoList.ceiling(new Task("Купить молоко")));
    }

    public static void task6() {
        TreeSet<Task> todoList = new TreeSet<>(new TaskNameComparator());
        try {
            todoList.add(new Task("Покормить лошадь"));
            Thread.sleep(10);
            todoList.add(new Task("Антону напомнить об отчете"));
            Thread.sleep(10);
            todoList.add(new Task("Купить молоко"));
            Thread.sleep(10);
            todoList.add(new Task("Выбросить мусор"));
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        todoListNameComp = todoList;

        System.out.println("Наша коллекция:");
        for (Task item : todoList) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("Возвращаем именно найденный объект -  можно посмотреть по дате:");
        System.out.println(todoList.ceiling(new Task("Купить молоко")));

        System.out.println("Если на нейдет возвращает ближайший больший элемент:");
        System.out.println(todoList.ceiling(new Task("Купить мол")));
    }

    public static void task7() {
        System.out.println("Наша коллекция:");
        for (Task item : todoListNameComp) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("Возвращаем именно найденный объект -  можно посмотреть по дате:");
        System.out.println(todoListNameComp.floor(new Task("Купить молоко")));

        System.out.println("Если на нейдет возвращает ближайший меньший элемент:");
        System.out.println(todoListNameComp.floor(new Task("Купить мол")));
    }

    public static void task8() {
        System.out.println("Наша коллекция:");
        for (Task item : todoListNameComp) {
            System.out.println(item);
        }

        System.out.println(todoListNameComp.contains(new Task("Купить молоко")));
        System.out.println(todoListNameComp.contains(new Task("Купить мол")));
    }

    public static void task9() {
        System.out.println("Наша коллекция:");
        for (Task item : todoListNameComp) {
            System.out.println(item);
        }

        System.out.println("first - возвращает первый элемент коллекции");
        System.out.println(todoListNameComp.first());
        System.out.println();

        System.out.println("last - возвращает последний элемент коллекции");
        System.out.println(todoListNameComp.last());
        System.out.println();

        System.out.println("higher - возвращает ближайший больший элемент");
        System.out.println(todoListNameComp.higher(new Task("Купить молоко")));
        System.out.println();

        System.out.println("lower - возвращает ближайший меньший элемент");
        System.out.println(todoListNameComp.lower(new Task("Купить молоко")));
        System.out.println();

        System.out.println("pollFirst - возвращает последний элемент коллекции + удаляет его");
        System.out.println(todoListNameComp.pollFirst());
        System.out.println("pollLast - возвращает последний элемент коллекции + удаляет его");
        System.out.println(todoListNameComp.pollLast());
        System.out.println("Наша коллекция:");
        for (Task item : todoListNameComp) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("isEmpty - Пустой ли список");
        System.out.println(todoListNameComp.isEmpty());
        System.out.println();
        System.out.println("clear - очищение списка");
        System.out.println("remove - удаление элемента");
        System.out.println("size - размер списка");
        System.out.println(todoListNameComp.size());


        System.out.println("Получение подмножества");
        System.out.println("headSet - с начала списка (до определенного элемента)");
        System.out.println("tailSet - с конца списка (начиная с какого-либо элемента");
        System.out.println("subSet - из середины (нужно 2 параметра)");
    }
}
