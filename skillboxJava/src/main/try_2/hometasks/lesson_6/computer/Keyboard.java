package main.try_2.hometasks.lesson_6.computer;

import main.try_2.hometasks.lesson_6.computer.types.KeyboardTypes;

public class Keyboard {
    private final KeyboardTypes type;
    private final boolean isBacklight;
    private final int weight;

    public Keyboard(KeyboardTypes type, boolean isBacklight, int weight) {
        this.type = type;
        this.isBacklight = isBacklight;
        this.weight = weight;
    }

    public KeyboardTypes getType() {
        return type;
    }

    public boolean isBacklight() {
        return isBacklight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Клавиатура: " + "\n" +
                "   - тип: " + type + "\n" +
                "   - подсветка: " + (isBacklight ? "да" : "нет") + "\n" +
                "   - вес: " + weight + "\n";
    }
}
