package hometasks.practics.part4;

public class Printer {
    private String queue = "";
    private int pagesInQueue;
    private int pagePrinted;

    public void append(String name, String text, int pagesCount) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }

    public void append(String name, String text) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + 1;
    }

    public void append(String text) {
        queue = queue + "\n" +  text;
        pagesInQueue = pagesInQueue + 1;
    }

    public void append(String text, int pagesCount) {
        queue = queue + "\n" + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }

    public void clear() {
        queue = "";
        pagesInQueue = 0;
    }

    public void print() {
        System.out.println(queue);
        pagePrinted += pagesInQueue;
        clear();
    }

    public int getPendingPagesCount() {
        return pagesInQueue;
    }

    public int getPrintedPagesCount() {
        return pagePrinted;
    }
}
