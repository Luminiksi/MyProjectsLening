package lesson_2;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class TasksPart1 {
    public static final String LESSON_PROP = "lesson_2/lesson_1.properties";

    public static void main(String[] args) throws IOException {
        /*System.out.println("Task 1:");
        task1();
        System.out.println();
        System.out.println("Task 2:");
        task2();
        System.out.println();
        System.out.println("Task 3:");
        task3();
        System.out.println();
        System.out.println("Task 4:");
        task4();
        System.out.println();
        System.out.println("Task 5:");
        task5();
        System.out.println();
        System.out.println("Task 6:");
        task6();*/
        /*task6();*/


        Properties properties = new Properties();
        System.out.println(properties.getClass());
        properties.load(new FileReader(LESSON_PROP));
        String name = properties.getProperty("name");
        System.out.println(name);
    }

    /**
     * Name: Гипотенуза
     * Task: Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.
     * Input: В двух строках вводятся два числа (числа целые, положительные, не превышают 1000).
     * Output: Выведите ответ на задачу в виде целого числа
     */
    public static void task1() {
//        c = √(a² + b²)
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 0 && a <= 1000 && b <= 1000 && b > 0) {
            int result = (int) Math.sqrt(a * a + b * b);
            System.out.println(result);
        }
    }

    /**
     * Name: Следующее и предыдущее
     * Task: Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере. Пробелы, знаки препинания, заглавные и строчные буквы важны
     * Input: Вводится целое число, по модулю не превосходящее 10000.
     * Output: Выведите сначала фразу "The next number for the number ", затем введенное число, затем слово " is ", окруженное пробелами, затем формулу для следующего за введенным числа, наконец, знак точки без пробела. Аналогично в следующей строке для предыдущего числа.
     */
    public  static void task2() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (Math.abs(number) <= 10000) {
            System.out.println("The next number for the number " + number + " is " + (number + 1) + ".");
            System.out.println("The previous number for the number " + number + " is " + (number - 1) + ".");
        }
    }

    /**
     * Name: Дележ яблок - 1
     * Task: N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок достанется каждому школьнику?
     * Input: Программа получает на вход числа N и K.
     * Output: Программа должна вывести искомое количество яблок.
     */
    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = k / n;
        System.out.println(result);
    }

    /**
     * Name: Дележ яблок - 2
     * Task: N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок останется в корзинке?
     * Input: Программа получает на вход числа N и K.
     * Output: Программа должна вывести искомое количество яблок.
     */
    public static void task4(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = k % n;
        System.out.println(result);
    }

    /**
     * Name: МКАД
     * Task: Длина Московской кольцевой автомобильной дороги — 109 километров. Байкер Вася стартует с нулевого километра МКАД и едет со скоростью v километров в час. На какой отметке он остановится через t часов?
     * Input: Программа получает на вход значения v и t. Если v>0, то Вася движется в положительном направлении по МКАД, если же значение v<0, то в отрицательном.
     * Output: Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.
     */
    public static void task5(){
        int length = 109;
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();

        int result = v * t % length;
        if (result < 0) {
            result = length + result;
        }
        System.out.println(result);
    }

    /**
     * Name: Последняя цифра
     * Task: Дано натуральное число. Выведите его последнюю цифру.
     * Input: Вводится натуральное число.
     * Output: Выведите ответ на задачу.
     */
    public static void task6(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = number % 10;
        System.out.println(result);
    }
}
