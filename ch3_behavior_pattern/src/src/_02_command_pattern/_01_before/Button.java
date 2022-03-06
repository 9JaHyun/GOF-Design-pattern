package src._02_command_pattern._01_before;

// 요청을 호출하는 쪽과 수신자 쪽의 결합을 느슨하게 만들어 주는 패턴
// 요청을 객체의 형태로 캡슐화하여 서로 요청이 다른 사용자의 파라미터화, 저장, 로깅, 취소를 지원하는 패턴
public class Button {

    // 결합력이 너무 강하다.
    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    // Press를 다른 동작으로 바꾸기 위해서는 해당 코드를 수정해야 한다.
    public void press() {
        light.on();
    }
}
