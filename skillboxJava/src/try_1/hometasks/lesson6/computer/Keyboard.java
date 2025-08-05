package try_1.hometasks.lesson6.computer;

public class Keyboard {
    private final KeyboardType type;
    private final boolean backlight;
    private final double weight;

    public Keyboard(KeyboardType type, boolean backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Клавиатура:\n");
        string.append("     тип: " + type + "\n");
        string.append("     наличие подсветки:  " + (backlight ? "да" : "нет") + "\n");
        string.append("     вес:  " + weight + "\n");
        return string.toString();
    }
}
