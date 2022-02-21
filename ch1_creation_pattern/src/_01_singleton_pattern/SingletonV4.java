package _01_singleton_pattern;

// Case3: 미리 선언 (Eager-Loading)
public class SingletonV4 {
    private static final SingletonV4 INSTANCE = new SingletonV4();

    private SingletonV4() {
    }

    public static SingletonV4 getInstance() {
        return INSTANCE;
    }
}
