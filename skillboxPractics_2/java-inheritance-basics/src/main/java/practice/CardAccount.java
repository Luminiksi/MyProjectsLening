package practice;

public class CardAccount extends BankAccount {
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);

    private static final double percent = 0.01;

    @Override
    public void take(double amountToTake) {
        amountToTake += amountToTake * percent;
        super.take(amountToTake);
    }
}
