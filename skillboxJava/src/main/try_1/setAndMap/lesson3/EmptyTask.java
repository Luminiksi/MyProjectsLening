package main.try_1.setAndMap.lesson3;

import java.time.LocalDateTime;

public class EmptyTask {
    private String name;
    private final LocalDateTime time;
    private boolean isDone;

    public EmptyTask(String name) {
        this.name = name;
        time = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
