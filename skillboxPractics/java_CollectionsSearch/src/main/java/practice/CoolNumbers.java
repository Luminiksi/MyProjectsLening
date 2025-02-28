package practice;

import java.security.PublicKey;
import java.util.*;

public class CoolNumbers {
    private static final char[] LETTER = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
    public static final String FIND_NUMBER = "A111BC197";
    public static final String NOT_FIND_NUMBER = "У777HC66";

    public static final String BRUTE_FORCE = "Поиск перебором";
    public static final String BINARY = "Бинарный поиск";
    public static final String SEARCH_IN_HASH_SET = "Поиск в HashSet";
    public static final String SEARCH_IN_TREE_SET = "Поиск в TreeSet";

    public static List<String> generateCoolNumbers() {
//        Если использовать ArrayList для генерации и проверки - то это ужас как долго
        HashSet<String> numbers = new HashSet<>();
        while (numbers.size() < 2_000_000) {
            numbers.add(generateNumber());
        }
        ArrayList<String> result = new ArrayList<>();
        result.addAll(numbers);
        return result;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        if (number.isBlank()) {
            return false;
        }
        for (String item : list) {
            if (item.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        if (number.isBlank()) {
            return false;
        }
        int index = Collections.binarySearch(sortedList, number);
        return index >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        if (number.isBlank()) {
            return false;
        }
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        if (number.isBlank()) {
            return false;
        }
        return treeSet.contains(number);
    }

    private static String generateNumber() {
        StringBuilder number = new StringBuilder();
        number.append(generateLetter());
        number.append(generateNum(9, false));
        number.append(generateNum(9, false));
        number.append(generateNum(9, false));
        number.append(generateLetter());
        number.append(generateLetter());
        String region = String.valueOf(generateNum(199, true));
        number.append(region.length() == 1 ? "0" + region : region);
        return number.toString();
    }

    private static int generateNum(int max, boolean notZero) {
        if (notZero) {
            return (int) (Math.random() * (max - 1)) + 1;
        }
        return (int) (Math.random() * max);
    }

    private static char generateLetter() {
        int index = (int) (Math.random() * LETTER.length);
        return LETTER[index];
    }

    public static void initSearch(List<String> numbers) {
        if (!numbers.contains(FIND_NUMBER)) {
            numbers.add(FIND_NUMBER);
        }
        if (numbers.contains(NOT_FIND_NUMBER)) {
            numbers.remove(NOT_FIND_NUMBER);
        }
    }

}
