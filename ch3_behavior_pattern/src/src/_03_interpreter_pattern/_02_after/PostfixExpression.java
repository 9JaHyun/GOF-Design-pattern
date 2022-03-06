package src._03_interpreter_pattern._02_after;

import java.util.Map;

public interface PostfixExpression {
    // 해당 Expression을 구현하는 Terminal, Nonterminal 구현
    int interpret(Map<Character, Integer> context);


    // 2번째 방법. Implements 대신 Static 메서드 정의 후 Parser에서 사용
    static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    static PostfixExpression multiply(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) * right.interpret(context);
    }

    static PostfixExpression variable(Character c) {
        return context -> context.get(c);
    }
}
