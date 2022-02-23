package _02_bridge_pattern._02_after.tool;

import _02_bridge_pattern._01_before.Tool;
import _02_bridge_pattern._02_after.material.Material;

public class DefaultTool implements Tool {

    private String name;
    private Material material;

    public DefaultTool(String name, Material material) {
        this.name = name;
        this.material = material;
    }

    @Override
    public void usingTool() {
        System.out.printf("%s %s를 사용합니다.\n", material.getName(), name);
    }
}
