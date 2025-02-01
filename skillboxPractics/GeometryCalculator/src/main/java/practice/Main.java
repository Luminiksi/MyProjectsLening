package practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь круга");
        System.out.println("15 - " + GeometryCalculator.getCircleSquare(15));
        System.out.println("-5 - " + GeometryCalculator.getCircleSquare(-5));
        System.out.println();
        System.out.println("Площадь треугольника");
        System.out.println("5, 5, 5 - " + GeometryCalculator.getTriangleSquare(5, 5, 5));
        System.out.println("6, 7, 15 - " + GeometryCalculator.getTriangleSquare(6, 7, 15));
        System.out.println();
        System.out.println("Объём шара");
        System.out.println("5 - " + GeometryCalculator.getSphereVolume(5));
        System.out.println("-1 - " + GeometryCalculator.getSphereVolume(-1));
        System.out.println();
        System.out.println("Является ли треугольником");
        System.out.println("2, 3, 4 - " + GeometryCalculator.isTrianglePossible(2, 3, 4));
        System.out.println("2, 3, 6 - " + GeometryCalculator.isTrianglePossible(2, 3, 6));
    }
}
