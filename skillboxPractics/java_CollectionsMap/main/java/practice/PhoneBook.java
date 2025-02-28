package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {
    private HashMap<String, String> phones = new HashMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (!isValidInfo(phone, name)) {
            printError();
            return;
        }
        phones.put(phone, name);
        System.out.println("Контакт сохранен!");
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        if (!isValidPhone(phone)) {
            printError();
            return "";
        }
        if (phones.containsKey(phone)) {
            return phones.get(phone) + " - " + phone;
        }
        return "";
    }

    public Set<String> getContactByName(String name) {
        TreeSet<String> phonesSet = new TreeSet<>();
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        if (!isValidName(name)) {
            printError();
            return phonesSet;
        }
        if (!phones.containsValue(name)) {
            return phonesSet;
        }
        for (Map.Entry<String, String> pair : phones.entrySet()) {
            if (pair.getValue().equals(name)) {
                phonesSet.add(pair.getValue() + " - " + pair.getKey());
            }
        }
        return phonesSet;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> phonesSet = new TreeSet<>();
        for (Map.Entry<String, String> pair : phones.entrySet()) {
            String name = pair.getValue() + " - ";
            String elementExist = getContactFromSet(phonesSet, name);
            if (elementExist == null) {
                phonesSet.add(name + pair.getKey());
            } else {
                phonesSet.remove(elementExist);
                phonesSet.add(elementExist + ", " + pair.getKey());
            }
        }
        return phonesSet;
    }

    public static boolean isValidInfo(String phone, String name) {
        if (!isValidPhone(phone) || !isValidName(name)) {
            return false;
        }
        return true;
    }

    public static boolean isValidName(String name) {
        if (name.isBlank()) {
            return false;
        }
        String regex = "[а-яА-ЯёЁ]+";
        return name.matches(regex);
    }

    public static boolean isValidPhone(String phone) {
        if (phone.isBlank()) {
            return false;
        }
        String regex = "[0-9]{11}";
        return phone.matches(regex);
    }

    public static void printError() {
        System.out.println("Неверный формат ввода");
    }

    private String getContactFromSet(Set<String> set, String name) {
        for (String element : set) {
            if (element.startsWith(name)) {
                return element;
            }
        }
        return null;
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}