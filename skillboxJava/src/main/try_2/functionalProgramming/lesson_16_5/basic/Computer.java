package main.try_2.functionalProgramming.lesson_16_5.basic;

public class Computer {
    private SoundCard soundCard;

    public Computer(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }
}
