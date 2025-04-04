package smartHouse;

public class Lamp extends LightingDevice {

    private Type type;

    public enum Type {
        INCANDESCENT,
        FILAMENT,
        LED,
        LUMINESCENT
    }

    public Lamp(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption() {
        return power * brightness;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
