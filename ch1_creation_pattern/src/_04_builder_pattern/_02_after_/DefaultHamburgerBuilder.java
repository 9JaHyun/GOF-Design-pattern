package _04_builder_pattern._02_after_;

public class DefaultHamburgerBuilder implements HamburgerBuilder{

    private Hamburger hamburger;
    @Override
    public HamburgerBuilder newInstance() {
        this.hamburger = new Hamburger();
        return this;
    }

    @Override
    public HamburgerBuilder bun(int amount) {
        hamburger.setBun(amount);
        return this;
    }

    @Override
    public HamburgerBuilder patty(int amount) {
        hamburger.setPatty(amount);
        return this;
    }

    @Override
    public HamburgerBuilder cheese(int amount) {
        hamburger.setCheese(amount);
        return this;
    }

    @Override
    public HamburgerBuilder onion(int amount) {
        hamburger.setOnion(amount);
        return this;
    }

    @Override
    public HamburgerBuilder bacon(int amount) {
        hamburger.setBacon(amount);
        return this;
    }

    @Override
    public HamburgerBuilder lettuce(int amount) {
        hamburger.setLettuce(amount);
        return this;
    }

    @Override
    public HamburgerBuilder pickle(int amount) {
        hamburger.setPickle(amount);
        return this;
    }

    @Override
    public HamburgerBuilder sauce1(int amount) {
        hamburger.setSauce1(amount);
        return this;
    }

    @Override
    public HamburgerBuilder sauce2(int amount) {
        hamburger.setSauce2(amount);
        return this;
    }

    @Override
    public HamburgerBuilder sauce3(int amount) {
        hamburger.setSauce3(amount);
        return this;
    }

    @Override
    public Hamburger build() {
        return new Hamburger(
            this.hamburger.getBun(),
            this.hamburger.getPatty(),
            this.hamburger.getCheese(),
            this.hamburger.getOnion(),
            this.hamburger.getBacon(),
            this.hamburger.getLettuce(),
            this.hamburger.getPickle(),
            this.hamburger.getSauce1(),
            this.hamburger.getSauce2(),
            this.hamburger.getSauce3());
    }
}
