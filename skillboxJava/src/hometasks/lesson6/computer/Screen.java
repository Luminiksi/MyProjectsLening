package hometasks.lesson6.computer;

public class Screen {
    private final double diagonal;
    private final ScreenType type;
//    в килограммах, остальное все в граммах
    private final double weight;

    public Screen(double diagonal, ScreenType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public ScreenType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Экран:\n");
        string.append("     диагональ:  " + diagonal + "\n");
        string.append("     тип: " + type + "\n");
        string.append("     вес:  " + weight + "\n");
        return string.toString();
    }
}
