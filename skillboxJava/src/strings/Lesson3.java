package strings;

import myFeatures.Printer;

public class Lesson3 {
    public static void run() {
        Printer.printLessonNumber(3, 9);
        Printer.printLessonName("Преобразование чисел в строки и обратно");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
    }

    public static void task1() {
        int age = 37;
        String name = "Анна";
        String value = Integer.toString(age);
        String personInfo = name + " - " + age;

        Double weight = 2.54;
        String value2 = weight.toString();
        String value3 = String.valueOf(weight);
    }

    public static void task2() {
        String value = "21342342";
        int count = Integer.parseInt(value);
        System.out.println(count);

        String value2 = "21.342342";
        Double count2 = Double.parseDouble(value2);
        System.out.println(count2);

        String value3 = "234593849052345938490523459384905234593849052345938490523459384905234593849052345938490523459" +
                "38490523459384905234593849052345938490523459384905234593849052345938490523459384905234593849052345938" +
                "49052345938490523459384905234593849052345938490523459384905234593849052345938490523459384905234593849" +
                "05234593849052345938490523459384905234593849052345938490523459384905234593849052345938490523459384905" +
                "23459384905234593849052345938490523459384905234593849052345938490523459384905234593849052345938490523" +
                "45938490523459384905234593849052345938490523459384905234593849052345938490523459384905234593849052345" +
                "93849052345938490523459384905234593849052345938490523459384905234593849052345938490523459384905234593" +
                "84905234593849052345938490523459384905234593849052345938490523459384905234593849052345938490523459384" +
                "90523459384905234593849052345938490523459384905234593849052345938490523459384905234593849052345938490" +
                "52345938490523459384905234593849052345938490523459384905234593849052345938490523459384905234593849052" +
                "34593849052345938490523459384905234593849052345938490523459384905234593849052345938490523459384905234" +
                "59384905234593849052345938490523459384905234593849052345938490523459384905234593849052345938490523459" +
                "38490523459384905234593849052345938490523459384905234593849052345938490523459384905234593849052345938" +
                "4905234593849052345938490523459384905234593849052345938490523459384905";
        Double count3 = Double.parseDouble(value3);
        System.out.println(count3);

        String value4 = "-234593849052345938490523459384905234593849052345938490523459384905234593849052345938490523459" +
                "38490523459384905234593849052345938490523459384905234593849052345938490523459384905234593849052345938" +
                "49052345938490523459384905234593849052345938490523459384905234593849052345938490523459384905234593849" +
                "05234593849052345938490523459384905234593849052345938490523459384905234593849052345938490523459384905" +
                "23459384905234593849052345938490523459384905234593849052345938490523459384905234593849052345938490523" +
                "45938490523459384905234593849052345938490523459384905234593849052345938490523459384905234593849052345" +
                "93849052345938490523459384905234593849052345938490523459384905234593849052345938490523459384905234593" +
                "84905234593849052345938490523459384905234593849052345938490523459384905234593849052345938490523459384" +
                "90523459384905234593849052345938490523459384905234593849052345938490523459384905234593849052345938490" +
                "52345938490523459384905234593849052345938490523459384905234593849052345938490523459384905234593849052" +
                "34593849052345938490523459384905234593849052345938490523459384905234593849052345938490523459384905234" +
                "59384905234593849052345938490523459384905234593849052345938490523459384905234593849052345938490523459" +
                "38490523459384905234593849052345938490523459384905234593849052345938490523459384905234593849052345938" +
                "4905234593849052345938490523459384905234593849052345938490523459384905";
        Double count4 = Double.parseDouble(value4);
        System.out.println(count4);
    }
}
