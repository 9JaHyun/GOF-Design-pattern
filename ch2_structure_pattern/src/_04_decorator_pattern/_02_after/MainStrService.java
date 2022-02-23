package _04_decorator_pattern._02_after;

public class MainStrService implements StrService{

    @Override
    public void addString(String str) {
        System.out.println(str);
    }
}
