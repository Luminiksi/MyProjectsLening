package main.try_2.cycles;

import main.try_1.myFeatures.Printer;

import java.util.Scanner;

public class Lesson_3_2 {
    public static void run() {
        Printer.printLessonNumber(2, 3);
        Printer.printLessonName("Цикл “for”");
        Printer.printDescription("Из лекции");
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
        Printer.printTaskName("Пример с возрастами и правами");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Цикл в обратном направлении");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Выводим четные числа");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Выводим не четные числа");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Пример использования бесконесного цикла");
//        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        Printer.printTaskName("Отсутсвие первого параметра цикла");
        task9();
        System.out.println();
        Printer.printTaskNumber(10);
        Printer.printTaskName("Бесконечный цикл - отсутсвие второго параметра");
//        task10();
        System.out.println();
        Printer.printTaskNumber(11);
        Printer.printTaskName("Бесконечный цикл - отсутсвие третьего параметра");
//        task11();
        System.out.println();
        Printer.printTaskNumber(12);
        Printer.printTaskName("Отсутсвие третьего параметра, но изменение его внутри цикла");
        task12();
    }

    public static void task1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("YES");
        }
    }

    public static void task2() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void task3() {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("After cycle");
        System.out.println(i);
    }

    public static void task4() {
        for (int i = 15; i < 40; i++) {
            System.out.println(i);
            if (i == 16) {
                System.out.println("Вы можете начинать обучаться вождению");
            }
            if (i == 18) {
                System.out.println("Вы можете получить водительские права");
            }
            if (i == 35) {
                System.out.println("Вы можете баллотироваться на пост президента");
            }
        }
    }

    public static void task5() {
        for (int i = 50; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task6() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void task7() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        for (; ; ) {
            System.out.println("Введите первое число: ");
            int value1 = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число: ");
            int value2 = new Scanner(System.in).nextInt();
            int result = value1 * value2;
            System.out.println(result);
        }
    }

    public static void task9() {
        int i = 0;
        for (; i < 100; i += 3) {
            System.out.println(i);
        }
    }

    public static void task10() {
        for (int i = 0; ; i += 3) {
            System.out.println(i);
        }
    }

    public static void task11() {
        for (int i = 0; i < 100; ) {
            System.out.println(i);
        }
    }

    public static void task12() {
        for (int i = 0; i < 100; ) {
            System.out.println(i);
            i += 2;
        }
    }
}
