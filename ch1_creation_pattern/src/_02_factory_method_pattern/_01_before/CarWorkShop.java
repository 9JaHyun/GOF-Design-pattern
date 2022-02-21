package _02_factory_method_pattern._01_before;

import java.util.UUID;

public class CarWorkShop {

    public void createCar(String type) {
        validate(type);
        System.out.println("차 생산 준비 완료");
        Car car = new Car();
        String carNumber = UUID.randomUUID().toString().substring(0, 4);
        car.setCarNumber(carNumber);

        // 만약 클래스를 추가하거나 수정해야 하는 경우 CarWorkShop의 수정이 불가피해진다.
        // OCP 위반
        switch (type) {
            case "suv" -> car.setType("suv");
            case "sport" -> car.setType("sport");
            case "classic" -> car.setType("classic");
        }

        System.out.println("차 생산 완료!");
        System.out.println(car);
    }

    private void validate(String type) {
        if (type.isBlank()) {
            throw new IllegalArgumentException("차종이 비어있습니다.");
        }
    }
}
