package try_2.FillingStation.myFeatures;

import lombok.Getter;

@Getter
public class Time {
    private long start;
    private long end;

    public void reset() {
        start = 0;
        end = 0;
    }

    public void setStart() {
        this.start = System.nanoTime();
    }

    public void setEnd() {
        this.end = System.nanoTime();
    }

    public void printTime() {
        Printer.printTime(end - start);
    }
}
