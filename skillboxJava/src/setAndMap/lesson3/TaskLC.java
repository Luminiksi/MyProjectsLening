package setAndMap.lesson3;

import java.time.LocalDateTime;
import java.util.Objects;

public class TaskLC {
    private String name;
    private final LocalDateTime time;
    private boolean isDone;
    private static int equalsCount;

    public TaskLC(String name) {
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

    public static int getEqualsCount() {
        return equalsCount;
    }

    public static void resetEqualsCount() {
        equalsCount = 0;
    }

    @Override
    public boolean equals(Object o) {
        equalsCount++;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskLC task = (TaskLC) o;
        return isDone == task.isDone && Objects.equals(name.toLowerCase(), task.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(), isDone);
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
