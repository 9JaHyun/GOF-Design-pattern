package src._06_memento_pattern._02_after;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);
        System.out.println(game);

        GameSave save = game.save();

        game.setRedTeamScore(30);
        game.setBlueTeamScore(100);
        System.out.println(game);

        game.restore(save);
        System.out.println(game);
    }

}
