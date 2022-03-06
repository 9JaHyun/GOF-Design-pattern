package src._01_chain_of_responsibility._02_after;

public class LoggingRequestHandler extends RequestHandler{

    public LoggingRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로그 남기는 중..");
        super.handle(request);
    }
}
