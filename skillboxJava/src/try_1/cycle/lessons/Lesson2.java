package try_1.cycle.lessons;

import try_1.myFeatures.Printer;

import java.util.Scanner;

public class Lesson2 {
    public static void run() {
        Printer.printLessonNumber(2, 3);
        Printer.printLessonName("Цикл “for”");
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
        Printer.printTaskNumber(8);
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        task9();
        System.out.println();
        Printer.printTaskNumber(11);
        task11();
        System.out.println();
    }

    public static void task1() {
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println("YES");
        }
    }

    public static void task2() {
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task3() {
        int i;
        for (i = 0; i < 5; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("After cycle");
        System.out.println(i);
    }

    public static void task4() {
        for (int i = 15; i <= 40; i = i + 1) {
            System.out.println(i);

            if(i == 16) {
                System.out.println("Вы можете начинать обучаться вождению");
            }

            if(i == 18) {
                System.out.println("Вы можете получить волительские права");
            }

            if(i == 35) {
                System.out.println("Вы можете баллотироваться на пост призедента");
            }
        }
    }

    public static void task5() {
        for (int i = 50; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task6() {
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task7() {
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        for(;;) {
            System.out.println("Введите первое число:");
            int value1 = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число:");
            int value2 = new Scanner(System.in).nextInt();
            int result = value1 * value2;
            System.out.println("Произведение чисел равно: " + result);

            //Сама добавила, чтобы понимать когда выйти, т.к. у меня все подряд в мейнике (а тут бесконечный цикл)
            System.out.println("Выйти из цикла? Y - да, N - нет");
            String value3 = new Scanner(System.in).next();
            if (!value3.isBlank() && value3.toLowerCase().charAt(0) == 'y'){
                break;
            }
        }
    }

    public static void task9() {
        int i = 0;
        for(; i <  100; i = i + 3) {
            System.out.println(i);
        }
    }

    public static void task10() {
//        Бесконечный цикл
        for(int i = 0; i <  100;) {
            System.out.println(i);
        }
    }

    public static void task11() {
        for(int i = 0; i <  100;) {
            System.out.println(i);
            i = i + 2;
        }
    }
}
