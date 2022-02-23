package _03_composite_pattern._02_after;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getAmount() {
        return components.stream()
            .mapToInt(Component::getAmount)
            .sum();
    }
}
