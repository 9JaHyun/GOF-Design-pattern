package _02_bridge_pattern._02_after.tool;

import _02_bridge_pattern._02_after.material.Material;

public class PickAxe extends DefaultTool{

    public PickAxe(Material material) {
        super("곡괭이", material);
    }
}
