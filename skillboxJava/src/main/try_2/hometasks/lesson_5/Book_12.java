package main.try_2.hometasks.lesson_5;

public class Book_12 {
    private final String name;
    private final String author;
    private final int pages;
    private final String ISBN;

    public Book_12(String name, String author, int pages, String ISBN) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getISBN() {
        return ISBN;
    }
}
