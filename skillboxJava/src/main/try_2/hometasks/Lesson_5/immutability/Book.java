package main.try_2.hometasks.Lesson_5.immutability;

public class Book {
    private final String name;
    private final String author;
    private final int pagesCount;
    private final String isbn;

    public Book(String name, String author, int pagesCount, String isbn) {
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return "Book info: \nname: " + name + "\nauthor: " + author + "\npagesCount: " + pagesCount + "\nISBN: " + isbn;
    }
}
