package practice;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    private TreeMap<String, String> phones = new TreeMap<>();
    private static final String phoneFormat = "[0-9]{11}";
    private static final String nameFormat = "[а-яА-ЯёЁ]+";

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (!checkPhone(phone) || !checkName(name)) {
            return;
        }
        phones.put(phone, name);
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        if (!checkPhone(phone)) {
            return "";
        }
        String name = this.phones.get(phone);
        return name == null ? "" : name + " - " + phone;
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        TreeSet<String> contacts = new TreeSet<>();
        if (!checkName(name)) {
            return contacts;
        }
        for (Map.Entry<String, String> entry : this.phones.entrySet()) {
            if (entry.getValue().equals(name)) {
                contacts.add(entry.getValue() + " - " + entry.getKey());
            }
        }
        return contacts;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> contacts = new TreeSet<>();
        Set<String> keys = new TreeSet<>();
        for (Map.Entry<String, String> entry : this.phones.entrySet()) {
            if (keys.contains(entry.getKey())) {
                continue;
            }
            String name = entry.getValue();
            String phone = "";
            for (Map.Entry<String, String> entry2 : this.phones.entrySet()) {
                if (name.equals(entry2.getValue())) {
                    if (phone.isBlank()) {
                        phone += entry2.getKey();
                    } else {
                        phone += ", " + entry2.getKey();
                    }
                }
            }
            keys.add(entry.getValue());
            contacts.add(name + " - " + phone);
        }
        return contacts;
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */

    public static boolean checkPhone(String phone) {
        if (phone == null || phone.isEmpty()) {
            return false;
        }
        return phone.matches(phoneFormat);
    }

    public static boolean checkName(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        return name.matches(nameFormat);
    }
}