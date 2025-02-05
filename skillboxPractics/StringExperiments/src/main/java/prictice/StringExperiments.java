package prictice;

import java.util.Scanner;

public class StringExperiments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println(equalsWithCase(str1, str2));
            System.out.println();
        }
    }

    public static String equalsWithCase(String str1, String str2) {
        if (str1.equals(str2)) {
            return str1 + " == " + str2;
        }
        return str1 + " != " + str2;
    }

    public static String equalsWithoutCase(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            return str1 + " == " + str2;
        }
        return str1 + " != " + str2;
    }


}
