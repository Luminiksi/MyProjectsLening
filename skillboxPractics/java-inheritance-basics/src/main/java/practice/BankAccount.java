package practice;

public class BankAccount {
    protected double score;

    public double getAmount() {
        //TODO: реализуйте метод и удалите todo
        // верните значение количества денег не счету
        return score;
    }

    public void put(double amountToPut) {
        //TODO: реализуйте метод и удалите todo
        // метод зачисляет деньги на счет
        if (amountToPut < 0) {
            return;
        }
        score += amountToPut;
    }

    public void take(double amountToTake) {
        //TODO: реализуйте метод и удалите todo
        // метод списывает деньги со счета
        if (amountToTake < 0 || amountToTake > score) {
            return;
        }
        score -= amountToTake;
    }
}
