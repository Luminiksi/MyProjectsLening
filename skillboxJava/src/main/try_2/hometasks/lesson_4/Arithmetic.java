package main.try_2.hometasks.lesson_4;

public class Arithmetic {
    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int composition() {
        return a * b;
    }

    public int max() {
        return a > b ? a : b;
    }

    public int min() {
        return a < b ? a : b;
    }
}
