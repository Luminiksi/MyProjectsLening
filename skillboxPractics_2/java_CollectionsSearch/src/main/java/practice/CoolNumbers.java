package practice;

import java.util.*;

public class CoolNumbers {

    private static final Character[] NUMBERS_CHARS = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
    private static final Random RANDOM = new Random();

    public static final String FIND_NUMBER = "A111BC197";
    public static final String NOT_FIND_NUMBER = "У777HC66";

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
        for (String item : list) {
            if (item.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        int index = sortedList.indexOf(number);
        return index >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

    private static String generateNumber() {
        StringBuilder number = new StringBuilder();
        number.append(generateChar());
        int num = generateNumber(10, 0);
        number.append(num);
        number.append(num);
        number.append(num);
        number.append(generateChar());
        number.append(generateChar());
        int region = generateNumber(197, 1);
        number.append(region < 10 ? "0" + region : region);
        return number.toString();
    }

    private static int generateNumber(int index, int start) {
        return RANDOM.nextInt(index) + start;
    }

    private static char generateChar() {
        int index = generateNumber(NUMBERS_CHARS.length, 0);
        return NUMBERS_CHARS[index];
    }

    public static void initSearch(List<String> numbers) {
        if (numbers.contains(NOT_FIND_NUMBER)) {
            numbers.remove(NOT_FIND_NUMBER);
        }
        if (!numbers.contains(FIND_NUMBER)) {
            numbers.add(FIND_NUMBER);
        }

        Collections.shuffle(numbers);
    }

}
