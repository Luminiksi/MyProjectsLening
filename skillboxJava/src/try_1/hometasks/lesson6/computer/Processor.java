package try_1.hometasks.lesson6.computer;

public class Processor {
    private final double frequency;
    private final int cores;
    private final String manufacturer;
    private final double weight;

    public Processor(double frequency, int cores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Процессор:\n");
        string.append("     частота: " + frequency + "\n");
        string.append("     количество ядер:  " + cores + "\n");
        string.append("     производитель:  " + manufacturer + "\n");
        string.append("     вес:  " + weight + "\n");
        return string.toString();
    }
}
