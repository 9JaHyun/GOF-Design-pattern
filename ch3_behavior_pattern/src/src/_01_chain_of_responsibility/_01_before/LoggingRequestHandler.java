package src._01_chain_of_responsibility._01_before;

public class LoggingRequestHandler extends RequestHandler{

    @Override
    public void handler(Request request) {
        System.out.println("로그 남기는 중..");
        super.handler(request);
    }
}
