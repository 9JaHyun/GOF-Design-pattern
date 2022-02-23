package _04_decorator_pattern._02_after;

// Composite 역할을 수행하는 Decorator
public class StrDecorator implements StrService{

    private StrService strService;

    public StrDecorator(StrService strService) {
        this.strService = strService;
    }

    @Override
    public void addString(String str) {
        strService.addString(str);
    }
}
