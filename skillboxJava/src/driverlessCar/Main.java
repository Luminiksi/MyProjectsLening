package driverlessCar;

public class Main {
    public static void main(String[] args) {
//        но сюда можно передать и другое число - не безопасно
        GearBox gearBox = new GearBox(GearBox.TYPE_VARIATOR);
        gearBox.getCurrentGear();
        gearBox.shiftDown();
    }
}
