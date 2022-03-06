package src._01_chain_of_responsibility._02_after;

public class MainRequestHandler extends RequestHandler{

    public MainRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
