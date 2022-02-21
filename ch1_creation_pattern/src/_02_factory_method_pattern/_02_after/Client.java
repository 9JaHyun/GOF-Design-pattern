package _02_factory_method_pattern._02_after;

// 객체 생산을 서브클래스가 결정하도록 위임
// CarFactory 인터페이스를 따로 고지지 않고 클래스를 추가만 해주면 된다.(OCP)
// 단점으로는 코드가 조금 장황해진다.
public class Client {
    private final CarFactory carFactory;

    public Client(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public void orderCar(CarFactory carFactory) {
        carFactory.createCar();
    }

    public static void main(String[] args) {
        Client client = new Client(new SportCarFactory());
        client.orderCar(new SportCarFactory());
        client.orderCar(new SUVFactory());
    }


}
