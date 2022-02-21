package _01_singleton_pattern;

// SingletonV1의 동시성 문제를 해결하기 위한 동시성 제어 프로그래밍
// Case1: Double Check Locking
public class SingletonV2 {
    // Main & CPU 메모리 동기화를 위한 volatile 키워드 사용
    private static volatile SingletonV2 instance;
    private SingletonV2() {

    }

    public static SingletonV2 getInstance() {
        if (instance == null) {
            synchronized (SingletonV2.class) {
                // Double-Check
                if (instance == null) {
                    instance = new SingletonV2();
                }
            }
        }
        return instance;
    }
}
