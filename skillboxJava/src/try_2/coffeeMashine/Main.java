package try_2.coffeeMashine;

public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        if (coffeeAmount >= cappuchinoCoffeeRequired &&
            milkAmount >= cappuchinoMilkRequired) {
            System.out.println("Готовим капучино");
        } else {
            System.out.println("Ингредиентов не достаточно =((");
        }

        System.out.println("Добавим дополнительную переменную и проверим на условие || молоко:");

        int skimmedMilkAmount = 1290;

        if (skimmedMilkAmount >= cappuchinoMilkRequired ||
            milkAmount >= cappuchinoMilkRequired) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Молока не достаточно =(( ");
        }

        System.out.println("Добавим дополнительную переменную isBlocked и проверим на блокировку машины:");

        boolean isBlocked = false;

        if (!isBlocked) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Кофе-машина заблокирована");
        }

        System.out.println("Сложное условие:");

        if (!isBlocked && milkAmount >= cappuchinoMilkRequired &&
            coffeeAmount >= cappuchinoCoffeeRequired) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так...");
        }
    }
}
