package _02_bridge_pattern._01_before;

public class Shovel implements Tool {
    @Override
    public void usingTool() {
        System.out.println("삽을 사용합니다.");
    }
}

class WoodShovel extends Shovel {

    @Override
    public void usingTool() {
        System.out.println("나무 삽을 사용합니다.");
    }
}


class StoneShovel extends Shovel {

    @Override
    public void usingTool() {
        System.out.println("돌 삽을 사용합니다.");
    }
}


class SteelShovel extends Shovel {

    @Override
    public void usingTool() {
        System.out.println("철 삽을 사용합니다.");
    }
}


class GoldShovel extends Shovel {

    @Override
    public void usingTool() {
        System.out.println("금 삽을 사용합니다.");
    }
}


class DiamondShovel extends Shovel {

    @Override
    public void usingTool() {
        System.out.println("다이아몬드 삽을 사용합니다.");
    }
}
