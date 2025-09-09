package main.try_2.methods;

public class MyPrinter {
    private String queue = "";
    private int pagesInQueue = 0;
    private int pagesPrinted = 0;

    public void append(String text) {
        append(text, "Документ без имени", 1);
    }

    public void append(String text, String documentName, int pages) {
        queue = queue + "\n" + documentName + " - " + text;
        pagesInQueue = pagesInQueue + pages;
    }

    public void append(String text, int pages) {
        append(text, "Документ без имени", pages);
    }

    public void append(String text, String documentName) {
        append(text, documentName, 1);
    }

    public void clear() {
        queue = "";
        pagesInQueue = 0;
    }

    public void print() {
        System.out.println(queue);
        pagesPrinted += pagesInQueue;
        clear();
    }

    public int getPendingPagesCount() {
        return pagesInQueue;
    }

    public int getPrintedPagesCount() {
        return pagesPrinted;
    }
}
