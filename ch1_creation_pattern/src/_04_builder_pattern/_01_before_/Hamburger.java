package _04_builder_pattern._01_before_;

public class Hamburger {
    private boolean bun;
    private boolean patty;
    private boolean cheese;
    private boolean onion;
    private boolean bacon;
    private boolean lettuce;
    private boolean pickle;
    private boolean sauce1;
    private boolean sauce2;
    private boolean sauce3;

    public Hamburger() {
    }

    public Hamburger(boolean bun, boolean patty, boolean cheese, boolean onion, boolean bacon,
        boolean lettuce, boolean pickle, boolean sauce1, boolean sauce2, boolean sauce3) {
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

    public boolean isBun() {
        return bun;
    }

    public void setBun(boolean bun) {
        this.bun = bun;
    }

    public boolean isPatty() {
        return patty;
    }

    public void setPatty(boolean patty) {
        this.patty = patty;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public boolean isPickle() {
        return pickle;
    }

    public void setPickle(boolean pickle) {
        this.pickle = pickle;
    }

    public boolean isSauce1() {
        return sauce1;
    }

    public void setSauce1(boolean sauce1) {
        this.sauce1 = sauce1;
    }

    public boolean isSauce2() {
        return sauce2;
    }

    public void setSauce2(boolean sauce2) {
        this.sauce2 = sauce2;
    }

    public boolean isSauce3() {
        return sauce3;
    }

    public void setSauce3(boolean sauce3) {
        this.sauce3 = sauce3;
    }
}
