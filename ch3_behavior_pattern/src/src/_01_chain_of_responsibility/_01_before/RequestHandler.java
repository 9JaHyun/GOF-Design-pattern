package src._01_chain_of_responsibility._01_before;

public class RequestHandler {

    public void handler(Request request) {
//        System.out.println("인증중..."); => 이렇게 원 handler에서 기능을 추가하는 것은 OCP 위반
        System.out.println(request.getBody());
    }
}
