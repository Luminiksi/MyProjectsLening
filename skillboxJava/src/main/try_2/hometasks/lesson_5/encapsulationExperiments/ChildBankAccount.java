package main.try_2.hometasks.lesson_5.encapsulationExperiments;

public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount(int maxBalance) {
        this.maxBalance = maxBalance;
        balance = 0;
    }

    public boolean depositMoney(double value) {
        if (value < 0) {
            return false;
        }
        double newBalance = balance + value;
        if (newBalance > maxBalance) {
            return false;
        }
        balance = newBalance;
        return true;
    }

    public boolean debitMoney(double value) {
        if (value < 0) {
            return false;
        }
        double newBalance = balance - value;
        if (newBalance < 0) {
            return false;
        }
        balance = newBalance;
        return true;
    }

    public double getBalance() {
        return balance;
    }


}
