package src._11_visitor_pattern._02_after;

// 2차 Dispatch
public interface Device {
    void print(Rectangle rectangle);
    void print(Triangle triangle);
}
