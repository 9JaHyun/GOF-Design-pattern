package _02_factory_method_pattern._02_after;

public class SUVFactory implements CarFactory {

    @Override
    public Car selectType() {
        return new Suv();
    }
}
