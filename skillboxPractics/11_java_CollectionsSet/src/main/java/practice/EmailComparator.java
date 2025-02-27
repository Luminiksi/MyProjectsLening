package practice;

import java.util.Comparator;

public class EmailComparator implements Comparator<String> {
    @Override
    public int compare(String email1, String email2) {
        return email1.toLowerCase().compareTo(email2.toLowerCase());
    }
}
