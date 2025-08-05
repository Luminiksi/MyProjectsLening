package try_1.hometasks.practics.part6;

public class ArithmeticCalculator {
    private int a;
    private int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate(Operation operation) {
        int result = switch (operation) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            default -> a * b;
        };
        return result;
    }
}
