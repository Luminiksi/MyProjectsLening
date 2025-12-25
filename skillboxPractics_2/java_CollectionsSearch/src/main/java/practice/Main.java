package practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<String> numbers = CoolNumbers.generateCoolNumbers();
        long endTime = System.currentTimeMillis();
        System.out.println("Генерация списка занимала:");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        System.out.println();

        CoolNumbers.initSearch(numbers);

        checkForceSearch(numbers);
        System.out.println();
        checkBinarySearch(numbers);
        System.out.println();
        checkSearchInHashSeth(numbers);
        System.out.println();
        checkSearchInTreeSet(numbers);
    }

    public static void checkForceSearch(List<String> numbers) {
        Collections.sort(numbers);

        long startTime = System.currentTimeMillis();
        boolean result = CoolNumbers.bruteForceSearchInList(numbers, CoolNumbers.FIND_NUMBER);
        long endTime = System.currentTimeMillis();
        printResult("Прямым перебором по ArrayList", result, endTime - startTime);

        startTime = System.currentTimeMillis();
        result = CoolNumbers.bruteForceSearchInList(numbers, CoolNumbers.NOT_FIND_NUMBER);
        endTime = System.currentTimeMillis();
        printResult("Прямым перебором по ArrayList", result, endTime - startTime);
    }

    public static void checkBinarySearch(List<String> numbers) {
        Collections.sort(numbers);

        long startTime = System.currentTimeMillis();
        boolean result = CoolNumbers.binarySearchInList(numbers, CoolNumbers.FIND_NUMBER);
        long endTime = System.currentTimeMillis();
        printResult("Бинарным поиском по сортированному ArrayList", result, endTime - startTime);

        startTime = System.currentTimeMillis();
        result = CoolNumbers.binarySearchInList(numbers, CoolNumbers.NOT_FIND_NUMBER);
        endTime = System.currentTimeMillis();
        printResult("Бинарным поиском по сортированному ArrayList", result, endTime - startTime);
    }

    public static void checkSearchInHashSeth(List<String> numbers) {
        Collections.shuffle(numbers);
        HashSet<String> newNumbers = new HashSet<>(numbers);

        long startTime = System.currentTimeMillis();
        boolean result = CoolNumbers.searchInHashSet(newNumbers, CoolNumbers.FIND_NUMBER);
        long endTime = System.currentTimeMillis();
        printResult("Поиском в HashSet", result, endTime - startTime);

        startTime = System.currentTimeMillis();
        result = CoolNumbers.searchInHashSet(newNumbers, CoolNumbers.NOT_FIND_NUMBER);
        endTime = System.currentTimeMillis();
        printResult("Поиском в HashSet", result, endTime - startTime);
    }

    public static void checkSearchInTreeSet(List<String> numbers) {
        TreeSet<String> newNumbers = new TreeSet<>(numbers);

        long startTime = System.currentTimeMillis();
        boolean result = CoolNumbers.searchInTreeSet(newNumbers, CoolNumbers.FIND_NUMBER);
        long endTime = System.currentTimeMillis();
        printResult("Поиском в TreeSet", result, endTime - startTime);

        startTime = System.currentTimeMillis();
        result = CoolNumbers.searchInTreeSet(newNumbers, CoolNumbers.NOT_FIND_NUMBER);
        endTime = System.currentTimeMillis();
        printResult("Поиском в TreeSet", result, endTime - startTime);
    }

    public static void printResult(String searchName, boolean result, long time) {
        System.out.println(searchName + ": номер " + (result ? "найден" : "не найден")
                + ", поиск занял " + time + "нс");
    }
}
