package src._03_interpreter_pattern._01_before;

import java.util.Stack;

// Infix: 1 + 2 - 5
// Postfix: 1 2 5 + - (연산 문자가 뒤로 옴)
public class PostfixNotation {

    private final String expression;

    public PostfixNotation(String expression) {
        this.expression = expression;
    }

    public static void main(String[] args) {
        // 만약 이런 식을 자주 사용한다면?? => Interpreter_Pattern 고려
        PostfixNotation postfixNotation = new PostfixNotation("123+-");


        postfixNotation.calculate();
    }

    private void calculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                    break;
                default:
                    numbers.push(Integer.parseInt(c + ""));
            }
            System.out.println(numbers.pop());
        }
    }
}
