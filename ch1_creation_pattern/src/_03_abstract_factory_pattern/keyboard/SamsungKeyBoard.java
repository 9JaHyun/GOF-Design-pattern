package _03_abstract_factory_pattern.keyboard;

public class SamsungKeyBoard extends KeyBoard {
    private String type;

    public SamsungKeyBoard() {
        this.type = "삼성 키보드";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "SamsungKeyBoard{" +
            "type='" + type + '\'' +
            '}';
    }
}
