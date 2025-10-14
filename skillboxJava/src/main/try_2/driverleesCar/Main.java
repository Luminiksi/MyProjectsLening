package main.try_2.driverleesCar;

public class Main {
    public static void main(String[] args) {
        GearBoxType type = GearBoxType.valueOf("AUTOMATIC");
        GearBox gearBox = new GearBox(type);
        System.out.println(gearBox.getType());
    }
}
