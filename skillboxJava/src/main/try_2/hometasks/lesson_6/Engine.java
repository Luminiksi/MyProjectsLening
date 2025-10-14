package main.try_2.hometasks.lesson_6;

public class Engine {
    private EngineType engineType;
    private double volume;
    private int power;

    public Engine(EngineType engineType, double volume, int power) {
        this.engineType = engineType;
        this.volume = volume;
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Тип двигателя: " + engineType + "\n" +
                "Объём двигателя: " + volume + "\n" +
                "Мощность двигателя: " + power;
    }
}
