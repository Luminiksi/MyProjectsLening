package practice.regex;

public class SplitText {
    private static final String REGEX = "[^a-zA-Z]";

    public static void main(String[] args) {

    }

    public static String splitTextIntoWords(String text) {
        //TODO реализуйте метод
        String[] words = text.split("\\s+");
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].replaceAll(REGEX, "");
            if (word.isBlank()) {
                continue;
            }
            if ((i + 1) == words.length) {
                newText.append(word);
            } else {
                newText.append(word + "\n");
            }
        }
        return newText.toString();
    }
}