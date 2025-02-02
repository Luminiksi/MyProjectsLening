package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static final int CONTAINERS_IN_TRUCK = 12;
    public static final int BOXES_IN_CONTAINER = 27;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t
        boolean notFullContainer = boxes % BOXES_IN_CONTAINER != 0;
        int containers = boxes / BOXES_IN_CONTAINER
                + (notFullContainer ? 1 : 0);
        boolean notFullTruck = containers % CONTAINERS_IN_TRUCK != 0;
        int trucks = containers / CONTAINERS_IN_TRUCK
                + (notFullTruck ? 1 : 0);

        int boxesCount = 1;
        int containersCount = 1;

        for (int i = 1; i <= trucks; i++) {
            System.out.println("Грузовик: " + i);
            int containersCont;
            if (notFullTruck && i == trucks) {
                containersCont = containers % CONTAINERS_IN_TRUCK;
            } else {
                containersCont = CONTAINERS_IN_TRUCK;
            }
            for (int j = 1; j <= containersCont; j++) {
                System.out.println("\tКонтейнер: " + containersCount);
                int boxesCont;
                if (notFullContainer && j == containersCont && i == trucks) {
                    boxesCont = boxes % BOXES_IN_CONTAINER;
                } else {
                    boxesCont = BOXES_IN_CONTAINER;
                }
                for (int k = 1; k <= boxesCont; k++) {
                    System.out.println("\t\tЯщик: " + boxesCount);
                    boxesCount++;
                }
                containersCount++;
            }
        }

        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + trucks + " шт.");
        System.out.println("контейнеров - " + containers + " шт.");

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
