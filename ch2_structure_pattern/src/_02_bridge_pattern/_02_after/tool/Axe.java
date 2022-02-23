package _02_bridge_pattern._02_after.tool;

import _02_bridge_pattern._02_after.material.Material;

public class Axe extends DefaultTool{

    public Axe(Material material) {
        super("도끼", material);
    }
}
