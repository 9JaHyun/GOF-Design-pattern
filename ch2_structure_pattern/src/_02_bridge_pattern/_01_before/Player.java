package _02_bridge_pattern._01_before;

public class Player {

    public static void main(String[] args) {
        WoodPickAxe woodPickAxe = new WoodPickAxe();
        GoldPickAxe goldPickAxe = new GoldPickAxe();
        DiamondPickAxe diamondPickAxe = new DiamondPickAxe();

        woodPickAxe.usingTool();
        goldPickAxe.usingTool();
        diamondPickAxe.usingTool();
    }
}
