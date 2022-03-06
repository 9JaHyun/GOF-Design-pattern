package src._10_template_method_pattern._03_template_callback;


public class PlusProcessor implements FileProcessor {

    @Override
    public int getResult(int result, int num) {
        result += num;
        return result;
    }
}
