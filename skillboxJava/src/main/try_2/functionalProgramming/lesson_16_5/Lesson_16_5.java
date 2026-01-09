package main.try_2.functionalProgramming.lesson_16_5;

import main.try_2.functionalProgramming.lesson_16_5.basic.Computer;
import main.try_2.functionalProgramming.lesson_16_5.basic.SoundCard;
import main.try_2.functionalProgramming.lesson_16_5.basic.USB;
import main.try_2.myFeatures.Printer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Lesson_16_5 {
    public static void run() {
        Printer.printLessonNumber(5, 16);
        Printer.printLessonName("Класс Optional");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Смотрим, что будет, если обратиться не к существующему элементы списка и вызвать у него какой-либо метод");
        try {
            task1();
        } catch (NullPointerException e) {
            Printer.printError(e.getClass() + " -> " + e.getMessage());
        }
        System.out.println();

        Printer.printTaskNumber(2);
        Printer.printTaskName("Делаем проверки, чтобы не словить NullPointerException");
        task2();
        System.out.println();

        Printer.printTaskNumber(3);
        Printer.printTaskName("А теперь делаем объекты Optional");
        task3();
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
        Computer computer = new Computer(
                new SoundCard(new USB("1.3.5456"))
        );

//        String version = computer.getSoundCard().getUsb().getVersion();
        String version = "N/A";
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
        Computer computer = new Computer(
                new SoundCard(new USB("1.3.5456"))
        );

//        String version = computer.getSoundCard().getUsb().getVersion();
        String version = "N/A";

        Optional<Computer> optionalComputer = Optional.ofNullable(computer);
        Optional<Computer> nullOptional = Optional.empty();
        System.out.println("Проверяем, нулевой объект или нет (1 вариант): ");
        optionalComputer.ifPresent(comp -> System.out.println("Computer exists"));

        System.out.println("Проверяем, нулевой объект или нет (2 вариант): ");
        if (optionalComputer.isPresent()) {
            System.out.println("Computer exists");
        }
        System.out.println();

        System.out.println("Получаем объект из Optional:");
        Computer comp = optionalComputer.get();
        System.out.println("Получаем объект из Optional(тогда там ничего нет):");
        try {
            Computer comp2 = nullOptional.get();
        } catch (Exception e) {
            Printer.printError(e.getClass() + " -> " + e.getMessage());
        }
        System.out.println();

        System.out.println("Пример с пустой строкой (orElse)");
        Optional<String> optional = Optional.empty();
        System.out.println(optional.orElse("EMPTY"));
        System.out.println("Пример с пустой строкой (orElseGet)");
        System.out.println(optional.orElseGet(Lesson_16_5::getAnotherString));
        System.out.println("Пример с пустой строкой (orElseThrow)");
        try {
            System.out.println(optional.orElseThrow(() -> new RuntimeException("No value present")));
        } catch (Exception e) {
            Printer.printError(e.getClass() + " -> " + e.getMessage());
        }
        System.out.println();

        System.out.println("А теперь проверка, но с помощью Optional (классы при этом обычные, не возвращают Optional)");
        version = Optional.ofNullable(computer.getSoundCard())
                .map(SoundCard::getUsb)
                .map(USB::getVersion)
                .orElse("N/A");
        System.out.println(version);

        System.out.println();
        System.out.println("Можно получить пустой Optional при помощи:");
        System.out.println(Optional.empty());
    }

    public static String getAnotherString() {
        return "Default";
    }
}
