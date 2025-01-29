package hometasks.practics.part4;

public class Methods6 {
    public static void main(String[] args) {
        int maxNumber = max(300, 10);
        System.out.println(maxNumber);
    }
    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
}
