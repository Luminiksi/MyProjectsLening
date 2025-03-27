package functionalProgramming.lesson5;

public class Computer {
    private SoundCard soundCard;

    public Computer(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }
}
