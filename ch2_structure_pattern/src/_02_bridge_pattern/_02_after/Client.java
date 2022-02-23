package _02_bridge_pattern._02_after;

import _02_bridge_pattern._02_after.material.Diamond;
import _02_bridge_pattern._02_after.material.Iron;
import _02_bridge_pattern._02_after.material.Wood;
import _02_bridge_pattern._02_after.tool.Axe;
import _02_bridge_pattern._02_after.tool.PickAxe;
import _02_bridge_pattern._02_after.tool.Sword;

public class Client {

    public static void main(String[] args) {
        Axe woodAxe = new Axe(new Wood());
        Axe ironAxe = new Axe(new Iron());
        Axe diamondAxe = new Axe(new Diamond());

        PickAxe woodPickAxe = new PickAxe(new Wood());
        PickAxe ironPickAxe = new PickAxe(new Iron());
        PickAxe diamondPickAxe = new PickAxe(new Diamond());

        Sword woodSword = new Sword(new Wood());
        Sword ironSword = new Sword(new Iron());
        Sword diamondSword = new Sword(new Diamond());

        woodAxe.usingTool();
        ironAxe.usingTool();
        diamondAxe.usingTool();

        woodPickAxe.usingTool();
        ironPickAxe.usingTool();
        diamondPickAxe.usingTool();

        woodSword.usingTool();
        ironSword.usingTool();
        diamondSword.usingTool();
    }
}
