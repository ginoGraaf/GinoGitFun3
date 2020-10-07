package sample;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Dog extends Animal{

    private LocalDateTime lastWalk;
    private boolean NeedsWalk;

    public Dog(String Name, Gender gender) {
        super(Name, gender);
    }

    public LocalDateTime getLastWalk() {
        return lastWalk;
    }

    private void setLastWalk(LocalDateTime lastWalk) {
        this.lastWalk = lastWalk;
    }

    public boolean isNeedsWalk() {
        return (ChronoUnit.DAYS.between(LocalDateTime.now(),this.lastWalk))>0;
    }

    private void setNeedsWalk(boolean needsWalk) {
        NeedsWalk = needsWalk;
    }
}
