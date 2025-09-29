package main.try_2.hometasks.lesson_5.encapsulation;

import javax.swing.*;

public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean isFlip;
    private final String regNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double weight, String address, boolean isFlip, String regNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.isFlip = isFlip;
        this.regNumber = regNumber;
        this.isFragile = isFragile;
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, isFlip, regNumber, isFragile);
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, address, isFlip, regNumber, isFragile);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, address, isFlip, regNumber, isFragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isFlip() {
        return isFlip;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    @Override
    public String toString() {
        return "Информация по объекту: \n" +
            dimensions.toString() + "\n" +
            "Вес - " + weight + "\n" +
            "Адресс доставки: \"" + address + "\"\n" +
            "Можно переворачивать - " + (isFlip ? "да" : "нет") + "\n" +
            "Регистрационный номер: " + regNumber;
    }
}
