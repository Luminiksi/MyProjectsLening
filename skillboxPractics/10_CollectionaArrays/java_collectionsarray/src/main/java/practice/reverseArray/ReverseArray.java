package practice.reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        for (int i = 0; i < strings.length / 2; i++) {
            int index = strings.length - 1 - i;
            String buf = strings[i];
            strings[i] = strings[index];
            strings[index] = buf;
        }
        return strings;
    }

}