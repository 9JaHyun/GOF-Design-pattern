package _04_builder_pattern._02_after_;

public class BurgerDirector {

    private final HamburgerBuilder hamburgerBuilder;

    public BurgerDirector(HamburgerBuilder hamburgerBuilder) {
        this.hamburgerBuilder = hamburgerBuilder;
    }

    public Hamburger makeBaconBurger() {
        return hamburgerBuilder.newInstance()
            .bun(2)
            .patty(1)
            .cheese(1)
            .bacon(3)
            .lettuce(30)   // 30g
            .pickle(5)
            .sauce1(10)
            .build();
    }

    public Hamburger makeCheeseBurger() {
        return hamburgerBuilder.newInstance()
            .bun(2)
            .patty(1)
            .cheese(1)
            .lettuce(30)   // 30g
            .pickle(5)
            .sauce2(10)
            .build();
    }

    public Hamburger makeDoublePattyBurger() {
        return hamburgerBuilder.newInstance()
            .bun(2)
            .patty(2)
            .cheese(2)
            .lettuce(30)   // 30g
            .pickle(5)
            .sauce1(10)
            .sauce3(10)
            .build();
    }
}


