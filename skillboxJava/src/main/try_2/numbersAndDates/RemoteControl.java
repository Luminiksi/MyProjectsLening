package main.try_2.numbersAndDates;

public class RemoteControl {
    private final double START_TEMPERATURE = 32.0;

    private double temperature;

    public RemoteControl() {
        temperature = START_TEMPERATURE;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
