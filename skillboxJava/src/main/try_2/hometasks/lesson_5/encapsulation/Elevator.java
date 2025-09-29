package main.try_2.hometasks.lesson_5.encapsulation;

public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        currentFloor = 1;
    }

    public void moveDown() {
        int newFloor = currentFloor - 1;
        if (newFloor < minFloor) {
            return;
        }
        printMoveUp(newFloor);
        currentFloor = newFloor;
    }

    public void moveUp() {
        int newFloor = currentFloor + 1;
        if (newFloor > maxFloor) {
            return;
        }
        printMoveDown(newFloor);
        currentFloor = newFloor;
    }

    public void move(int floor) {
        if (currentFloor != floor && floor >= minFloor && floor <= maxFloor) {
            if (floor > currentFloor) {
                printMoveUp(currentFloor, floor);
            } else {
                printMoveDown(currentFloor, floor);
            }
            currentFloor = floor;
        }
    }

    private void printMoveUp(int newFloor) {
        printMoveUp(newFloor, newFloor);
    }

    private void printMoveUp(int startFloor, int endFloor) {
        for (int i = startFloor + 1; i <= endFloor; i++) {
            System.out.println("Этаж №" + i);
        }
        System.out.println("Двери открываются...");
    }

    private void printMoveDown(int newFloor) {
        printMoveDown(newFloor, newFloor);
    }

    private void printMoveDown(int startFloor, int endFloor) {
        for (int i = startFloor - 1; i >= endFloor; i--) {
            System.out.println("Этаж №" + i);
        }
        System.out.println("Двери открываются...");
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
