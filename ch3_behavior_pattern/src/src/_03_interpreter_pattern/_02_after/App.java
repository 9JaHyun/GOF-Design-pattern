package src._03_interpreter_pattern._02_after;

import _03_interpreter_pattern._01_before.PostfixNotation;
import java.util.Map;

/* Interpreter Pattern
    - 자주 등장하는 문제를 간단한 언어로 정의하고 재사용하는 패턴.

    - 장점
        - 자주 등장하는 문제 패턴을 언어와 문법으로 정의
        - 기존 코드를 변경하지 않고 새로운 Expression을 추가할 수 있다.  => Parser 는 당연히 영향을 받는다.

    - 단점
        - 문법의 복잡도와 코드의 복잡도가 비례한다.(Expression, Parser  복잡해짐)
 */
public class App {

    public static void main(String[] args) {
        PostfixExpression expressoion = PostfixParser.parse("xyz+-");
        int result = expressoion.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println(result);
    }

}
