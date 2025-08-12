package main.try_1.hometasks.lesson4;

public class Arithmetic {
    private int numberOne;
    private int numberTwo;

    public Arithmetic(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int summ() {
        return numberOne + numberTwo;
    }

    public int composition() {
        return numberOne * numberTwo;
    }

    public int max() {
        return numberOne > numberTwo ? numberOne : numberTwo;
    }

    public int min() {
        return numberOne < numberTwo ? numberOne : numberTwo;
    }
}
