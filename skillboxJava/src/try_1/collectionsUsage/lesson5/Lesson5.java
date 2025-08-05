package try_1.collectionsUsage.lesson5;

import try_1.myFeatures.Printer;

import java.util.ArrayList;

import static try_1.myFeatures.Colors.ANSI_PURPLE;
import static try_1.myFeatures.Colors.ANSI_RESET;

public class Lesson5 {
    public static void run() {
        Printer.printLessonNumber(5, 12);
        Printer.printLessonName("Класс Collections");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        printInfo();

        System.out.println();
        System.out.println();
    }

    public static void task1() {
        Game game = new Game();
        game.initPlayers();
        ;
        ArrayList<String> winners = game.getWinners();
        for (int i = 0; i < winners.size(); i++) {
            System.out.println(winners.get(i));
        }
    }

    public static void task2() {
        Game game = new Game();
        game.initPlayers();
        ;
        game.add("Андрей Дмитрев");
    }

    public static void printInfo() {
        System.out.println(ANSI_PURPLE + "Информация из урока!!!!");
        System.out.println("________________________________________________");
        System.out.println("\tМетоды статического класса Collections");
        System.out.println("________________________________________________" + ANSI_RESET);
        System.out.println("\t\tМетод\t\t|\t\t\t\tОписание");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\taddAll()\t\t|\tДобавление эл-ов в коллекцию (несколько элементов в ту колекцию, которую передаем первым параметром");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tbinarySearch()\t|\tВозвращает индекс, на котором находится элемент, если значение меньше 0 " +
                "- индекс, куда его предпочтительнее поставить(если у нас отсортированная коллекция");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tcopy()\t\t\t|\tКопирует элеменгты из одного списка в другой(именно List)");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tdisjoint()\t\t|\tСравнивает коллекции и возвращает true, еслим в коллекциях нет общих элементов");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\temptyList()\t\t|\tВозвращает пустой список(List)");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("emptyListIterator()\t|\tВозвращает итератор (ListIterator)");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\temptyMap()\t\t|\tВозвращает мап (Map)");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tfill()\t\t\t|\tЗаменяет все элементы коллекции на тот, что мы передаем в параметрах");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tfrequency()\t\t|\tПодсчитывает количество элемента(который мы передали) в коллекции");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("indexOfSubList()\t|\tИщет список в другом списке с начала");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("lastIndexOfSubList()|\tИщет список в другом списке с конца");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tmax()/min()\t\t|\tВОзвращает максимальный/минимальный элемент (но коллекции " +
                "должны быть сравниваемые, либо передаем дополнительный компаратор)");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\treplaceAll()\t|\tЗаменяет объекты на другие объекты");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\treverse()\t\t|\tПереворачивает множество");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\treverseOrder()\t|\tВозвращает обратный компаратор");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tshuffle()\t\t|\tПеремешивает коллекцию (+ можно дополнительно передать рандом - ?)");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\tsort()\t\t\t|\tСортирует (дополнительно можно передать компоратор)");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println(ANSI_PURPLE + "________________________________________________" + ANSI_RESET);
    }
}
