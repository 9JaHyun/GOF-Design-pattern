package src._01_chain_of_responsibility._01_before;

/* 책임 연쇄 패턴
        특정한 책임을 가지는 클래스들이 이어져 있다.
        요청을 보내는쪽과 요청을 처리하는 쪽을 분리하는 패턴
        => 어떤 형식이 되었든간에 요청을 처리
 */
public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        // 문제점. 만약 Auth + Logging 모두 사용하고 싶다면?? => 또 클래스를 만들어야 하나?
        // 문제점. 아주 사소한 기능 추가여도 계속 클래스를 생성해야 하는가?
//        RequestHandler requestHandler = new RequestHandler();
//        AuthRequestHandler requestHandler = new AuthRequestHandler();
        LoggingRequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);
    }
}
