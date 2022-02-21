package _01_singleton_pattern;

public class MultiThreadSingleton {

    public static void main(String[] args) {
        Thread t1 = new Thread(
            () -> {
                System.out.println(SingletonV2.getInstance());
            }
        );
        Thread t2 = new Thread(
            () -> {
                System.out.println(SingletonV2.getInstance());
            }
        );
        t1.start();
        t2.start();
    }
}
