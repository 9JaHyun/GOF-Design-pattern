package _02_factory_method_pattern._01_before;

public class Client {

    public static void main(String[] args) {
        CarWorkShop carWorkShop = new CarWorkShop();
        carWorkShop.createCar("suv");
    }
}
