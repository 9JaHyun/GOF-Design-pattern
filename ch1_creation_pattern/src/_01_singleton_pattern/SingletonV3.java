package _01_singleton_pattern;

// Case2: Static Inner Class (홀더에 의한 초기화 방식)
public class SingletonV3 {
    private SingletonV3() {
    }

    private static class SingletonHolder {
        private static final SingletonV3 INSTANCE = new SingletonV3();
    }

    public static SingletonV3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
