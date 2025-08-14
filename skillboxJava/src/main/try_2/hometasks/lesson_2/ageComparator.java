package main.try_2.hometasks.lesson_2;

import main.try_1.myFeatures.Printer;

public class ageComparator {
    public static void main(String[] args) {
        Printer.printLessonNumber(12, 2);
        Printer.printLessonName("Практическая работа");
        Printer.printTaskNumber(2);
        Printer.printTaskName("Задание 2");
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;
        System.out.println(checkAge(vasyaAge, katyaAge, mishaAge));
    }

    public static String checkAge(int age1, int age2, int age3) {
        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (age1 > age2 && age1 > age3) {
            max = age1;
            if (age2 > age3) {
                middle = age2;
                min = age3;
            } else {
                middle = age3;
                min = age2;
            }
        } else if (age2 > age1 && age2 > age3) {
            max = age2;
            if (age1 > age3) {
                middle = age1;
                min = age3;
            } else {
                middle = age3;
                min = age1;
            }
        } else {
            max = age3;
            if (age2 > age1) {
                middle = age2;
                min = age1;
            } else {
                middle = age1;
                min = age2;
            }
        }

        return "Minimal age: " + min + "\n" +
                "Middle age: " + middle + "\n" +
                "Maximal age: " + max;
    }
}
