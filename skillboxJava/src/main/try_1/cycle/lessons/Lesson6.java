package main.try_1.cycle.lessons;

import main.try_1.myFeatures.Printer;

public class Lesson6 {
    public static void run() {
        Printer.printLessonNumber(5, 3);
        Printer.printLessonName("Оператор switch в Java 17");
        Printer.printTaskNumber(1);
        Printer.printTaskName("Замена условий на оператор switch");
        System.out.println();
        Printer.printTaskNumber(2);
//        task2();
        System.out.println();
        Printer.printTaskNumber(3);
//        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Интересные возможности switch");
        Printer.printDescription("Обычный switch выбросит исключение NullPointerException, \n" +
                "если переданное значение равно null. Это поведение справедливо и для текущего оператора, \n" +
                "но, если мы захотим использовать проверку на типы, это можно обойти:");
        task4(null);
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printDescription("Иногда требуются дополнительные возможности в проверке типов. Например, проверить длину строки:");
        task5("Тестовая строка");
        System.out.println();

    }

    static String formatString(Object o) {
        String result = "";
        if (o instanceof Integer) {
            result = String.format("int %d", (Integer)o);
        } else if (o instanceof Long) {
            result = String.format("long %d", (Long)o);
        } else if (o instanceof Double) {
            result = String.format("double %f", (Double)o);
        } else if (o instanceof String) {
            result = String.format("String %s", o);
        }
        return result;
    }

    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default        -> o.toString();
        };
    }

    public static void task2(Object o) {
        //Switch Expression example
        switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
//           Без этой строки - ошибка компиляции
            default -> throw new IllegalStateException("Unexpected value: " + o);
        }
        //Switch Statement example
        switch (o) {
            case Integer i:
                String.format("int %d", i);
                break;
            case Long l:
                String.format("long %d", l);
                break;
//           Без этой строки - ошибка компиляции
            default:
                throw new IllegalStateException("Unexpected value: " + o);
        }
    }

    public static void task3(String value) {
        // Предыдущая версия
        switch (value) {
            case "A":
                callMethod1();
                break;
            case "B":
                callMethod2();
                break;
            default:
                callMethod3();
        }
        // Новая версия
        switch (value) {
            case "A"-> callMethod1();
            case "B"-> callMethod2();
            default -> callMethod3();
        }
    }

    public static void callMethod1(){
        System.out.println("Method 1");
    }

    public static void callMethod2(){
        System.out.println("Method 2");
    }

    public static void callMethod3(){
        System.out.println("Method 3");
    }

    public static void task4(Object o) {
        switch (o) {
            case null     -> System.out.println("null!");
            case String s -> System.out.println("String");
            default       -> System.out.println("Something else");
        }
    }

    public static void task5(String value) {
//        TODO: проверить ка кэто должно работать и есть ли оно в других версиях(кроме как на 17ой)
        /*дополнительное условие должно рабоатть на 17+, но у меня на 21ой почему-то не пашет, надо будет почитать*/
/*        switch(value) {
            case String s && (s.length < 3) -> System.out.println("Строка слишком короткая");
            case String s && (s.length < 10) -> System.out.println("Нормальная строка");
                default -> System.out.println("Слишком длинная строка");
        }*/

    }

    private static record length() {
    }
}
