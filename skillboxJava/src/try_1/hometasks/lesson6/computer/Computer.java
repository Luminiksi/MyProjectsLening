package try_1.hometasks.lesson6.computer;

public class Computer {
    private final String vendor;
    private final String name;

    private Processor processor;
    private RAM ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("производитель: " + vendor + "\n");
        string.append("название: " + name + "\n");
        if (processor != null) {
            string.append(processor);
        } else {
            string.append("В комплектации отсуствует процессор" + "\n");
        }
        if (ram != null) {
            string.append(ram);
        } else {
            string.append("В комплектации отсуствует оперативная память" + "\n");
        }
        if (storage != null) {
            string.append(storage);
        } else {
            string.append("В комплектации отсуствует накопитель" + "\n");
        }
        if (screen != null) {
            string.append(screen);
        } else {
            string.append("В комплектации отсуствует экран" + "\n");
        }
        if (keyboard != null) {
            string.append(keyboard);
        } else {
            string.append("В комплектации отсуствует клавиатура" + "\n");
        }
        return string.toString();
    }

    public double getWeight() {
        double weight = 0;
        if (processor != null) {
            weight += processor.getWeight();
        }
        if (ram != null) {
            weight += ram.getWeight();
        }
        if (storage != null) {
            weight += storage.getWeight();
        }
        if (screen != null) {
            weight += screen.getWeight();
        }
        if (keyboard != null) {
            weight += keyboard.getWeight();
        }
        return weight;
    }
}
