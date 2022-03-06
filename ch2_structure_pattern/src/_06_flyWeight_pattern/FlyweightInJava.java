package _06_flyWeight_pattern;

public class FlyweightInJava {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(5);
        Integer i2 = Integer.valueOf(5);
        System.out.println(i1 == i2);        // True
        System.out.println(i1.equals(i2));   // True

        // 일정범위를 초가하면 새로운 인스턴스로 생성
        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf(200);
        System.out.println(i3 == i4);        // False
        System.out.println(i3.equals(i4));   // True
    }
}
