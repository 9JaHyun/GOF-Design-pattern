package _05_facade_pattern._02_after;

public class AGameStarter implements GameStarter{

    private User user;

    public AGameStarter(User user) {
        this.user = user;
    }

    @Override
    public void startGame(Map map, Character character) {
        System.out.println("[AGame]" + map.getTerrain() + " - 지형 지물 로딩하는중...");
        System.out.println("[AGame]" + map.getMonster() + " - 무시무시한 몬스터 생성중...");
        System.out.println("[AGame]" + map.getNpc() + " - NPC 생성 중...");
        System.out.println("[AGame]" + map.getItem() + " - 전역에 보물상자 뿌리는 중");
        System.out.println("[AGame]" + character.getStatus() + " - 캐릭터 정보 불러우는 중..");
        System.out.println("[AGame]" + character.getInventory() + " - 인벤토리 불러오는 중..");
        System.out.println("[AGame]" + character.getInventory() + " - 인벤토리 불러오는 중..");
        System.out.println("=====================================");
        System.out.println("환영합니다" + user.getNickName() + "님!");
    }
}
