package try_1.smartHouse;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(100);
        lamp.setType(Lamp.Type.FILAMENT);


        TreeSet<LightingDevice> lightingDevices = new TreeSet<>(new Comparator<LightingDevice>() {
            @Override
            public int compare(LightingDevice o1, LightingDevice o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        });

        LightingDevice lightingDevice = new LightingDevice(400) {
            @Override
            public double getEnergyConsumption() {
                return power * brightness;
            }
        };

    }
}
