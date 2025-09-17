package main.try_2.hometasks.Lesson_5.encapsulationExperiments;

public class Country {
    private String name;
    private int population;
    private double square;
    private String capital;
    private boolean hasSea;

    public Country(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setHasSea(boolean hasSea) {
        this.hasSea = hasSea;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getSquare() {
        return square;
    }

    public String getCapital() {
        return capital;
    }

    public boolean hasSea() {
        return hasSea;
    }
}
