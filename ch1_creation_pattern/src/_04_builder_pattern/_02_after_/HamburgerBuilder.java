package _04_builder_pattern._02_after_;

public interface HamburgerBuilder {

    HamburgerBuilder newInstance();
    HamburgerBuilder bun(int amount);
    HamburgerBuilder patty(int amount);
    HamburgerBuilder cheese(int amount);
    HamburgerBuilder onion(int amount);
    HamburgerBuilder bacon(int amount);
    HamburgerBuilder lettuce(int amount);
    HamburgerBuilder pickle(int amount);
    HamburgerBuilder sauce1(int amount);
    HamburgerBuilder sauce2(int amount);
    HamburgerBuilder sauce3(int amount);

    Hamburger build();
}
