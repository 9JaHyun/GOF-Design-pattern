package _03_composite_pattern._02_after;

public class Item implements Component {

    private String name;
    private int amount;

    public Item(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }
}
