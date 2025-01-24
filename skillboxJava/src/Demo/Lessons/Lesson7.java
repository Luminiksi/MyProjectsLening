package Demo.Lessons;

import myFeatures.Printer;

public class Lesson7 {
    public static void run() {
        Printer.printLessonNumber(7, 2);
        Printer.printLessonName("Тернарный оператор");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        Printer.printDescription("Изегаем длинных цепочек тернарных опрераторв - лучше поставить условия" +
                "(для лучшей читаемости кода)");
        Printer.printTaskNumber(4);
        task4();
        System.out.println();
    }

    public static void task1() {
        boolean passIsValid = true;
        boolean inCarantine = true;

        String message;
        if (passIsValid && !inCarantine) {
            message = "Проход открыт";
        } else {
            message = "Проход закрыт";
        }
    }

    public static void task2() {
        boolean passIsValid = true;
        boolean inCarantine = true;

        String message = passIsValid && !inCarantine ? "Проход открыт" : "Проход закрыт";
    }

    public static void task3() {
        boolean passIsValid = true;
        boolean inCarantine = true;

        boolean isPersonnel = true;

        String message = passIsValid && !inCarantine ?
                "Проход открыт" :
                (isPersonnel ? "Проход открыт для персонала" : "Проход закрыт");
    }

    public static void task4() {
        boolean passIsValid = true;
        boolean inCarantine = true;

        boolean isPersonnel = true;

        String message;
        if (passIsValid && !inCarantine) {
            message = "Проход открыт";
        } else if (isPersonnel) {
            message = "Проход открыт для персонала";
        } else {
            message = "Проход закрыт";
        }
    }
}
