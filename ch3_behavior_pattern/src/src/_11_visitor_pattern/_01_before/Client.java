package src._11_visitor_pattern._01_before;

// 기존의 코드를 건드리지 않고 기능을 추가하는 패턴
public class Client {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Phone phone = new Phone();
        rectangle.printTo(phone);
    }
}
