package try_1.javadoc;

/**
 * Calculate simple operations
 * @author me
 */
public class Calculator {

    /**
     * Total of count operations, that this Calculator can perform
     */
    public static final int OPERATION_COUNT = 4;

    /**
     * Performs division one number by another
     * @param a First value
     * @param b Second value
     * @return Division result
     * @throws ArithmeticException if an attempt is mode to divide by zero
     */
    public double divide(double a, double b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Division by zero is impossible");
        }

        return a / b;
    }
}
