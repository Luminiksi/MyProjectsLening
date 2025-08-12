package main.try_1.functionalProgramming.lesson2;

public class Box<T> {
    private T item;

    public void putItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
