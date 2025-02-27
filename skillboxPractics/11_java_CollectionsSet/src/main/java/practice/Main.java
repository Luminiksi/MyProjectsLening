package practice;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

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
        EmailList emailList = new EmailList();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            //TODO: write code here
            String[] command = input.trim().split("\s");
            switch (command[0]) {
                case "ADD" -> add(emailList, command);
                case "LIST" -> list(emailList);
                default -> System.out.println("Неясная команда");
            }
        }
    }

    public static void list(EmailList emailList) {
        for (String email : emailList.getSortedEmails()) {
            System.out.println(email);
        }
    }

    public static void add(EmailList emailList, String[] command) {
        if (command.length < 2) {
            System.out.println("Вы не ввели email для добавления");
            return;
        }
        emailList.add(command[1]);
    }
}
