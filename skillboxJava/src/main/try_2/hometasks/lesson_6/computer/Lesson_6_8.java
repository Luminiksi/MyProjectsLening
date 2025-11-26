package main.try_2.hometasks.lesson_6.computer;

import main.try_2.hometasks.lesson_6.computer.types.KeyboardTypes;
import main.try_2.hometasks.lesson_6.computer.types.MemoryTypes;
import main.try_2.hometasks.lesson_6.computer.types.ScreenTypes;
import main.try_2.hometasks.lesson_6.computer.types.StorageTypes;
import main.try_2.myFeatures.Printer;

public class Lesson_6_8 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Printer.printLessonNumber(8, 6);
        Printer.printLessonName("Практическая работа");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Задание 2");
        task1();
        System.out.println();
    }

    public static void task1() {
        Keyboard keyboard = new Keyboard(KeyboardTypes.Mechanical, true, 320);
        Screen screen = new Screen(31, ScreenTypes.IPS, 2250);
        Processor proc = new Processor(2400, 24, "Китай", 128);
        Memory memory = new Memory(MemoryTypes.DDR5, 64, 345);
        Storage storage = new Storage(StorageTypes.SSD, 1024, 328);

        Computer computer = new Computer("Я!", "Личная сборочка");
        computer.setKeyboard(keyboard);
        computer.setScreen(screen);
        computer.setMemory(memory);
        computer.setStorage(storage);
        computer.setProcessor(proc);

        System.out.println(computer);
    }
}
