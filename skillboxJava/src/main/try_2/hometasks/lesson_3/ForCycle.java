package main.try_2.hometasks.lesson_3;

import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                System.out.println(i + "*" + value / i);
            }
        }
    }
}
