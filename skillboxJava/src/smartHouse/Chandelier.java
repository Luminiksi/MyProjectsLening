package smartHouse;

public class Chandelier extends LightingDevice {

    private static final int LAMP_BRIGHTNESS_STEEPS = 2;
    private static final double CONSUMPTION_COEFF = 1.095;

    private final int lampsCount;

    public Chandelier(int power, int lampsCoutn) {
        super(power);
        this.lampsCount = lampsCoutn;
    }

    @Override
    public void setBrightness(double level) {
        double step = 1.0 / (lampsCount * LAMP_BRIGHTNESS_STEEPS);
        int stepsCount = (int) Math.round(level / step);
        super.setBrightness(stepsCount * step);
        class Controller {
            public Controller() {
//            some logic
            }

            public void reset() {
//            some logic
            }
        }

        if (brightness == 0) {
            Controller controller = new Controller();
            controller.reset();
        }
    }

    @Override
    public double getEnergyConsumption() {
        return power * Math.pow(brightness, CONSUMPTION_COEFF);
    }
}
