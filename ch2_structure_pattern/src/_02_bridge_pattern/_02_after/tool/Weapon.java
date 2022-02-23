package _02_bridge_pattern._02_after.tool;

import _02_bridge_pattern._01_before.Tool;
import _02_bridge_pattern._02_after.material.Material;

public class Weapon implements Tool {
    private String name;
    private Material material;

    public Weapon(String name, Material material) {
        this.name = name;
        this.material = material;
    }

    @Override
    public void usingTool() {
        System.out.printf("%s, %s을(를) 사용해서 적을 무찌릅니다. \n", material.getName(), name);
    }
}
