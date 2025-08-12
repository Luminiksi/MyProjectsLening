package main.try_1.hometasks.lesson1;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int value = 60;
        while (true) {
            int attempt = new Scanner(System.in).nextInt();
            if (attempt == value) {
                System.out.println("Вы угадали!");
            } else if (attempt < value) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
    }
}
