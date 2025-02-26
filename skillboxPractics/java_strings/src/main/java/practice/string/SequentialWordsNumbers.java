package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text){
        if (text.isBlank()) {
            return "";
        }
        int index = 1;
        int start = 0;
        StringBuilder newText = new StringBuilder();
        while (true) {
            int end = text.indexOf("\s", start);
            if(end < 0) {
                newText.append("(" + index + ")" + " " + text.substring(start));
                break;
            }
            newText.append("(" + index + ")" + " " + text.substring(start, end) + " ");
            start = ++end;
            index++;
        }
        return newText.toString();
    }
}
