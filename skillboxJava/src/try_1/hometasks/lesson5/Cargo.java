package try_1.hometasks.lesson5;

public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean isFlip;
    private final String reNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double weight, String address, boolean isFlip, String reNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.isFlip = isFlip;
        this.reNumber = reNumber;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isFlip() {
        return isFlip;
    }

    public String getReNumber() {
        return reNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, isFlip, reNumber, isFragile);
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, address, isFlip, reNumber, isFragile);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, address, isFlip, reNumber, isFragile);
    }

    public void printInfo() {
        System.out.println("габариты - " + dimensions.toString());
        System.out.println("масса: " + weight);
        System.out.println("адрес доставки: " + address);
        System.out.println("можно ли переворачивать: " + (isFlip ? "да" : "нет"));
        System.out.println("регистрационный номер: " + reNumber);
        System.out.println("является ли груз хрупким: " + (isFlip ? "да" : "нет"));
    }
}
