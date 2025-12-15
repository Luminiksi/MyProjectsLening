package main.try_2.setAndMap.lesson_3;

import java.time.LocalDate;

public class TaskWithoutString {
    private String name;
    private final LocalDate time;
    private boolean isDone;

    public TaskWithoutString(String name) {
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
}
