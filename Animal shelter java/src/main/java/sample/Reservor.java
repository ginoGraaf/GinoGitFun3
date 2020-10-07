package sample;

import java.time.LocalDateTime;


public class Reservor {
    private String Name;
    private LocalDateTime ReservedAt;

    public Reservor(String Name,LocalDateTime ReservedAt)
    {
        this.setName(Name);
        this.setReservedAt(ReservedAt);
    }

    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    public LocalDateTime getReservedAt() {
        return ReservedAt;
    }

    private void setReservedAt(LocalDateTime reservedAt) {
        ReservedAt = reservedAt;
    }
}
