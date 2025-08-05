package try_1.setAndMap.lesson3;

import java.time.LocalDateTime;
import java.util.Objects;

public class TaskNotHash {
    private String name;
    private final LocalDateTime time;
    private boolean isDone;

    public TaskNotHash(String name) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskNotHash task = (TaskNotHash) o;
        return isDone == task.isDone && Objects.equals(name, task.name);
    }

    @Override
    public String toString() {
        return "NewTask{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", isDone=" + isDone +
                '}';
    }
}
