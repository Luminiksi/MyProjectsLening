package practice;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        if (radius < 0) {
            return -1;
        }
        return ((double) 3 / 4) * Math.PI * Math.pow(radius, 3);
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a == 0 || b == 0 || c == 0) {
            return false;
        }
        if (a + b < c) {
            return false;
        }
        if (b + c < a) {
            return false;
        }
        if (a + c < b) {
            return false;
        }
        return true;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (!isTrianglePossible(a, b, c)) {
            return -1;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
