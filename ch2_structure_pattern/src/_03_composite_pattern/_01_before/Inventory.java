package _03_composite_pattern._01_before;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList();
    }

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
