package src._03_interpreter_pattern._02_after;

import static _03_interpreter_pattern._02_after.PostfixExpression.*;

import java.util.Stack;

public class PostfixParser {

    // Parameter: XYZ+-
    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        // 최종 결과 반환
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            default:
                return new VariableExpression(c);
        }
    }

    // Expression Interface에서 Static Method으로 선언한 경우
    private static PostfixExpression getExpression2(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+':
                return plus(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return minus(left, right);
            case '*':
                return multiply(stack.pop(), stack.pop());
            default:
                return variable(c);
        }
    }
}
