package main.try_2.hometasks.lesson_3;

public class SwimmingPool {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int time = 0;
        int currentVolume = 0;
        while (currentVolume < volume) {
            currentVolume += fillingSpeed - devastationSpeed;
            time++;
        }
        System.out.println(time);
    }
}
