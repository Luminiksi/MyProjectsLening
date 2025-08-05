package try_1.setAndMap.lesson4;

import try_1.myFeatures.Printer;

import java.util.TreeSet;

public class Lesson4 {
    public static void run() {
        Printer.printLessonNumber(4, 11);
        Printer.printLessonName("Коллекция TreeSet");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printDescription("Из-за быстрого работы компа, пришлось прописывать задержку, т.к. время было одинаковое и в итоге в TreeSet сохранялся только один элемент");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("А теперь с отдельным классом компаратором");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Поиск по коллекции с помощью ceiling");
        Printer.printDescription("Ничего не найдется, потому что ищется по дате создания(то есть что прописали в compare");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Поиск по коллекции с помощью ceiling (но в compare уже отсеивание по name)");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Поиск по коллекции с помощью ceiling (но в compare уже отсеивание по name) - если нет возвращает больший ближайший объект");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Поиск по коллекции с помощью floor (но в compare уже отсеивание по name) - если нет возвращает меньший ближайший объект");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Поиск по коллекции с помощью contains (но в compare уже отсеивание по name)");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        task9();
        System.out.println();
        Printer.printTaskNumber(10);
        Printer.printTaskName(".first() - вернет первый элемент списка");
        task10();
        System.out.println();
        Printer.printTaskNumber(11);
        Printer.printTaskName(".last() - вернет последний элемент списка");
        task11();
        System.out.println();
        Printer.printTaskNumber(12);
        Printer.printTaskName(".first() - вернет первый элемент списка");
        task12();
        System.out.println();
        Printer.printTaskNumber(12);
        Printer.printTaskName(".pollFirst() - вернет первый элемент списка и удалит его из списка");
        task12();
        System.out.println();
        Printer.printTaskNumber(13);
        Printer.printTaskName(".pollLast() - вернет первый элемент списка и удалит его из списка");
        task13();
        System.out.println();
        Printer.printTaskNumber(14);
        Printer.printTaskName(".isEmpty() - пустой ли список");
        task14();
        System.out.println();
        Printer.printTaskNumber(15);
        Printer.printTaskName(".clear() - очищает список");
        task15();
        System.out.println();
        Printer.printTaskNumber(16);
        Printer.printTaskName(".remove() - удаляет элемент из списка");
        task16();
        System.out.println();
        Printer.printTaskNumber(17);
        Printer.printTaskName(".size() - размер списка");
        task17();
        System.out.println();
        Printer.printTaskNumber(18);
        Printer.printTaskName(".higher() - ближайший больший(не такой же!!!)");
        task18();
        System.out.println();
        Printer.printTaskNumber(19);
        Printer.printTaskName(".lower() - ближайший больший(не такой же!!!)");
        task19();
        System.out.println();
        Printer.printDescription("Так же можно вернуть подмножества с помощью методов(у кажого их методов по 2 вариации):\n" +
                "\t - headSet() - с начала коллекции до определенного элемента\n" +
                "\t - subSet() - из середины \n" +
                "\t - tailSet() - с конца коллекции (начиная с какого-то элемента");

        System.out.println();
        System.out.println();
    }

    public static void task1() {
        TreeSet<String> todoList = new TreeSet<>();
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
        TreeSet<TaskWithComp> todoList = new TreeSet<>();
        try {
            todoList.add(new TaskWithComp("Покормить лошадь"));
            Thread.sleep(1);
            todoList.add(new TaskWithComp("Антону напомнить об отчете"));
            Thread.sleep(1);
            todoList.add(new TaskWithComp("Купить молоко"));
            Thread.sleep(1);
            todoList.add(new TaskWithComp("Выбросить мусор"));
        } catch (InterruptedException ie) {
            System.out.println("Упс...");
        }

        for (TaskWithComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task3() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskComparator());
        try {
            todoList.add(new TaskWithoutComp("Покормить лошадь"));
            Thread.sleep(1);
            todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
            Thread.sleep(1);
            todoList.add(new TaskWithoutComp("Купить молоко"));
            Thread.sleep(1);
            todoList.add(new TaskWithoutComp("Выбросить мусор"));
        } catch (InterruptedException ie) {
            System.out.println("Упс...");
        }

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task4() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskComparator());
        try {
            todoList.add(new TaskWithoutComp("Покормить лошадь"));
            Thread.sleep(1);
            todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
            Thread.sleep(1);
            todoList.add(new TaskWithoutComp("Купить молоко"));
            Thread.sleep(1);
            todoList.add(new TaskWithoutComp("Выбросить мусор"));
            Thread.sleep(1);
        } catch (InterruptedException ie) {
            System.out.println("Упс...");
        }

        System.out.println(todoList.ceiling(new TaskWithoutComp("Купить молоко")));
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task5() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        TaskWithoutComp taskSearch = new TaskWithoutComp("Купить молоко");
        System.out.println("Ищем - " + taskSearch);
        System.out.println(todoList.ceiling(taskSearch));
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task6() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        TaskWithoutComp taskSearch = new TaskWithoutComp("Купить мол");
        System.out.println("Ищем - " + taskSearch);
        System.out.println(todoList.ceiling(taskSearch));
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task7() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        TaskWithoutComp taskSearch = new TaskWithoutComp("Купить мол");
        System.out.println("Ищем - " + taskSearch);
        System.out.println(todoList.floor(taskSearch));
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task8() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        TaskWithoutComp taskSearch = new TaskWithoutComp("Купить мол");
        System.out.println("Ищем - " + taskSearch);
        System.out.println(todoList.contains(taskSearch));
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task9() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        TaskWithoutComp taskSearch = new TaskWithoutComp("Купить молоко");
        System.out.println("Ищем - " + taskSearch);
        System.out.println(todoList.contains(taskSearch));
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task10() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        System.out.println(todoList.first());
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task11() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        System.out.println(todoList.last());
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task12() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        System.out.println(todoList.pollFirst());
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task13() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        TaskWithoutComp taskSearch = new TaskWithoutComp("Купить молоко");
        System.out.println("Ищем - " + taskSearch);
        System.out.println("Найдено - " + todoList.pollLast());
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task14() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        System.out.println(todoList.isEmpty());
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task15() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        todoList.clear();
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task16() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        todoList.remove(new TaskWithoutComp("Купить молоко"));
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task17() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        System.out.println(todoList.size());
        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task18() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        TaskWithoutComp taskSearch = new TaskWithoutComp("Купить молоко");
        System.out.println("Ищем - " + taskSearch);
        System.out.println("Найдено - " + todoList.higher(taskSearch));

        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }


    public static void task19() {
        TreeSet<TaskWithoutComp> todoList = new TreeSet<>(new TaskNameComparator());
        todoList.add(new TaskWithoutComp("Покормить лошадь"));
        todoList.add(new TaskWithoutComp("Антону напомнить об отчете"));
        todoList.add(new TaskWithoutComp("Купить молоко"));
        todoList.add(new TaskWithoutComp("Выбросить мусор"));

        TaskWithoutComp taskSearch = new TaskWithoutComp("Купить молоко");
        System.out.println("Ищем - " + taskSearch);
        System.out.println("Найдено - " + todoList.lower(taskSearch));

        System.out.println();

        for (TaskWithoutComp item : todoList) {
            System.out.println(item);
        }
    }
}
