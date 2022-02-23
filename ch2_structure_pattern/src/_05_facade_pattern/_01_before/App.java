package _05_facade_pattern._01_before;

import _05_facade_pattern._02_after.User;

public class App {

    public static void main(String[] args) {
        // 대충 로그인 후 계정정보 불러오기
        User user = new User("testUser1");

        // Map Loading
        Map map = new Map();
        map.setTerrain("지형 A");
        map.setMonster("몬스터 A");
        map.setNpc("NPC A");
        map.setItem("ITEM A");

        // Character Loading
        Character character = new Character();
        character.setStatus("Character A");
        character.setInventory("Inventory A");

        App app = new App();
        app.startGame(user, map, character);
    }

    private void startGame(User user, Map map, Character character) {
        System.out.println(map.getTerrain() + " - 지형 지물 로딩하는중...");
        System.out.println(map.getMonster() + " - 무시무시한 몬스터 생성중...");
        System.out.println(map.getNpc() + " - NPC 생성 중...");
        System.out.println(map.getItem() + " - 전역에 보물상자 뿌리는 중");
        System.out.println(character.getStatus() + " - 캐릭터 정보 불러우는 중..");
        System.out.println(character.getInventory() + " - 인벤토리 불러오는 중..");
        System.out.println(character.getInventory() + " - 인벤토리 불러오는 중..");
        System.out.println("=====================================");
        System.out.println("환영합니다" + user.getNickName() + "님!");
    }
}
