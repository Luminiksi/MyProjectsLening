package main.try_2.hometasks.lesson_6;

public class Car {
    private final Engine engine;
    private CarType type;
    private int weight;

    public Car(Engine engine, CarType type, int weight) {
        this.engine = engine;
        this.type = type;
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Тип автомобиля: " + type + "\n" +
                "Масса автомобиля: " + weight + "\n" +
                engine;
    }
}
