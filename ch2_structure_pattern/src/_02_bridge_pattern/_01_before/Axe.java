package _02_bridge_pattern._01_before;

public class Axe implements Tool {
    @Override
    public void usingTool() {
        System.out.println("도끼를 사용합니다.");
    }
}

class WoodAxe extends Axe {

    @Override
    public void usingTool() {
        System.out.println("나무 도끼를 사용합니다.");
    }
}


class StoneAxe extends Axe {

    @Override
    public void usingTool() {
        System.out.println("돌 도끼를 사용합니다.");
    }
}


class SteelAxe extends Axe {

    @Override
    public void usingTool() {
        System.out.println("철 도끼를 사용합니다.");
    }
}


class GoldAxe extends Axe {

    @Override
    public void usingTool() {
        System.out.println("금 도끼를 사용합니다.");
    }
}


class DiamondAxe extends Axe {

    @Override
    public void usingTool() {
        System.out.println("다이아몬드 도끼를 사용합니다.");
    }
}
