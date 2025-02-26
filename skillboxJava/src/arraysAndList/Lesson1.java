package arraysAndList;

import myFeatures.Printer;

public class Lesson1 {
    public static void run() {
        Printer.printLessonNumber(2, 10);
        Printer.printLessonName("Создание массивов");
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
        System.out.println();
    }

    public static void task1() {
        int[] floors = {3, 10, 17, 22, 16, 14};
        floors[0] = 555;
        System.out.println(floors.length);
        System.out.println(floors[0]);
    }

    public static void task2() {
        int[] test = new int[20];
        test[19] = 555;
        System.out.println(test.length);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    public static void task3() {
        String[] test = new String[10];
        System.out.println(test.length);
        test[0] = "word";
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    public static void task4() {
        String[] test = {"678", "Word", ""};
        System.out.println(test.length);
        for (int i = 0; i < test.length; i++) {
            System.out.println("'" + test[i] + "'");
        }
    }
}
