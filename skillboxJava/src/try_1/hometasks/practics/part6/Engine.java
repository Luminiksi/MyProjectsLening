package try_1.hometasks.practics.part6;

public class Engine {
    private final EngineType engineType;
    private final double Volume;
    private final int power;

    public Engine(EngineType engineType, double volume, int power) {
        this.engineType = engineType;
        Volume = volume;
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getVolume() {
        return Volume;
    }

    public int getPower() {
        return power;
    }

    public void printInfo() {
        System.out.println("Тип двигателя: " + engineType);
        System.out.println("Объём двигателя: " + Volume);
        System.out.println("Мощность двигателя: " + power);
    }
}
