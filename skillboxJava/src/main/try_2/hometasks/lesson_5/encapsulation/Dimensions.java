package main.try_2.hometasks.lesson_5.encapsulation;

public class Dimensions {
    private final double width;
    private final double height;
    private final double length;

    public Dimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
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

    @Override
    public String toString() {
        return "Габариты: " +
                "ширина - " + width + "; " +
                "высота - " + height + "; " +
                "длина - " + length + "; ";
    }
}
