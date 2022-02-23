package _06_flyWeight_pattern._01_before;

public class App {

    public static void main(String[] args) {
        // 현재 앞의 value를 제외하고는 모두 같은 상태.
        new Character("h", "white", "Godic", 12);
        new Character("e", "white", "Godic", 12);
        new Character("l", "white", "Godic", 12);
        new Character("l", "white", "Godic", 12);
        new Character("o", "white", "Godic", 12);
    }
}
