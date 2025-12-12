package main.try_2.arraysAndList;

public class Figure {
    private final FigureColor color;
    private final FigureType type;

    public Figure(FigureType type, FigureColor color) {
        this.color = color;
        this.type = type;
    }

    public FigureColor getColor() {
        return color;
    }

    public FigureType getType() {
        return type;
    }

    @Override
    public String toString() {
        // Цвет и фигура, по первым буквам параметров
        return color.toString().substring(0, 1) + type.toString().substring(0, 1);
    }
}
