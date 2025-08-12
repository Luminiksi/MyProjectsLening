package main.try_1.hometasks.lesson5;

public class Country {
    private String name;
    private int populationCount;
    private double area;
    private String capital;
    private boolean accessSea;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulationCount() {
        return populationCount;
    }

    public void setPopulationCount(int populationCount) {
        this.populationCount = populationCount;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isAccessSea() {
        return accessSea;
    }

    public void setAccessSea(boolean accessSea) {
        this.accessSea = accessSea;
    }
}
