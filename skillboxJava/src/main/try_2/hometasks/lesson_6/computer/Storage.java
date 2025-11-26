package main.try_2.hometasks.lesson_6.computer;

import main.try_2.hometasks.lesson_6.computer.types.StorageTypes;

public class Storage {
    private final StorageTypes type;
    private final int capacity;
    private final int weight;

    public Storage(StorageTypes type, int capacity, int weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public StorageTypes getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Накопитель информации(диск): " + "\n" +
                "   - тип: " + type + "\n" +
                "   - объем памяти: " + capacity + "\n" +
                "   - вес: " + weight + "\n";
    }
}
