package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {
        LocalDate whenTake = lastIncome.plusMonths(1);
        if (whenTake.isAfter(LocalDate.now())) {
            return;
        }
        super.take(amountToTake);
    }
}
