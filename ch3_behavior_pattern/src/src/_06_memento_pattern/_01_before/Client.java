package src._06_memento_pattern._01_before;

// 캡슐화를 유지하면서 객체 내부 상태를 외부에 저장하는 방법.
public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        // 이렇게 해도 상관없으나....
        // 문제점 -> 클라이언트가 클래스의 정보를 다 알아야 한다.
        // 문제점 -> 이는 내부 정보와 강한 결합이 되어 있다는 말과같다.
        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        Game restoredGame = new Game();
        restoredGame.setBlueTeamScore(blueTeamScore);
        restoredGame.setRedTeamScore(redTeamScore);

    }
}
