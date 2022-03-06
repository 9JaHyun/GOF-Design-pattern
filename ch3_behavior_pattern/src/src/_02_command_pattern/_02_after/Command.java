package src._02_command_pattern._02_after;

public interface Command {

    void execute();

    // 실행 취소 기능
    void undo();
}
