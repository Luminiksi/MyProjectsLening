package main.try_2.setAndMap.lesson_3;

import java.time.LocalDate;
import java.util.Objects;

public class TaskWithoutHash {
    private String name;
    private final LocalDate time;
    private boolean isDone;
    private static int equalsCount = 0;

    public TaskWithoutHash(String name) {
        this.name = name;
        this.time = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getTime() {
        return time;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public static int getEqualsCount() {
        return equalsCount;
    }


    @Override
    public boolean equals(Object o) {
        equalsCount++;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskWithoutHash task = (TaskWithoutHash) o;
        return isDone == task.isDone && Objects.equals(name, task.name);
    }

    //отключаем хеш сравнение - для всех элементов он одинаковый (сравнение только с equals)
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", isDone=" + isDone +
                '}';
    }
}
