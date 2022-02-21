package _04_builder_pattern._01_before_;

public class Client {

    public static void main(String[] args) {
        Hamburger cheeseBurger = new Hamburger
            (true, true, true, true, false, true,
                true, true, false, false);

        Hamburger baconBurger = new Hamburger
            (true, true, true, true, false, true,
                true, true, false, false);

        Hamburger burger1955 = new Hamburger();
        burger1955.setBun(true);
        burger1955.setPatty(true);
        burger1955.setCheese(false);
        burger1955.setOnion(true);
        burger1955.setBacon(false);
        burger1955.setLettuce(true);
        burger1955.setSauce1(false);
        burger1955.setSauce2(false);
        burger1955.setSauce3(true);
    }
}
