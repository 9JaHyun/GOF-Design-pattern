package _04_decorator_pattern._02_after;

public class Client {

    private StrService strService;

    public Client(StrService strService) {
        this.strService = strService;
    }

    public void printString(String str) {
        strService.addString(str);
    }
}
