package main.try_1.exeption;

import main.try_1.myFeatures.Printer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson5 {
    public static void run() throws InterruptedException {
        Printer.printLessonNumber(5, 18);
        Printer.printLessonName("Создание собственных исключений");
        Printer.printTaskNumber(1);
        try {
            task1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(100);
        System.out.println();
    }

    public static void task1() throws IOException {
        readLineFromFile("");
    }

    public static String readLineFromFile(String fileName) throws IOException {
        try (FileReader fileReader = new FileReader("file.txt");
             BufferedReader reader = new BufferedReader(fileReader);) {
            return reader.readLine();
        } catch (FileNotFoundException e) {
            if (!isValidName(fileName)) {
                throw new IncorrectFileNameException("File name " + fileName + " is not valid");
            }
            throw e;
        }
    }

    public static boolean isValidName(String fileName) {
//        Тут какая-то логика
        return false;
    }


    public static void task2() {

    }
}
