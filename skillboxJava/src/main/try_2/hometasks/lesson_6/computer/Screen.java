package main.try_2.hometasks.lesson_6.computer;

import main.try_2.hometasks.lesson_6.computer.types.ScreenTypes;

public class Screen {
    private final int diagonal;
    private final ScreenTypes type;
    private final int weight;

    public Screen(int diagonal, ScreenTypes type, int width) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = width;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public ScreenTypes getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Экран : " + "\n" +
                "   - тип: " + type + "\n" +
                "   - диагональ: " + diagonal + "\n" +
                "   - вес: " + weight + "\n";
    }
}
