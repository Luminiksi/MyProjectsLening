package hometasks.lesson5;

public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount(double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney(double value) {
        if (value < 0) {
            return false;
        }
        if (balance + value > maxBalance) {
            return false;
        }
        balance += value;
        return true;
    }

    public boolean debitMoney(double value) {
        if (value < 0) {
            return false;
        }
        if (balance - value < 0) {
            return false;
        }
        balance -= value;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}
