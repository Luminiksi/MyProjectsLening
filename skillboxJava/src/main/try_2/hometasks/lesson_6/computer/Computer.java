package main.try_2.hometasks.lesson_6.computer;

public class Computer {
    private Memory memory;
    private Processor processor;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
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

    public Memory getMemory() {
        return memory;
    }

    public Processor getProcessor() {
        return processor;
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

    @Override
    public String toString() {
        return "Информация об компьютере:\n" +
                "   - производитель: " + vendor + "\n" +
                "   - название: " + name + "\n" +
                processor + memory + storage + screen + keyboard;
    }
}
