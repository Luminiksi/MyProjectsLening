package main.try_1.functionalProgramming.lesson2;

public class TwoCellsBox<T, S> {
    private T firstCellItem;
    private S secondCellItem;

    public T getFirstCellItem() {
        return firstCellItem;
    }

    public void putItemFirst(T firstCellItem) {
        this.firstCellItem = firstCellItem;
    }

    public S getSecondCellItem() {
        return secondCellItem;
    }

    public void putItemSecond(S secondCellItem) {
        this.secondCellItem = secondCellItem;
    }
}
