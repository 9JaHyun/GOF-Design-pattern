package _01_singleton_pattern;

// 리플렉션도 막을 수 있는 가장 간단한 방법은 Enum을 사용하는 것이다.
// 이 경우에는 Enum을 제외한 다른 객체를 상속받을 수 없기 때문에 주의가 필요하다.
public enum EnumSingleton {
    INSTANCE
}
