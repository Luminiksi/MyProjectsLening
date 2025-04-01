package exeption;

import myFeatures.Printer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson4 {
    public static void run() throws InterruptedException {
        Printer.printLessonNumber(4, 18);
        Printer.printLessonName("Обработка исключений");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        task9();
        System.out.println();
        Printer.printTaskNumber(10);
        task10();
        System.out.println();
        Thread.sleep(100);
        Printer.printTaskNumber(11);
        task11();
        System.out.println();
    }

    public static void task1() {
        System.out.println("BEFORE");
        try {
            doSomething();
        } catch (NullPointerException e) {
            System.out.println("We caught " + e);
        } finally {
            System.out.println("We're in finally block!");
        }
        System.out.println("AFTER");
    }

    public static void doSomething() {
        int[] intArray = null;
        intArray[3] = 10;
    }

    public static void task2() {
        System.out.println("BEFORE");
        try {
            return;
        } finally {
            System.out.println("We're in finally block!");
        }
    }

    public static void task3() {
        System.out.println("BEFORE");
        long start = System.currentTimeMillis();

        try {
            doSomething();
        } catch (NullPointerException e) {
            System.out.println("We caught " + e);
        } finally {
            long duration = System.currentTimeMillis() - start;
            System.out.println("Duration: " + duration + " ms");
        }

        System.out.println("AFTER");
    }

    public static void task4() {
        System.out.println("BEFORE");
        long start = System.currentTimeMillis();

        try {
            doSomething();
        } catch (NullPointerException e) {
            System.out.println("We caught " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("We caught array index exception");
        } finally {
            long duration = System.currentTimeMillis() - start;
            System.out.println("Duration: " + duration + " ms");
        }

        System.out.println("AFTER");
    }

    public static void task5() {
        System.out.println("BEFORE");
        long start = System.currentTimeMillis();

        try {
            doSomethingIO();
        } catch (NullPointerException e) {
            System.out.println("We caught " + e);
        } catch (IOException e) {
            System.out.println("We caught IO exception");
        } finally {
            long duration = System.currentTimeMillis() - start;
            System.out.println("Duration: " + duration + " ms");
        }

        System.out.println("AFTER");
    }

    public static void doSomethingIO() throws IOException {
        int[] intArray = null;
        intArray[3] = 10;
    }

    public static void task6() {
        System.out.println("BEFORE");
        long start = System.currentTimeMillis();

        try {
            doSomethingIO();
        } catch (NullPointerException e) {
            System.out.println("We caught " + e);
        } catch (Exception e) {
            System.out.println("We caught exception");
        } finally {
            long duration = System.currentTimeMillis() - start;
            System.out.println("Duration: " + duration + " ms");
        }

        System.out.println("AFTER");
    }

    public static void task7() {
        System.out.println("BEFORE");
        long start = System.currentTimeMillis();

        try {
            doSomething();
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
//            Большая логика
        }/* catch (NullPointerException e) {
//            Большая логика
        } catch (ArrayIndexOutOfBoundsException e) {
//            Большая логика
        }*/ finally {
            long duration = System.currentTimeMillis() - start;
            System.out.println("Duration: " + duration + " ms");
        }

        System.out.println("AFTER");
    }

    public static void task8() {
        BufferedReader reader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("file.txt");
            reader = new BufferedReader(fileReader);

            String data = reader.readLine();
            doSomethingFile(data);
        } catch (FileNotFoundException e) {
            System.out.println("File not found :(");
        } catch (IOException e) {
            System.out.println("IO exception occured");
        } finally {
            try {
                reader.close();
                fileReader.close();
            } catch (Exception e) {
                System.out.println("Unable to close resource!");
            }
        }
    }

    public static void doSomethingFile(String data) {
        System.out.println("Do something with data");
    }

    public static void task9() {
        try (FileReader fileReader = new FileReader("file.txt");
             BufferedReader reader = new BufferedReader(fileReader);) {
            String data = reader.readLine();
            doSomethingFile(data);
        } catch (FileNotFoundException e) {
            System.out.println("File not found :(");
        } catch (IOException e) {
            System.out.println("IO exception occured");
        }
    }

    public static void task10() {
        try {
            try (MyResource resource = new MyResource()) {
                doSomething();
            }
        } catch (Exception e) {
            e.printStackTrace();
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed exceptions: " + t);
            }
        }
    }

    public static void task11() {
        try {
            try (MyResource resource = new MyResource()) {
                doSomething();
            }
        } catch (Exception e) {
            System.out.println(e);
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed exceptions: " + t);
            }
        }
    }

}
