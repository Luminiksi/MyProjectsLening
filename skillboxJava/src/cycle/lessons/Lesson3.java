package cycle.lessons;

import myFeatures.Printer;

import java.util.Scanner;

public class Lesson3 {
    public static void run() {
        Printer.printLessonNumber(3, 3);
        Printer.printLessonName("Циклы “while” и “do while”");
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        task4();
        System.out.println();
    }

    public static void task1()  {
//        Не вбиваю в исполнение, т.к. это бесконечный цикл
        while (true) {
            System.out.println("Текст будет выводиться постоянно");
        }
    }

    public static void task2()  {
        int sum = 0;
        int value = - 1;
        while (value != 0) {
            value = new Scanner(System.in).nextInt();
            sum += value;
        }
        System.out.println("Сумма введееных чисел равна " + sum);
    }

    public static void task3()  {
// но так не принято писать, лучше использовать цикл while
        int sum = 0;
        for (int value = -1; value != 0;){
            value = new Scanner(System.in).nextInt();
            sum += value;
        }
        System.out.println("Сумма введееных чисел равна " + sum);
    }

    public static void task4()  {
        int secretPinCode = 7567;
        int pinCode = -1;
        while (pinCode != secretPinCode) {
            if(pinCode == -1) {
                System.out.println("Введите PIN-код:");
            } else {
                System.out.println("PIN-код введет неверно. Введите верный PIN-код:");
            }
            pinCode = new Scanner(System.in).nextInt();
        }
        System.out.println("PIN-код введён верно!!!");
    }

    public static void task5()  {
        int secretPinCode = 7567;
        int pinCode = -1;
        while (pinCode != secretPinCode) {
            if(pinCode == -1) {
                System.out.println("Введите PIN-код:");
            } else {
                System.out.println("PIN-код введет неверно. Введите верный PIN-код:");
            }
            pinCode = new Scanner(System.in).nextInt();
        }
        System.out.println("PIN-код введён верно!!!");
    }
}
