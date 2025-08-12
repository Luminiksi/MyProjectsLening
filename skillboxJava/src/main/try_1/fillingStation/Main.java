package main.try_1.fillingStation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");
        String fuelPriceMessage;

        int fuelType = 95;
        var amount = 420;
        boolean hasDiscount = true;

        var fuel92price = 60.2;
        double fuel95price = 67.33;

        double discount = 0.1;

        String wrongFuelTypeMessage = "Указан неверный тип топлива";

        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92price;
        } else if(fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println(wrongFuelTypeMessage);
            amount = 0;
        }

        if (hasDiscount) {
            fuelPrice = (10 - discount) * fuelPrice;
        }

        if (amount < 1) {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }

        fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб";
        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб");
    }
}
