package _02_factory_method_pattern._02_after;

import java.util.UUID;

public interface CarFactory {

    default public void createCar() {
        System.out.println("차량 생산 준비 완료");

        // 객체 생성을 세부 클래스에게 넘김.
        Car car = selectType();

        String carNumber = UUID.randomUUID().toString().substring(0, 4);
        car.setCarNumber(carNumber);

        System.out.println("생산 완료!");
        System.out.println("차량 정보: " + car);
        System.out.println("======================");
    }

    public Car selectType();

}
