package main.try_2.setAndMap.lesson_4;

import java.util.Comparator;

public class TaskNameComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        return task1.getName().compareTo(task2.getName());
    }
}
