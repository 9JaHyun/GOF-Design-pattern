package _06_flyWeight_pattern;

public class FlyweightInJava {

    public static void main(String[] args) {
        // 정적 팩토리 메서드 valueOf() 일정범위의 값들은 캐싱을 사용한다. => Flyweight
        Integer i1 = Integer.valueOf(5);
        Integer i2 = Integer.valueOf(5);
        System.out.println(i1 == i2); // 캐싱되어 있기 때문에 동일성 '==' 비교가 참이 나온다.
    }
}
