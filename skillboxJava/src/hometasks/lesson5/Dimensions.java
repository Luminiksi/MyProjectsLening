package hometasks.lesson5;

public class Dimensions {
    private final double width;
    private final double height;
    private final double length;

    public Dimensions(double width, double высота, double length) {
        this.width = width;
        this.height = высота;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public String toString() {
        return "ширина: " + width + " | высота: " + height + " | длина: " + length;
    }
}
