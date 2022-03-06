package src._05_mediator_pattern._01_before;

public class CleaningService {

    public void getTower(Guest guest, int numberOfTower) {
        System.out.println(numberOfTower + " towers to " + guest);

    }

    public void clean(Gym gym) {
        System.out.println("clean " + gym);
    }

    public void clean(Restaurant restaurant) {
        System.out.println("clean " + restaurant);
    }
}
