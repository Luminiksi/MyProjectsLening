package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegexPart2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }

            // TODO:напишите ваш код тут, результат вывести в консоль.
            boolean isValid = true;
            String regex = "[^0-9]";
            String phone = input.replaceAll(regex, "");
            if (phone.length() == 10) {
                phone = "7" + phone;
            } else if (phone.length() > 11 || phone.length() < 10) {
                isValid = false;
            } else {
                if (phone.charAt(0) == '8') {
                    phone = phone.replaceFirst("8", "7");
                } else if (phone.charAt(0) != '7') {
                    isValid = false;
                }
            }
            if (isValid) {
                System.out.println(phone);
            } else {
                System.out.println("Неверный формат номера");
            }
        }
    }
}
