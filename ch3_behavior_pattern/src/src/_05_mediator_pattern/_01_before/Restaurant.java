package src._05_mediator_pattern._01_before;

import java.time.LocalDateTime;

public class Restaurant {

    private CleaningService cleaningService = new CleaningService();

    public void dinner(Guest guest) {
        System.out.println("dinner for " + guest);
    }

    public void clean() {
        cleaningService.clean(this);
    }
}
