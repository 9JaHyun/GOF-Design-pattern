package src._03_interpreter_pattern._02_after;

import java.util.Map;

// TerminalExpression
public class VariableExpression implements PostfixExpression {

    private Character variable;

    public VariableExpression(Character variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(variable);
    }
}
