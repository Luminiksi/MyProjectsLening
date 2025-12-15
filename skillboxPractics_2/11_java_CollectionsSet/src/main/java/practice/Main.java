import practice.EmailList;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private static EmailList list = new EmailList();

    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            //TODO: write code here
            if (input.toLowerCase().equals("list")) {
                for (String list : list.getSortedEmails()) {
                    System.out.println(list);
                }
            } else {
                input = input.trim();
                int index = input.indexOf(' ');
                if (index < 0) {
                    System.out.println("Не верная комманда");
                    continue;
                }
                String command = input.substring(0, index);
                if (command.toLowerCase().equals("add")) {
                    list.add(input.substring(index + 1));
                } else {
                    System.out.println("Не верная комманда");
                }
            }
        }
    }
}
