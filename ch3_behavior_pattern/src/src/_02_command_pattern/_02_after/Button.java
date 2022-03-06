package src._02_command_pattern._02_after;

import _02_command_pattern._01_before.Game;
import _02_command_pattern._01_before.Light;
import java.util.Stack;

/* Command 패턴
    - 요청을 캡슐화하여 호출자(Invoker)와 수신자(Receiver)을 분리하는 패턴

    장점
        - 기존 코드를 변경하지 않고 새로운 커맨드를 만들 수 있다.
        - 수신자의 코드가 변경되어도 호출자의 코드는 변경되지 않는다.
        - 커맨드 객체를 로깅, DB, 네트워크 전송 등 다양한 방법으로 활용할 수 있다.

    단점
        - 클래스가 많아진다. (살짝 조삼모사의 느낌도 없지않아 있다.)
 */

// Invoker
public class Button {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        // Invoker 가 바뀌지 않아도 된다.
        // 내부의 ConcreteCommand 만 변경.
        Button button = new Button();
        button.press(new LightOnCommand(new Light()));
        button.press(new GameStartCommand(new Game()));
        button.undo();
        button.undo();
    }
}
