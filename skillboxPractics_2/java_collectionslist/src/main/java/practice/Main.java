package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        System.out.println("Программа запущена");
        printInformation();
        while (true) {
            String command = SCANNER.nextLine();
            if (command.toLowerCase().equals("exit")) {
                break;
            }
            runTask(command);
        }
    }

    public static void runTask(String command) {
        command = command.trim();
        int index = command.indexOf(' ');
        String task = command.substring(0, index < 0 ? command.length() : index);
        task = task.toLowerCase();
        switch (task) {
            case "info" -> printInformation();
            case "add" -> {
                command = command.substring(index + 1);
                addTask(command);
            }
            case "edit" -> {
                command = command.substring(index + 1);
                editTask(command);
            }
            case "delete" -> {
                command = command.substring(index + 1);
                deleteTask(command);
            }
            case "list" -> listTask();
            default -> System.out.println("Неизвестная команда, все команды вы можете посмотреть по команде: \'INFO\'");
        }
    }

    public static void addTask(String command) {
        int index = command.indexOf(' ');
        String firstElement = command.substring(0, index < 0 ? command.length() : index);
        if (isInteger(firstElement)) {
            String secondElement = command.substring(index + 1);
            int commandIndex = Integer.parseInt(firstElement);
            todoList.add(commandIndex, secondElement);
        } else {
            todoList.add(command);
        }
    }

    public static void editTask(String command) {
        int index = command.indexOf(' ');
        String firstElement = command.substring(0, index < 0 ? command.length() : index);
        if (isInteger(firstElement)) {
            String secondElement = command.substring(index + 1);
            int commandIndex = Integer.parseInt(firstElement);
            todoList.edit(commandIndex, secondElement);
        } else {
            System.out.println("Сначала воодим индекс задачи, а потом саму задачу");
        }
    }

    public static void deleteTask(String command) {
        if (isInteger(command)) {
            int commandIndex = Integer.parseInt(command);
            todoList.delete(commandIndex);
        } else {
            System.out.println("Чтобы удалить задачу, нужно ввести её индекс");
        }
    }

    public static void listTask() {
        ArrayList<String> tasks = todoList.getTodos();
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + " - " + tasks.get(i));
        }
    }

    public static void printInformation() {
        System.out.println("Информация о командах:");
        System.out.println("\tLIST — выводит дела с их порядковыми номерами;");
        System.out.println("\tADD — добавляет дело в конец списка или дело на определённое место, " +
                "сдвигая остальные дела вперёд, если указать номер; " +
                "если указан несуществующий индекс - добавить в конец списка.");
        System.out.println("\tEDIT — заменяет дело с указанным номером; если указан несуществующий индекс - ничего не делать.");
        System.out.println("\tDELETE — удаляет; если указан несуществующий индекс - ничего не делать.");
        System.out.println("\tINFO — информация о командах");
        System.out.println("\tEXIT — закончить выполнение программы");
    }

    public static boolean isInteger(String str) {
        return str.matches("\\d+");
    }
}
