package adapter_pattern;

import adapter_pattern.adaptee.Adaptee1Impl;
import adapter_pattern.adaptee.Adaptee2Impl;
import adapter_pattern.adaptee.Adaptee3Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Adapter {
    private Map<String, Object> adapteeList = new HashMap<>();

    public void init() {
        adapteeList.put("adaptee1", new Adaptee1Impl());
        adapteeList.put("adaptee2", new Adaptee2Impl());
        adapteeList.put("adaptee3", new Adaptee3Impl());
    }

    // Change Interface
    public void runAdaptee(String adapteeName) {
        Object adapter = adapteeList.get(adapteeName);
        if (adapter == null) {
            throw new AssertionError("Not Found...");
        }
    }
}
