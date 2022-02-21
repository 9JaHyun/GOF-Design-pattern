package _03_abstract_factory_pattern.keyboard;

public class LGKeyBoard extends KeyBoard {
    private String type;

    public LGKeyBoard() {
        this.type = "LG 키보드";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "LGKeyBoard{" +
            "type='" + type + '\'' +
            '}';
    }
}
