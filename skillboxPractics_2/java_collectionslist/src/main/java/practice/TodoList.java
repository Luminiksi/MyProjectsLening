package practice;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        tasks.add(todo);
        System.out.printf("Добавлено дело \"%s\"\n", todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index < tasks.size()) {
            tasks.add(index, todo);
            System.out.printf("Дело \"%s\" заменено на \"%d\" индекс\n", todo, index);
        } else {
            add(todo);
        }
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index < tasks.size()) {
            String oldTask = tasks.get(index);
            tasks.set(index, todo);
            System.out.printf("Дело \"%s\" заменено на \"%s\"\n", oldTask, todo);
        } else {
            System.out.printf("Указанного дела с индексом %d отсуствует в списке\n", index);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index < tasks.size()) {
            String oldTask = tasks.get(index);
            tasks.remove(index);
            System.out.printf("Дело \"%s\" удалено\n", oldTask);
        } else {
            System.out.printf("Указанного дела с индексом %d отсуствует в списке\n", index);
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return tasks;
    }
}