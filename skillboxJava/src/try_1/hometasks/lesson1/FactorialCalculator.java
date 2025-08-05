package try_1.hometasks.lesson1;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        int fact = 1;
        for (int i = 1; i <= value; i++) {
            fact *= i;
        }
        System.out.println("Факториал " + value + "! равен " + fact);
    }
}
