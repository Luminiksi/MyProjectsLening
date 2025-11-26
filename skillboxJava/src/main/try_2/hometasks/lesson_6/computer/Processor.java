package main.try_2.hometasks.lesson_6.computer;

public class Processor {
    private final int frequency;
    private final int cores;
    private final String vendor;
    private final int weight;

    public Processor(int frequency, int cores, String made, int weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.vendor = made;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getVendor() {
        return vendor;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Оперативная память: " + "\n" +
                "   - частота: " + frequency + "\n" +
                "   - количество ядер: " + cores + "\n" +
                "   - производитель: " + vendor + "\n" +
                "   - вес: " + weight + "\n";
    }
}
