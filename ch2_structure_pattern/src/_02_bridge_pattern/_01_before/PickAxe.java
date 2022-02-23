package _02_bridge_pattern._01_before;

public class PickAxe implements Tool {
    @Override
    public void usingTool() {
        System.out.println("곡괭이를 사용합니다.");
    }
}

class WoodPickAxe extends PickAxe {

    @Override
    public void usingTool() {
        System.out.println("나무 곡괭이를 사용합니다.");
    }
}


class StonePickAxe extends PickAxe {

    @Override
    public void usingTool() {
        System.out.println("돌 곡괭이를 사용합니다.");
    }
}


class SteelPickAxe extends PickAxe {

    @Override
    public void usingTool() {
        System.out.println("철 곡괭이를 사용합니다.");
    }
}


class GoldPickAxe extends PickAxe {

    @Override
    public void usingTool() {
        System.out.println("금 곡괭이를 사용합니다.");
    }
}


class DiamondPickAxe extends PickAxe {

    @Override
    public void usingTool() {
        System.out.println("다이아몬드 곡괭이를 사용합니다.");
    }
}
