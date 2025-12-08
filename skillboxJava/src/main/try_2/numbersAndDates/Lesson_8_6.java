package main.try_2.numbersAndDates;

import main.try_2.myFeatures.Printer;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Lesson_8_6 {
    public static void run() {
        Printer.printLessonNumber(6, 8);
        Printer.printLessonName("Работа с большими и точными числами");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Неточность при работе с double - 1 пример");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Неточность при работе с double - 2 пример");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Переполнение (long)");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Работа с BigInteger");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Работа с BigDecimal");
        task5();
    }

    public static void task1() {
        double value = 1.1 + 1.1 + 1.1;
        System.out.println(value);
    }

    public static void task2() {
        double value = 0;
        for (int i = 0; i < 1_000_000; i++) {
            value += 0.1;
        }
        System.out.println(value);
    }

    public static void task3() {
        long value = 1_000_000_000_000L;
        System.out.println(value * value);
    }

    public static void task4() {
        BigInteger integer = new BigInteger("64783648236486328479");
        BigInteger integerAdd = integer.add(integer);
        System.out.println("Sum = " + integerAdd);

        BigInteger integerMultiply = integer.multiply(integer);
        System.out.println("Multiply = " + integerMultiply);

        BigInteger integerDivide = integer.divide(integer);
        System.out.println("Multiply = " + integerDivide);

        BigInteger integerRem = integer.remainder(new BigInteger("64783648236486328400"));
        System.out.println("% = " + integerRem);

        BigInteger integerInt = new BigInteger("647836");
        System.out.println("Integer = " + integerInt.longValue());
        System.out.println("Integer(переполнение) = " + integer.longValue());

        BigInteger integer1 = new BigInteger("64783648236486328459");
        System.out.println("Сравнение = " + integer.compareTo(integer1) + " Значит первое число больше второго");
        System.out.println("Сравнение = " + integer1.compareTo(integer) + " Значит первое число меньше второго");
        System.out.println("Сравнение = " + integer1.compareTo(integer1) + " Значит числа равны");


        BigInteger integerPow = new BigInteger("647847837498732");
        System.out.println(integerPow.pow(1000));
    }

    public static void task5() {
        double value = 2.438493;
        BigDecimal decimal = new BigDecimal(value);
        System.out.println("double = " + value + "; decimal = " + decimal);
        BigDecimal decimalS = new BigDecimal("2.438493");
        System.out.println("decimal(from string) = " + decimalS);
        System.out.println();

        BigDecimal decimal1 = new BigDecimal(1);
        System.out.println("divide:");
//        System.out.println(decimal1.divide(new BigDecimal(3)));
        System.out.println(decimal1.divide(new BigDecimal(2)));
        System.out.println();

        BigDecimal decimal2 = new BigDecimal("4673264823974.4326746324");
        System.out.println("pow:");
        System.out.println(decimal2.pow(1000));
    }
}
