package try_1.hometasks.lesson5;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        if (currentFloor <= minFloor) {
            return;
        }
        currentFloor--;
    }

    public void moveUp() {
        if (currentFloor >= maxFloor) {
            return;
        }
        currentFloor++;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Такого этажа не существует");
            return;
        }
        if (currentFloor < floor) {
            for (int i = currentFloor; i < floor; i++) {
                moveUp();
                printFloor();
            }
        } else {
            for (int i = currentFloor; i > floor; i--) {
                moveDown();
                printFloor();
            }
        }
    }


    public void printFloor() {
        System.out.println("Этаж: " + currentFloor);
    }
}
