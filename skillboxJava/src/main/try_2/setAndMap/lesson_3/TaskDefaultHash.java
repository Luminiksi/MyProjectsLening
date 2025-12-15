package main.try_2.setAndMap.lesson_3;

import java.time.LocalDate;
import java.util.Objects;

public class TaskDefaultHash {
    private String name;
    private final LocalDate time;
    private boolean isDone;

    public TaskDefaultHash(String name) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskDefaultHash task = (TaskDefaultHash) o;
        return isDone == task.isDone && Objects.equals(name, task.name);
    }

    //Используем дефолтный метод хеш из класса Object
//    @Override
//    public int hashCode() {
//        return 1;
//    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", isDone=" + isDone +
                '}';
    }
}
