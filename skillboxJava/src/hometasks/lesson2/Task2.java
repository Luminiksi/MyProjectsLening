package hometasks.lesson2;

import myFeatures.Printer;

public class Task2 {
    public static void run() {
        Printer.printLessonNumber(12, 2);
        Printer.printPracticeInfo();
        Printer.printTaskNumber(1);
        Printer.printAttemptNumber(1);
        task1();
        Printer.printAttemptNumber(2);
        task2();
        Printer.printAttemptNumber(3);
        task3();
        Printer.printAttemptNumber(4);
        task4();
    }

    public static void task1() {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
            if (katyaAge >= mishaAge) {
                middle = katyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyaAge;
            }
        } else if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
            max = mishaAge;
            if (katyaAge >= vasyaAge) {
                middle = katyaAge;
                min = vasyaAge;
            }
            middle = vasyaAge;
            min = katyaAge;
        } else {
            max = katyaAge;
            if(vasyaAge >= mishaAge) {
                middle = vasyaAge;
                min = mishaAge;
            }
            middle = mishaAge;
            min = vasyaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }

    public static void task2() {
        int vasyaAge = 60;
        int katyaAge = 35;
        int mishaAge = 15;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
            if (katyaAge >= mishaAge) {
                middle = katyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyaAge;
            }
        } else if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
            max = mishaAge;
            if (katyaAge >= vasyaAge) {
                middle = katyaAge;
                min = vasyaAge;
            }
            middle = vasyaAge;
            min = katyaAge;
        } else {
            max = katyaAge;
            if(vasyaAge >= mishaAge) {
                middle = vasyaAge;
                min = mishaAge;
            }
            middle = mishaAge;
            min = vasyaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }

    public static void task3() {
        int vasyaAge = 45;
        int katyaAge = 17;
        int mishaAge = 17;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
            if (katyaAge >= mishaAge) {
                middle = katyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyaAge;
            }
        } else if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
            max = mishaAge;
            if (katyaAge >= vasyaAge) {
                middle = katyaAge;
                min = vasyaAge;
            }
            middle = vasyaAge;
            min = katyaAge;
        } else {
            max = katyaAge;
            if(vasyaAge >= mishaAge) {
                middle = vasyaAge;
                min = mishaAge;
            }
            middle = mishaAge;
            min = vasyaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }

    public static void task4() {
        int vasyaAge = 55;
        int katyaAge = 55;
        int mishaAge = 55;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
            if (katyaAge >= mishaAge) {
                middle = katyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyaAge;
            }
        } else if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
            max = mishaAge;
            if (katyaAge >= vasyaAge) {
                middle = katyaAge;
                min = vasyaAge;
            }
            middle = vasyaAge;
            min = katyaAge;
        } else {
            max = katyaAge;
            if(vasyaAge >= mishaAge) {
                middle = vasyaAge;
                min = mishaAge;
            }
            middle = mishaAge;
            min = vasyaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}
