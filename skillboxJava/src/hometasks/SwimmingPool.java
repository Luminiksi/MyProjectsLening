package hometasks;

public class SwimmingPool {
    public static void main(String[] args) {
        int volume = 1200;

        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int totalVolume = 0;
        int minutes = 0;
        while (totalVolume < volume) {
            totalVolume += fillingSpeed - devastationSpeed;
            minutes++;
        }

        System.out.println("Бассейн наполнится через " + minutes + " минут");

    }
}
