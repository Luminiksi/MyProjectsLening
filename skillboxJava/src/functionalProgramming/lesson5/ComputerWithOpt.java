package functionalProgramming.lesson5;

import java.util.Optional;

public class ComputerWithOpt {
    private SoundCardWithOpt soundCard;

    public ComputerWithOpt(SoundCardWithOpt soundCard) {
        this.soundCard = soundCard;
    }

    public Optional<SoundCardWithOpt> getSoundCard() {
        return Optional.ofNullable(soundCard);
    }
}
