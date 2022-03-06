package src._10_template_method_pattern._02_after;


public class PlusProcessor extends FileProcessor {

    public PlusProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int num)  {
        result += num;
        return result;
    }
}
