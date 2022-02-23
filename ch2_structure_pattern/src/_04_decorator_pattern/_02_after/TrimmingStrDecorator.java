package _04_decorator_pattern._02_after;

// Concrete Decorator
public class TrimmingStrDecorator extends StrDecorator{

    public TrimmingStrDecorator(StrService strService) {
        super(strService);
    }

    @Override
    public void addString(String str) {
        super.addString(str.trim());
    }
}
