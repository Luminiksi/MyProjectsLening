package main.try_1.hometasks.lesson6.computer;

public class RAM {
    private final RAMType type;
    private final int volume;
    private final double weight;

    public RAM(RAMType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public RAMType getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Оперативная память:\n");
        string.append("     тип: " + type + "\n");
        string.append("     объём:  " + volume + "\n");
        string.append("     вес:  " + weight + "\n");
        return string.toString();
    }
}
