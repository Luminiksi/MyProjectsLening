package practice.reverseArray;

import java.util.Arrays;

public class Main {

    // используя данный метод, вы можете использовать ваши методы, и проверить их работу на разных
    // значений для проверки и отладки
    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        System.out.println("Начальная фраза: " + line);
        System.out.println("Получаем фразу: " + Arrays.toString(ReverseArray.reverse(line.split("\s"))));
    }
}
