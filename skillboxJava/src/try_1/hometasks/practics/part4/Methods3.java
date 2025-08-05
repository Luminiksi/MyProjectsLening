package try_1.hometasks.practics.part4;

import java.util.Scanner;

public class Methods3 {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите <Enter>: ");
        double value = new Scanner(System.in).nextDouble();
        square(value);
    }

    public static void square(double value) {
        System.out.println(value * value);
    }
}
