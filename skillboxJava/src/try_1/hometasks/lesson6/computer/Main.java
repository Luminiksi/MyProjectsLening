package try_1.hometasks.lesson6.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("ООО Сарай", "Из того, что было");
        printInfo(computer);
        Processor processor = new Processor(2.4, 12, "IBS", 12.5);
        computer.setProcessor(processor);
        printInfo(computer);
        RAM ram = new RAM(RAMType.DDR2, 2, 24.5);
        computer.setRam(ram);
        printInfo(computer);
        Storage storage = new Storage(StorageType.HDD, 1, 345.7);
        computer.setStorage(storage);
        printInfo(computer);
        Screen screen = new Screen(27, ScreenType.VA, 4.45);
        computer.setScreen(screen);
        printInfo(computer);
        Keyboard keyboard = new Keyboard(KeyboardType.MEMBRANE, true, 456.7);
        computer.setKeyboard(keyboard);
        printInfo(computer);
    }

    public static void printInfo(Computer computer) {
        System.out.println("Общий веес компьютера: " + computer.getWeight());
        System.out.println(computer);
        System.out.println();
    }
}
