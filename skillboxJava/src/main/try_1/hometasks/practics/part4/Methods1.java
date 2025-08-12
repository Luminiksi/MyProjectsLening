package main.try_1.hometasks.practics.part4;

import java.time.LocalDateTime;

public class Methods1 {
    public static void main(String[] args) {
        printCurrentDateTime();
    }

    public static void printCurrentDateTime() {
        System.out.print("Дата и время: ");
        System.out.println(LocalDateTime.now());
    }

}
