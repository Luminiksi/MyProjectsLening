package main.try_1.hometasks.lesson6.computer;

public class Storage {
    private final StorageType type;
    private final int memory;
    private final double weight;

    public Storage(StorageType type, int memory, double weight) {
        this.type = type;
        this.memory = memory;
        this.weight = weight;
    }

    public StorageType getType() {
        return type;
    }

    public int getMemory() {
        return memory;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Накопитель информации:\n");
        string.append("     тип: " + type + "\n");
        string.append("     объём памяти:  " + memory + "\n");
        string.append("     вес:  " + weight + "\n");
        return string.toString();
    }
}
