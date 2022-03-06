package src._05_mediator_pattern._02_after;

import java.time.LocalDateTime;

// Mediator
public class FrontDesk {

    private CleaningService cleaningService = new CleaningService(this);
    private Restaurant restaurant = new Restaurant(this);

    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTower(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.makeReservation(guest.getId(), dateTime);
    }
}
