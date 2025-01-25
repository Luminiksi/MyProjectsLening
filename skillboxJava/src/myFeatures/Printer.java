package myFeatures;

import static myFeatures.Colors.*;

public class Printer {
    public static String getStringLessonNumber(int number) {
        return "For lesson " + number;
    }
    public static String getStringLessonNumber(int number, int module) {
        return "For lesson " + number + " (module " + module + ")";
    }

    public static String getStringTaskNumber(int number) {
        return "Task №" + number;
    }

    public static void printLessonNumber(int number) {
        System.out.println(ANSI_CYAN + "_________ " + getStringLessonNumber(number) + " _________" + ANSI_RESET);
    }

    public static void printLessonNumber(int number, int module) {
        System.out.println(ANSI_CYAN + "____ " + getStringLessonNumber(number, module) + " ____" + ANSI_RESET);
    }

    public static void printLessonName(String name) {
        System.out.println(ANSI_CYAN + name + ANSI_RESET);
    }

    public static void printTaskNumber(int number) {
        System.out.println(ANSI_YELLOW + "<----------- " + getStringTaskNumber(number) + " ----------->" + ANSI_RESET);
    }

    public static void printDescription(String description) {
        System.out.println(ANSI_PURPLE + "Description : \n" + description + ANSI_RESET);
    }

    public static void printTaskName(String taskName) {
        System.out.println(ANSI_GREEN + taskName + ANSI_RESET);
    }

    public static void printTime(long time) {
        System.out.println(ANSI_BLUE + "Время выполнения: " + time + " нс (или в мс: " + time / 1000000 + ")" + ANSI_RESET);
    }

    public static void printResult(String name, String result) {
        System.out.println(ANSI_RED + "-> " + ANSI_RESET + name + ANSI_RED + " -----> " + ANSI_GREEN + result + ANSI_RESET);
    }

    public static void printPracticeInfo() {
        System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_BLACK + "Практика по данному уроку(взято из описания урока, что ниже)" + ANSI_RESET);
    }

    public static void printAttemptNumber(int number) {
        System.out.println(ANSI_CYAN_BACKGROUND + ANSI_BLACK + "> > > Attempt number - " + number + ANSI_RESET);
    }
}
