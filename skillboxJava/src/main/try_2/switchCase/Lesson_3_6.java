package main.try_2.switchCase;

import main.try_1.myFeatures.Printer;

public class Lesson_3_6 {
    public static void run() {
        Printer.printLessonNumber(6, 3);
        Printer.printLessonName("Оператор switch в Java 17");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Замена условий на оператор switch (Без него)");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Замена условий на оператор switch (С ним)");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Интересные возможности switch");
        Printer.printDescription("Начиная с Java 14");
        task3();
    }

    public static void task1() {
        System.out.println(formatString(5));
        System.out.println(formatString(5L));
        System.out.println(formatString(3.5));
        System.out.println(formatString("3.5f"));
    }

    public static void task2() {
        System.out.println(formatterPatternSwitch(5));
        System.out.println(formatterPatternSwitch(5L));
        System.out.println(formatterPatternSwitch(3.5));
        System.out.println(formatterPatternSwitch("3.5f"));
    }

    public static void task3() {
        formatterNewSwitch("string");
        formatterNewSwitch(null);
        formatterNewSwitch(5);

        System.out.println();

        formatterNewSwitch2("Hi");
        formatterNewSwitch2("Hi all!");
        formatterNewSwitch2("Слишком длинная строка");

    }

    static String formatString(Object o) {
        String result = "";
        if (o instanceof Integer) {
            result = String.format("int %d", (Integer) o);
        } else if (o instanceof Long) {
            result = String.format("long %d", (Long) o);
        } else if (o instanceof Double) {
            result = String.format("double %f", (Double) o);
        } else if (o instanceof String) {
            result = String.format("String %s", o);
        }
        return result;
    }

    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

    static void formatterNewSwitch(Object o) {
        switch (o) {
            case null -> System.out.println("null!");
            case String s -> System.out.println("String");
            default -> System.out.println("Something else");
        }
    }

    static void formatterNewSwitch2(String value) {
        System.out.println("Хз откуда они это взяли, нигде не нашла, чтобы так писали и среда на 21 java не принимает это (ошибка)");
//        switch(value) {
//            case String s && (s.length < 3) -> System.out.println("Строка слишком короткая");
//            case String s && (s.length < 10) -> System.out.println("Нормальная строка");
//                default -> System.out.println("Слишком длинная строка");
//        }
    }

}
