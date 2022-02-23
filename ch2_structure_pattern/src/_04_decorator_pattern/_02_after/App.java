package _04_decorator_pattern._02_after;

public class App {
    private static final boolean ENABLED_STAR_SERVICE = true;
    private static final boolean ENABLED_TRIMMING_SERVICE = true;

    private StrService strService;

    public static void main(String[] args) {
        // 딱 공통적으로 실행하는 MainService 부터 실행
        StrService strService = new MainStrService();
        // 순서가 중요하다. => Trim이 가장 먼저가 아니면, 공백을 지우지 못함.
//        if (ENABLED_TRIMMING_SERVICE) {
//            strService = new TrimmingStrDecorator(strService);
//        }
        if (ENABLED_STAR_SERVICE) {
            strService = new StarStrDecorator(strService);
        }
        if (ENABLED_TRIMMING_SERVICE) {
            strService = new TrimmingStrDecorator(strService);
        }

        Client client = new Client(strService);

        client.printString("  디자인패턴      ");
        client.printString("   재밋다!  ");
    }
}
