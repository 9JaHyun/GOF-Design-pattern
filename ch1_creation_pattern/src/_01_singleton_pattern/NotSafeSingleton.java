package _01_singleton_pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// 싱글톤이 깨질 수 있는 경우
public class NotSafeSingleton {

    public static void main(String[] args)
        throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        byReflection();
        bySerialization();
    }

    private static void byReflection()
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonV4 singleton1 = SingletonV4.getInstance();
        SingletonV4 singleton2 = SingletonV4.getInstance();
        Constructor<SingletonV4> constructor = SingletonV4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonV4 singleton3 = constructor.newInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1 == singleton3);
        System.out.println(singleton2 == singleton3);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton3.hashCode());
    }

    // 직렬화 이후 역직렬화를 사용하면 새로운 인스턴스를 생성한다.
    // 이럴 경우에는 직렬화를 구현하는 싱글톤 클래스에서 readResolve() 메서드를 추가해야 한다.
    private static void bySerialization() {
        SingletonV5 singleton1 = SingletonV5.getInstance();
        SingletonV5 singleton2 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singletonV5"))) {
            out.writeObject(singleton1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("singletonV5"))) {
            singleton2 = (SingletonV5) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // SingletonV5의 readResolve()를 지우고 테스트
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
