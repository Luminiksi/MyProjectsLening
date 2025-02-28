package practice;

import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("Введите номер, имя или команду:");
            String command = SCANNER.nextLine();
            if ("LIST".equals(command)) {
                list(phoneBook);
            } else {
                add(command, phoneBook);
            }
            System.out.println();
        }
    }

    public static void list(PhoneBook phoneBook) {
        Set<String> set = phoneBook.getAllContacts();
        for (String info : set) {
            System.out.println(info);
        }
    }

    public static void add(String command, PhoneBook phoneBook) {
        if (PhoneBook.isValidPhone(command)) {
            checkPhone(command, phoneBook);
        } else if (PhoneBook.isValidName(command)) {
            checkName(command, phoneBook);
        } else {
            PhoneBook.printError();
        }
    }

    public static void checkPhone(String command, PhoneBook phoneBook) {
        String name = phoneBook.getContactByPhone(command);
        if (name.isBlank()) {
            System.out.println("Такого номера нет в телефонной книге.");
            addByPhone(command, phoneBook);

        } else {
            System.out.println("Такой номер в телефонной книге уже зарегистирован на имя " + name + ", заменить? (Y/N)");
            boolean isValid = false;
            while (!isValid) {
                String answer = SCANNER.nextLine();
                switch (answer) {
                    case "Y" -> {
                        addByPhone(command, phoneBook);
                        isValid = true;
                    }
                    case "N" -> isValid = true;
                    default -> System.out.println("Введите - Y или N");
                }
            }
        }
    }

    public static void checkName(String command, PhoneBook phoneBook) {
        Set<String> phones = phoneBook.getContactByName(command);
        if (phones.isEmpty()) {
            System.out.println("Такого имени нет в телефонной книге.");
            addByName(command, phoneBook);
        } else {
            System.out.println("Такое имя уже имеют следующие контакты:");
            for (String phone : phones) {
                System.out.println(phone);
            }
            System.out.println("Добавить новый номер? (Y/N)");
            boolean isValid = false;
            while (!isValid) {
                String answer = SCANNER.nextLine();
                switch (answer) {
                    case "Y" -> {
                        addByName(command, phoneBook);
                        isValid = true;
                    }
                    case "N" -> isValid = true;
                    default -> System.out.println("Введите - Y или N");
                }
            }
        }
    }

    public static void addByPhone(String phone, PhoneBook phoneBook) {
        System.out.println("Введите имя абонента для номера “" + phone + "”:");
        String name = "";
        boolean isValid = false;
        while (!isValid) {
            name = SCANNER.nextLine();
            if (PhoneBook.isValidName(name)) {
                isValid = true;
            } else {
                System.out.println("Введите корректное имя");
            }
        }
        phoneBook.addContact(phone, name);
    }

    public static void addByName(String name, PhoneBook phoneBook) {
        System.out.println("Введите номер телефона для абонента “" + name + "”:");
        String phone = "";
        boolean isValid = false;
        while (!isValid) {
            phone = SCANNER.nextLine();
            if (PhoneBook.isValidPhone(phone)) {
                isValid = true;
            } else {
                System.out.println("Введите корректный телефон (из 11 символов)");
            }
        }
        phoneBook.addContact(phone, name);
    }


}
