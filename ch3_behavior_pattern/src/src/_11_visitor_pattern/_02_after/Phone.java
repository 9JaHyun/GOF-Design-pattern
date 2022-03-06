package src._11_visitor_pattern._02_after;

public class Phone implements Device {

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle to phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle to phone");
    }
}
