package _02_bridge_pattern._02_after.tool;

import _02_bridge_pattern._02_after.material.Material;

public class Sword extends Weapon{

    public Sword(Material material) {
        super("검", material);
    }
}
