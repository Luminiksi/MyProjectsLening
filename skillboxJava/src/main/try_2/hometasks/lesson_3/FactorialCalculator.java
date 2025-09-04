package main.try_2.hometasks.lesson_3;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        long factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }

        System.out.println("Факториал числа " + value + " равен " + factorial);
    }
}
