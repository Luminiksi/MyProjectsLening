package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    TreeSet<String> emailList = new TreeSet<>(new EmailComparator());

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        String regex = "[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+";
        if (!email.matches(regex)) {
            System.out.println("Неверный формат email");
            return;
        }
        emailList.add(email);
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(emailList);
    }
}
