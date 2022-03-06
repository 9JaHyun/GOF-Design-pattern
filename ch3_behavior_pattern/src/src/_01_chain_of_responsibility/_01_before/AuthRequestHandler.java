package src._01_chain_of_responsibility._01_before;

// 2번째 방법. 기본 동작을 하는 클래스를 Extends 해서 확장
public class AuthRequestHandler extends RequestHandler{

    // 문제점1. 기능마다 그러면 클래스들을 무한정으로 만들어야 한다.
    // 문제점2. 여러 기능을 조합할 경우에도 클래스를 새로 만들어야 한다.
    public void handler(Request request) {
        System.out.println("인증 대기...");
        System.out.println("인증 중.....");
        System.out.println("인증 완료!");
        System.out.println("----------------------------------");
        super.handler(request);

    }

}
