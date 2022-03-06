package src._11_visitor_pattern._02_after;

// 기존의 코드를 건드리지 않고 기능을 추가하는 패턴
public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        // Double Dispatcher 를 사용하면 상위 타입을 사용할 수 있다.
        Device phone = new Phone();
        rectangle.accept(phone);
    }
}
