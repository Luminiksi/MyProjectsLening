package main.try_2.arraysAndList;

import main.try_2.myFeatures.Printer;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson_10_7 {

    public static void run() {
        Printer.printLessonNumber(7, 10);
        Printer.printLessonName("Списки");

        Printer.printTaskNumber(1);
        Printer.printTaskName("ArrayList - int (выиграшные сертификаты)");
        task1();
        Printer.printTaskNumber(2);
        Printer.printTaskName("ArrayList - объекты(список дел), а так же методы работы с ArrayList");
        task2();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Преобразование массива в список ArrayList и обратно");
        task3();
    }

    public static void task1() {
        int certCount = 1000;
        int winnersRate = 100;
        int[] certNumbers = new int[certCount];
        ArrayList<Integer> winnerCerts = new ArrayList<>();
        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            if (i % winnersRate == 0) {
                winnerCerts.add(certNumbers[i]);
            }
        }

        for (int cert : winnerCerts) {
            System.out.println(cert);
        }
    }

    public static void task2() {
        ArrayList<Task> taskList = new ArrayList<>();

        taskList.add(new Task("Купить молока", "5 пакетов"));
        taskList.add(new Task("Покормить кота", "новым кормом!"));
        taskList.add(new Task("Сжечь серктеное", "Особенно из синей сумки!"));
        printTasksWithInfo(taskList, "Добавили 3 объекта в список:");

        taskList.add(0, new Task("Очень срочная задача", ""));
        printTasksWithInfo(taskList, "Добавили элемент вначало списка (add(0, ...))");

        taskList.remove(1);
        printTasksWithInfo(taskList, "Удалили 2 элемент(remove(1))");

        taskList.set(1, new Task("Покормить лошадь", "Тоже новым кормом"));
        printTasksWithInfo(taskList, "Обновили 2ю задачу (set(1, ...))");
    }

    public static void printTasksWithInfo(ArrayList<Task> array, String description) {
        System.out.println(description);
        for (Task task : array) {
            System.out.println(task);
        }
        System.out.println();
    }

    public static void task3() {
        Integer[] numbers = {10, 20, 30, 40};
        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(Arrays.asList(numbers));
        for (Integer value : values) {
            System.out.println(value);
        }
        System.out.println();

        Integer[] nums = values.toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
    }
}
