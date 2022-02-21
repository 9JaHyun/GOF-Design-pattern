package _01_singleton_pattern;

import java.io.Serializable;

// 싱글톤 클래스에 직렬화 기능을 추가하면 싱글톤이 깨질 수 있다.
// 이를 방지하기 위해서는 모든 필드를 trasient로 선언하고 readResolve 메서드를 추가해야 한다.
public class SingletonV5 implements Serializable {
    private static final SingletonV5 INSTANCE = new SingletonV5();

    private SingletonV5() {
    }

    public static SingletonV5 getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return getInstance();
    }
}
