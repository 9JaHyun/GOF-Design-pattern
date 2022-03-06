package src._03_interpreter_pattern.example;

import java.util.regex.Pattern;

public class InterpreterInJava {

    // 대표적인 예시 1. Compiler
    // 대표적인 예시 2. 정규표현식
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".pr...", "spring"));
        System.out.println(Pattern.matches("[a-z]{6}", "spring"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "a.txt"));
    }
}
