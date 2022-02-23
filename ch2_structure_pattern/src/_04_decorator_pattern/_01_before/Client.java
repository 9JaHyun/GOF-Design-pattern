package _04_decorator_pattern._01_before;

public class Client {

    private StrService strService;

    public Client(StrService strService) {
        this.strService = strService;
    }

    private void printString(String str) {
        strService.addString(str);
    }

    public static void main(String[] args) {
        Client starServiceClient = new Client(new StarStrService());
        Client trimServiceClient = new Client(new TrimmingStrService());

        starServiceClient.printString("디자인패턴");
        starServiceClient.printString("재밋다!");

        trimServiceClient.printString("   디자인패턴  ");
        trimServiceClient.printString("        재밋다!  ");
    }
}
