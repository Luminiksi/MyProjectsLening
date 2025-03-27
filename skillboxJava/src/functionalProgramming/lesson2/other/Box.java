package functionalProgramming.lesson2.other;

public class Box<T extends Garbage> {
    private T item;

    public double getItemWeight() {
        return item == null ? 0 : item.getWeight();
    }
}
