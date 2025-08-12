package main.try_1.hometasks.practics.part6;

public class Car {
    private final Engine engine;
    private final CarType carType;
    private final int weight;

    public Car(Engine engine, CarType carType, int weight) {
        this.engine = engine;
        this.carType = carType;
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getWeight() {
        return weight;
    }

    public void printInfo() {
        System.out.println("Тип автомобиля: " + carType);
        System.out.println("Масса автомобиля: " + weight);
        engine.printInfo();
    }
}
