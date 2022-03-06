package src._11_visitor_pattern._02_after;

// Double Dispatch를 이용하는 방법.
// 1차적으로 Dispatch
public interface Shape {
    void accept(Device device);
}
