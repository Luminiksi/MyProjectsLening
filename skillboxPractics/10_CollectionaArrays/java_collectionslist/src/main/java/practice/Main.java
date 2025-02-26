package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        while (true) {
            String command = scanner.nextLine();
            command = command.trim();
            ArrayList<String> commands = new ArrayList<>(Arrays.asList(command.split("\s")));
            switch (commands.get(0)){
                case "LIST" -> list(todoList);
                case "ADD" -> add(todoList, commands,command);
                case "EDIT" -> edit(todoList, commands, command);
                case "DELETE" -> delete(todoList, commands);
                default -> System.out.println("Неясная команда");
            }

        }
    }

    public static void list(TodoList todoList) {
        ArrayList<String> list = todoList.getTodos();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
    }

    public static void add(TodoList todoList, ArrayList<String> commands, String command) {
        if (commands.size() < 2) {
            System.out.println("Команада на добавление должна содержать слово ADD и добавляемый элемент (например - ADD buy milk)");
            System.out.println("Или ADD и индекс добавляемого элемента и сам элемент (например - ADD 1 learn java)");
            return;
        }

        if (isNumber(commands.get(1))) {
            command = getTaskFromCommand(command, false);
            todoList.add(Integer.parseInt(commands.get(1)), command);

        } else {
            command = getTaskFromCommand(command, true);
            todoList.add(command);
        }
    }

    public static void edit(TodoList todoList, ArrayList<String> commands, String command) {
        if (commands.size() < 3) {
            printEditInfo();
            return;
        }
        if (!isNumber(commands.get(1))) {
            printEditInfo();
            return;
        }
        command = getTaskFromCommand(command, false);
        todoList.edit(Integer.parseInt(commands.get(1)), command);
    }

    public static void delete(TodoList todoList, ArrayList<String> commands) {
        if (commands.size() < 2) {
            printDeleteInfo();
            return;
        }
        if (!isNumber(commands.get(1))) {
            printDeleteInfo();
            return;
        }
        int index = Integer.parseInt(commands.get(1));
        todoList.delete(index);
    }

    public static boolean isNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if(!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String getTaskFromCommand(String command, boolean isFirst) {
        int index = command.indexOf(" ");
        String task = command.substring(index + 1);
        if (isFirst) {
            return task;
        }
        index = task.indexOf(" ");
        task = task.substring(index + 1);
        return task;
    }

    public static void printDeleteInfo() {
        System.out.println("Команада на удаление должна содержать слово DELETE и индекс удаялемого элемента (например - DELETE 100)");
    }

    public static void printEditInfo() {
        System.out.println("Команада на измение должна содержать слово EDIT, индекс изменяемого элемента и сам новый элемент (например - EDIT 0 make a cup of tea)");
    }
}
