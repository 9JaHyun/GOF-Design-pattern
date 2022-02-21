package _01_singleton_pattern;

// 싱글톤을 유지하기 위해서는 private 생성자를 통해 인스턴스 생성을 막아야 한다.
public class SingletonV1 {
    private static SingletonV1 instance;

    private SingletonV1() {}

    // 하지만 이렇게 되면 동시성의 위험성이 존재한다.
    public static SingletonV1 getInstance() {
        if (instance == null) {                 // 2) Thread2가 이를 통과한다면?
            instance = new SingletonV1();       // 1) Thread1이 new 생성을 하기 직전에....
        }
        return instance;                        // 3) 첫번째로 생성한 Instance와 두번째로 생성한 Instance가 다르다
    }
}
