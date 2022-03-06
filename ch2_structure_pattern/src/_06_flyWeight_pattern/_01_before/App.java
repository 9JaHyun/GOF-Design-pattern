package _06_flyWeight_pattern._01_before;


/**
 * Fly Weight INTENT: 인스턴스 생성 시 자주 변하는 속성과, 변하지 않는 속성을 나눠 [변하지 않는 공통되는 요소들을 묶어] 공유해 제공 => 이 방법을 사용하면
 * 메모리 사용량을 줄일 수 있어 복싱 체급 중 가벼운체급인 Fly Weight를 차용해 작명. => 굉장히 많은 인스턴스를 생성하는 애플리케이션에서 사용된다.
 * <p>
 * 사용 방법 1. 자주 변하는 속성이나 외적인 속성(extrinsit), 변하지 않는 속성이나 내적인 속성(intrinsit)을 분리 2. 변하지 않는 속성을 재사용
 */
public class App {

    public static void main(String[] args) {
//        Phone phone = new Phone(new Camera("고화소 카메라"), new Cpu("정말 좋은 CPU"), new Memory("16"),
//              new Display("번쩍번쩍 Display"), new Wifi("좋은 Wifi"),
//              new Bluetooth("4.0"), new ControlButton("전원버튼"), new Charge("C타입"),
//              new PhoneCall("잘들리는 전화기"));
    }
}
