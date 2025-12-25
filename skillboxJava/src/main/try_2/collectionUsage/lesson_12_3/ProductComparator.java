package main.try_2.collectionUsage.lesson_12_3;

import java.util.Comparator;

public class ProductComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
