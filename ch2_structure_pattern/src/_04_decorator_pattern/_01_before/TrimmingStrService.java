package _04_decorator_pattern._01_before;

public class TrimmingStrService extends StrService {

    @Override
    public void addString(String str) {
        super.addString(str.trim());
    }
}
