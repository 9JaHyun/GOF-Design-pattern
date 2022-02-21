package _04_builder_pattern._02_after_;

public class Hamburger {
    private int bun;
    private int patty;
    private int cheese;
    private int onion;
    private int bacon;
    private int lettuce;
    private int pickle;
    private int sauce1;
    private int sauce2;
    private int sauce3;

    public Hamburger() {
    }

    public Hamburger(int bun, int patty, int cheese, int onion, int bacon, int lettuce, int pickle,
        int sauce1, int sauce2, int sauce3) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.onion = onion;
        this.bacon = bacon;
        this.lettuce = lettuce;
        this.pickle = pickle;
        this.sauce1 = sauce1;
        this.sauce2 = sauce2;
        this.sauce3 = sauce3;
    }

    public int getBun() {
        return bun;
    }

    public void setBun(int bun) {
        this.bun = bun;
    }

    public int getPatty() {
        return patty;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getOnion() {
        return onion;
    }

    public void setOnion(int onion) {
        this.onion = onion;
    }

    public int getBacon() {
        return bacon;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }

    public int getLettuce() {
        return lettuce;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public int getPickle() {
        return pickle;
    }

    public void setPickle(int pickle) {
        this.pickle = pickle;
    }

    public int getSauce1() {
        return sauce1;
    }

    public void setSauce1(int sauce1) {
        this.sauce1 = sauce1;
    }

    public int getSauce2() {
        return sauce2;
    }

    public void setSauce2(int sauce2) {
        this.sauce2 = sauce2;
    }

    public int getSauce3() {
        return sauce3;
    }

    public void setSauce3(int sauce3) {
        this.sauce3 = sauce3;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
            "bun=" + bun +
            ", patty=" + patty +
            ", cheese=" + cheese +
            ", onion=" + onion +
            ", bacon=" + bacon +
            ", lettuce=" + lettuce +
            ", pickle=" + pickle +
            ", sauce1=" + sauce1 +
            ", sauce2=" + sauce2 +
            ", sauce3=" + sauce3 +
            '}';
    }
}
