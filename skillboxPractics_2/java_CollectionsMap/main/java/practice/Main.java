package practice;

import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("Введите номер, имя или команду:");
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            command(input, phoneBook);
            System.out.println();
        }
    }

    public static void command(String input, PhoneBook phoneBook) {
        if (input.toLowerCase().equals("list")) {
            printPhoneBook(phoneBook);
        } else if (PhoneBook.checkPhone(input)) {
            byPhone(input, phoneBook);
        } else if (PhoneBook.checkName(input)) {
            byName(input, phoneBook);
        } else {
            System.out.println("Неверный формат ввода");
        }
    }

    public static void byPhone(String input, PhoneBook phoneBook) {
        String contact = phoneBook.getContactByPhone(input);
        if (contact.isBlank()) {
            System.out.println("Такого номера нет в телефонной книге.");
            System.out.println("Введите имя абонента для номера “" + input + "”:");
            String name = sc.nextLine();
            if (PhoneBook.checkName(name)) {
                phoneBook.addContact(input, name);
            } else {
                System.out.println("Неверный формат ввода");
            }
        } else {
            System.out.println(contact);
        }
    }

    public static void byName(String input, PhoneBook phoneBook) {
        Set<String> name = phoneBook.getContactByName(input);
        if (name.isEmpty()) {
            System.out.println("Такого имени в телефонной книге нет.");
            System.out.println("Введите номер телефона для абонента “" + input + "”:");
            String phone = sc.nextLine();
            if (PhoneBook.checkPhone(phone)) {
                phoneBook.addContact(phone, input);
            } else {
                System.out.println("Неверный формат ввода");
            }
        } else {
            System.out.println(name);
        }
    }


    public static void printPhoneBook(PhoneBook phoneBook) {
        Set<String> phones = phoneBook.getAllContacts();
        for (String phone : phones) {
            System.out.println(phone);
        }
    }
}
