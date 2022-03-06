package src._05_mediator_pattern._02_after;

import java.time.LocalDateTime;

public class Hotel {

    public static void main(String[] args) {
        Guest guest = new Guest(1);

        guest.getTower(5);
        guest.dinner(LocalDateTime.now());
    }
}
