package _02_factory_method_pattern._01_before;

public class Car {

    String type;

    String carNumber;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
            "type='" + type + '\'' +
            ", carNumber='" + carNumber + '\'' +
            '}';
    }
}
