package src._05_mediator_pattern._02_after;

import java.time.LocalDateTime;

public class Restaurant {

    private FrontDesk frontDesk;

    public Restaurant(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void makeReservation(Integer guestId, LocalDateTime dateTime) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println("dinner for " + guestId + " at " + dateTime);
    }

}
