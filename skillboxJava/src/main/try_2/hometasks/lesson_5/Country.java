package main.try_2.hometasks.lesson_5;

public class Country {
    private String name;
    private int population;
    private double square;
    private String country;
    private boolean hasSea;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isHasSea() {
        return hasSea;
    }

    public void setHasSea(boolean hasSea) {
        this.hasSea = hasSea;
    }
}
