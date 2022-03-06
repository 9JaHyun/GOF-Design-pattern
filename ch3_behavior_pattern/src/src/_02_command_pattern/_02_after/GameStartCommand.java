package src._02_command_pattern._02_after;

import _02_command_pattern._01_before.Game;

public class GameStartCommand implements Command{

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }

    @Override
    public void undo() {
        new GameEndCommand(this.game).execute();
    }
}
