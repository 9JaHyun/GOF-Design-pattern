package src._05_mediator_pattern._02_after;

import java.time.LocalDateTime;

public class Guest {
    private FrontDesk frontDesk = new FrontDesk();
    private Integer id;

    public Guest(Integer id) {
        this.id = id;
    }

    public void getTower(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    public void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }
}
