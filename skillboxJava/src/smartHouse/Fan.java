package smartHouse;

public class Fan implements ElectronicDevice {
    @Override
    public boolean isSwitchOn() {
        return false;
    }

    @Override
    public double getEnergyConsumption() {
        return 0;
    }

    @Override
    public void switchOn() {
        System.out.println("Test class");
    }

    @Override
    public void switchOff() {
        System.out.println("Test class");
    }
}
