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
        if (LocalDate.now().isBefore(lastIncome.plusMonths(1))) {
            return;
        }
        super.take(amountToTake);
    }
}
