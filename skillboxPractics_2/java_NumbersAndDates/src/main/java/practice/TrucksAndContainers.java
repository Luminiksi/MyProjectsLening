package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static final int MAX_BOXES_IN_CONTAINER = 27;
    public static final int MAX_CONTAINERS_IN_TRUCK = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        int containers = boxes / MAX_BOXES_IN_CONTAINER + (boxes % MAX_BOXES_IN_CONTAINER == 0 ? 0 : 1);
        int trucks = containers / MAX_CONTAINERS_IN_TRUCK + (containers % MAX_CONTAINERS_IN_TRUCK == 0 ? 0 : 1);

        int containersCount = 1;
        int boxesCount = 1;

        for (int indexTruck = 1; indexTruck <= trucks; indexTruck++) {
            System.out.println("Грузовик: " + indexTruck);
            for (int conteinerInTruckIndex = 0; conteinerInTruckIndex < MAX_CONTAINERS_IN_TRUCK; conteinerInTruckIndex++) {
                System.out.println("    Контейнер: " + containersCount++);
                for (int boxInContainerIndex = 0; boxInContainerIndex < MAX_BOXES_IN_CONTAINER; boxInContainerIndex++) {
                    System.out.println("        Ящик: " + boxesCount++);
                    if (boxesCount > boxes) {
                        break;
                    }
                }
                if (containersCount > containers) {
                    break;
                }
            }
        }

        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

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
