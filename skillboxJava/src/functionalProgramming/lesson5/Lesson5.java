package functionalProgramming.lesson5;

import myFeatures.Printer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Lesson5 {
    public static void run() throws InterruptedException {
        Printer.printLessonNumber(5, 16);
        Printer.printLessonName("Лямбда-выражения");
        Printer.printTaskNumber(1);
        try {
            task1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        try {
            task4();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(100);
        System.out.println();
        Printer.printTaskNumber(5);
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        try {
            task9();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(100);
        System.out.println();
        Printer.printTaskNumber(10);
        task10();
        System.out.println();
    }

    public static void task1() {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "Один");
        numbers.put(2, "Два");
        numbers.put(3, "Три");

        System.out.println(numbers.get(5).toUpperCase());

    }

    public static void task2() {
        Computer computer = new Computer(new SoundCard(new USB("2.0.4334")));
        String version = "N/A";
//        Чтобы у нас NullPointer не выпал в теории, нам придется делать вот такую большую проверку
        if (computer != null) {
            SoundCard soundCard = computer.getSoundCard();
            if (soundCard != null) {
                USB usb = soundCard.getUsb();
                if (usb != null) {
                    version = usb.getVersion();
                }
            }
        }
        System.out.println(version);
    }

    public static void task3() {
        ComputerWithOpt computer = new ComputerWithOpt(new SoundCardWithOpt(new USBWithOpt("2.0.4334")));
        System.out.println("Одинаковый код по логике кода:");
        Optional<ComputerWithOpt> optComputer = Optional.ofNullable(computer);
        optComputer.ifPresent(comp -> System.out.println("Computer exists"));
        if (optComputer.isPresent()) {
            System.out.println("Computer exists");
        }
    }

    public static void task4() {
        ComputerWithOpt computer = new ComputerWithOpt(new SoundCardWithOpt(new USBWithOpt("2.0.4334")));

        Optional<ComputerWithOpt> optComputer = Optional.empty();
        ComputerWithOpt comp = optComputer.get();
    }

    public static void task5() {
        Optional<ComputerWithOpt> optComputer = Optional.empty();
        ComputerWithOpt comp = optComputer.orElse(new ComputerWithOpt(new SoundCardWithOpt(new USBWithOpt("default"))));
    }

    public static void task6() {
        Optional<String> optional = Optional.empty();
        System.out.println(optional.orElse("EMPTY"));
    }

    public static void task7() {
        Optional<String> optional = Optional.empty();
        System.out.println(optional.orElseGet(() -> getAnotherString()));
    }

    public static void task8() {
        Optional<String> optional = Optional.empty();
        System.out.println(optional.orElseGet(Lesson5::getAnotherString));
    }

    public static String getAnotherString() {
        return "get EMPTY";
    }

    public static void task9() {
        Optional<String> optional = Optional.empty();
        System.out.println(optional.orElseThrow(() -> new RuntimeException("No value present")));
    }

    public static void task10() {
        Computer computer = new Computer(new SoundCard(new USB("2.0.4334")));

        String version = Optional.ofNullable(computer.getSoundCard())
                .map(soundCard -> soundCard.getUsb())
                .map(usb -> usb.getVersion())
                .orElse("N/A");

        System.out.println(version);

        Computer computer1 = new Computer(null);

        String version1 = Optional.ofNullable(computer1.getSoundCard())
                .map(SoundCard::getUsb)
                .map(USB::getVersion)
                .orElse("N/A");

        String version2 = Optional.ofNullable(computer1.getSoundCard())
                .map(SoundCard::getUsb)
                .map(USB::getVersion)
                .filter(ver -> ver.equals("1.003"))
                .orElse("N/A");

        System.out.println(version1);
        System.out.println(version2);

    }
}
