package _04_builder_pattern._02_after_;

import _04_builder_pattern._02_after_.InnerHamburger.InnerHamburgerBuilder;

public class Client {

    public static void main(String[] args) {
        Hamburger baconBurger = new DefaultHamburgerBuilder().newInstance()
            .bun(2)
            .patty(1)
            .cheese(1)
            .bacon(3)
            .lettuce(30)   // 30g
            .pickle(5)
            .sauce1(10)
            .build();
        System.out.println(baconBurger);

        InnerHamburger baconBurger2 = new InnerHamburgerBuilder()
            .bun(2)
            .patty(1)
            .cheese(1)
            .bacon(3)
            .lettuce(30)   // 30g
            .pickle(5)
            .sauce1(10)
            .build();

        Hamburger baconBurger1 = new BurgerDirector(new DefaultHamburgerBuilder())
            .makeBaconBurger();
        Hamburger cheeseBurger = new BurgerDirector(new DefaultHamburgerBuilder())
            .makeCheeseBurger();
        Hamburger doublePattyBurger = new BurgerDirector(new DefaultHamburgerBuilder())
            .makeDoublePattyBurger();
    }
}
