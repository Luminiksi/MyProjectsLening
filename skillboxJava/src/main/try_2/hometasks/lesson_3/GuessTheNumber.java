package main.try_2.hometasks.lesson_3;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int value = 60;
        System.out.println("Попробуйте угадать число:");
        while (true) {
            int attempt = new Scanner(System.in).nextInt();
            if (value == attempt) {
                System.out.println("Вы угадали!");
                break;
            } else if (attempt > value) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
