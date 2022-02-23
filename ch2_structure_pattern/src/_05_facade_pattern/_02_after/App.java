package _05_facade_pattern._02_after;

public class App {

    public static void main(String[] args) {
        User user = new User("testUser1");
        Map map = new Map("지형A", "몬스터A", "npcA", "아이템A");
        Character character = new Character("상태정보 A", "소지품A");

        GameStarter aGameStarter = new AGameStarter(user);
        aGameStarter.startGame(map, character);
        GameStarter bGameStarter = new BGameStarter(user);
        bGameStarter.startGame(map, character);
    }
}
