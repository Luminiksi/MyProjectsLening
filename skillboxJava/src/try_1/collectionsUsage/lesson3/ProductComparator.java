package try_1.collectionsUsage.lesson3;

import java.util.Comparator;

public class ProductComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
