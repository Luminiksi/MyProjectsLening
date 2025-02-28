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
        List<String> numbers = CoolNumbers.generateCoolNumbers();
        CoolNumbers.initSearch(numbers);
        checkBruteForce(numbers);
        checkBinary(numbers);
        checkHashSet(numbers);
        checkTreeSet(numbers);
    }

    public static void checkBruteForce(List<String> numbers) {
        long start = System.currentTimeMillis();
        boolean result = CoolNumbers.bruteForceSearchInList(numbers, CoolNumbers.FIND_NUMBER);
        long time = System.currentTimeMillis() - start;
        printResult(CoolNumbers.BRUTE_FORCE, result, time);

        start = System.currentTimeMillis();
        result = CoolNumbers.bruteForceSearchInList(numbers, CoolNumbers.NOT_FIND_NUMBER);
        time = System.currentTimeMillis() - start;
        printResult(CoolNumbers.BRUTE_FORCE, result, time);
        System.out.println();
    }

    public static void checkBinary(List<String> numbers) {
        Collections.sort(numbers);
        long start = System.currentTimeMillis();
        boolean result = CoolNumbers.binarySearchInList(numbers, CoolNumbers.FIND_NUMBER);
        long time = System.currentTimeMillis() - start;
        printResult(CoolNumbers.BINARY, result, time);

        start = System.currentTimeMillis();
        result = CoolNumbers.binarySearchInList(numbers, CoolNumbers.NOT_FIND_NUMBER);
        time = System.currentTimeMillis() - start;
        printResult(CoolNumbers.BINARY, result, time);
        System.out.println();
    }

    public static void checkHashSet(List<String> numbers) {
        HashSet<String> numbersSet = new HashSet<>(numbers);
        long start = System.currentTimeMillis();
        boolean result = CoolNumbers.searchInHashSet(numbersSet, CoolNumbers.FIND_NUMBER);
        long time = System.currentTimeMillis() - start;
        printResult(CoolNumbers.SEARCH_IN_HASH_SET, result, time);

        start = System.currentTimeMillis();
        result = CoolNumbers.searchInHashSet(numbersSet, CoolNumbers.NOT_FIND_NUMBER);
        time = System.currentTimeMillis() - start;
        printResult(CoolNumbers.SEARCH_IN_HASH_SET, result, time);
        System.out.println();
    }

    public static void checkTreeSet(List<String> numbers) {
        TreeSet<String> numbersSet = new TreeSet<>(numbers);
        long start = System.currentTimeMillis();
        boolean result = CoolNumbers.searchInTreeSet(numbersSet, CoolNumbers.FIND_NUMBER);
        long time = System.currentTimeMillis() - start;
        printResult(CoolNumbers.SEARCH_IN_TREE_SET, result, time);

        start = System.currentTimeMillis();
        result = CoolNumbers.searchInTreeSet(numbersSet, CoolNumbers.NOT_FIND_NUMBER);
        time = System.currentTimeMillis() - start;
        printResult(CoolNumbers.SEARCH_IN_TREE_SET, result, time);
        System.out.println();
    }

    public static void printResult(String searchName, boolean result, long time) {
        System.out.println(searchName + ": номер " + (result ? "найден" : "не найден")
                + ", поиск занял " + time + "нс");
    }
}
