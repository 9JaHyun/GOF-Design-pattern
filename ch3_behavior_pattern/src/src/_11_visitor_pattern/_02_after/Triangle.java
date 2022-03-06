package src._11_visitor_pattern._02_after;

public class Triangle implements Shape {
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
