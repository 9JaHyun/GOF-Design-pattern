package _04_decorator_pattern._01_before;

public class StarStrService extends StrService{

    @Override
    public void addString(String str) {
        super.addString("*****" + str + "*****");
    }
}
