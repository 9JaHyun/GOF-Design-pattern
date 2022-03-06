package src._01_chain_of_responsibility._02_after;

public abstract class RequestHandler {

    // 연쇄로 이을 필드
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
