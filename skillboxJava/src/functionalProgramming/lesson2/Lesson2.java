package functionalProgramming.lesson2;

import myFeatures.Printer;

import java.util.ArrayList;
import java.util.List;

import static myFeatures.Colors.ANSI_PURPLE;
import static myFeatures.Colors.ANSI_RESET;

public class Lesson2 {
    public static void run() throws InterruptedException {
        Printer.printLessonNumber(2, 16);
        Printer.printTaskName("Дженерики");
        Printer.printTaskNumber(1);
        try {
            task1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(100);
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        System.out.println();
        printInfo();
    }

    public static void task1() {
        List list = new ArrayList();
        list.add(1);
        list.add(new StringBuilder());
        print(list);
    }

    public static void task2() {
        List<String> list = new ArrayList();
//        Данный код уже не будет компилироваться
        /*list.add(1);
        list.add(new StringBuilder());*/
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        print2(list);
    }

    public static void print(List list) {
        for (int i = 0; i < list.size(); i++) {
            String item = (String) list.get(i);
            System.out.println(item);
        }
    }

    public static void print2(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }
    }

    public static void task3() {
        Box<functionalProgramming.lesson2.other.Paper> boxForPaper = new Box<>();
        Box<Plastic> boxForPlastic = new Box<>();
        Box<Glass> boxForGlass = new Box<>();

        TwoCellsBox<Plastic, Glass> plasticGlassBox = new TwoCellsBox<>();

        Box box = new Box();
    }

    public static void printInfo() {
        System.out.println(ANSI_PURPLE + "Информация из урока!!!!");
        System.out.println("________________________________________________________");
        System.out.println("\tРекомендации Oracle по названию параметров типов");
        System.out.println("________________________________________________________" + ANSI_RESET);
        System.out.println("\tНаименование\t|\t\t\t\tОписание");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tE - element\t\t|\tДля элементов параметризованных коллекций");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tK - key\t\t\t|\tДля ключей map-структур");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tV - value\t\t|\tДля значений map-структур");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tN - number\t\t|\tДля чисел");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tT - tye\t\t\t|\tДля обозначения типа параметра в произвольных классах");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tS, U, V\t\t\t|\tПрименяются, коглда в дженерик-классе несколько параметров");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t?\t\t\t\t|\tМожет быть все что угодно, кроме примитивов и массивов");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println(ANSI_PURPLE + "________________________________________________________" + ANSI_RESET);
    }
}
