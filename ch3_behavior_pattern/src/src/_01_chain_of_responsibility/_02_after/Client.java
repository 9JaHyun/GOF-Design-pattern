package src._01_chain_of_responsibility._02_after;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doHandle(Request request) {
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        Client client = new Client(
              new LoggingRequestHandler(new AuthRequestHandler(new MainRequestHandler(null))));

        Request request = new Request("인증키를 담지 않은 Body");

        Request authRequest = new Request("인증키를 담은 Body");
        authRequest.setAuthKey("인증키1");
        client.doHandle(request);
        client.doHandle(authRequest);
    }
}
