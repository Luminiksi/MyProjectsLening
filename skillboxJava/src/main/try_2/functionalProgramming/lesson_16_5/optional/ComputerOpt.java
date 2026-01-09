package main.try_2.functionalProgramming.lesson_16_5.optional;

import java.util.Optional;

public class ComputerOpt {
    private SoundCardOpt soundCard;

    public ComputerOpt(SoundCardOpt soundCard) {
        this.soundCard = soundCard;
    }

    public Optional<SoundCardOpt> getSoundCard() {
        return Optional.ofNullable(soundCard);
    }
}
