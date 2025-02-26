package practice;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
        System.out.println("Добавлено дело \'" + todo + "\'");
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (todoList.size() <= index) {
            add(todo);
            return;
        }
        todoList.add(index, todo);
        System.out.println("Добалвено дело \'" + todo + "\'");
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (todoList.size() <= index) {
            System.out.println("Дело с таким номером не существует");
            return;
        }
        System.out.println("Дело \"" + todoList.get(index) + "\" заменено на \"" + todo + "\"");
        todoList.set(index, todo);
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (todoList.size() <= index) {
            System.out.println("Дело с таким номером не существует");
            return;
        }
        System.out.println("Дело \"" + todoList.get(index) + "\" удалено");
        todoList.remove(index);
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todoList;
    }

}