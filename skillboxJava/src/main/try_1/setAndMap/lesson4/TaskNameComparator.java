package main.try_1.setAndMap.lesson4;

import java.util.Comparator;

public class TaskNameComparator implements Comparator<TaskWithoutComp> {
    @Override
    public int compare(TaskWithoutComp task1, TaskWithoutComp task2) {
        return task1.getName().compareTo(task2.getName());
    }
}
