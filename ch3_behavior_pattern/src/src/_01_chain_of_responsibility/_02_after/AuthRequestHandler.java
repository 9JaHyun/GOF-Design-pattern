package src._01_chain_of_responsibility._02_after;

public class AuthRequestHandler extends RequestHandler{

    public AuthRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증 대기...");
        if (request.getAuthKey() != null) {
            System.out.println("인증 중.....");
            System.out.println("인증 완료!");
            System.out.println("----------------------------------");
            super.handle(request);
        }
        System.out.println("인증 키가 없습니다.");
    }
}
