package main.try_2.hometasks.lesson_6.computer;

import main.try_2.hometasks.lesson_6.computer.types.MemoryTypes;

public class Memory {
    private final MemoryTypes type;
    private final int capacity;
    private final int weight;

    public Memory(MemoryTypes type, int capacity, int weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public MemoryTypes getType() {
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
        return "Оперативная память: " + "\n" +
                "   - тип: " + type + "\n" +
                "   - объем памяти: " + capacity + "\n" +
                "   - вес: " + weight + "\n";
    }
}
