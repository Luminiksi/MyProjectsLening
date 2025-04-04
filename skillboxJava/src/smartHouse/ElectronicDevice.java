package smartHouse;

public interface ElectronicDevice {

    boolean isSwitchOn();

    double getEnergyConsumption();

    void switchOn();

    void switchOff();

    default void toggle() {
        if (isSwitchOn()) {
            switchOff();
        } else {
            switchOff();
        }
    }
}
