package _02_factory_method_pattern._02_after;


public class Car {
    private String type;
    private String carNumber;

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


