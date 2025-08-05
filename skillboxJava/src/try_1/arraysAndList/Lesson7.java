package try_1.arraysAndList;

import try_1.myFeatures.Printer;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson7 {
    public static void run() {
        Printer.printLessonNumber(7, 10);
        Printer.printLessonName("Списки");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        task7();

        System.out.println();
        System.out.println();
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

        for (int i = 0; i < winnerCerts.size(); i++) {
            System.out.println(winnerCerts.get(i));
        }
    }

    public static void task2() {
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

        for (Integer winnerNumber : winnerCerts) {
            System.out.println(winnerNumber);
        }
    }

    public static void task3() {
        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Купить молока", "5 пакетов"));
        taskList.add(new Task("Покормить кота", "новым кормом!"));
        taskList.add(new Task("Сжечь секретное", "Особенно из синей сумки!"));

        taskList.add(0, new Task("Очень срочная задача", ""));
        taskList.remove(1);
        taskList.set(1, new Task("Покормить лошадь", "Новым кормом"));

        for (Task task : taskList) {
            System.out.println(task);
        }
    }

    public static void task4() {
        Integer[] numbers = {10, 20, 30, 40};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(numbers));
        for (Integer numb : list) {
            System.out.println(numb);
        }
    }

    public static void task5() {
        Integer[] numbers = {10, 20, 30, 40};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(numbers));
        Integer[] nums = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
    }

    public static void task6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Первое");
        list.add("Второе");
        list.add("Третье");
    }

    public static void task7() {
        ArrayList<String> list = new ArrayList<>() {{
            add("Первое");
            add("Второе");
            add("Третье");
        }};
    }
}
