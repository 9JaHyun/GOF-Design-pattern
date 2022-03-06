package src._05_mediator_pattern._02_after;


public class CleaningService {

    private FrontDesk frontDesk;

    public CleaningService(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTower(Integer guestId, int numberOfTower) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println(numberOfTower + " towers to " + roomNumber);
    }

}
