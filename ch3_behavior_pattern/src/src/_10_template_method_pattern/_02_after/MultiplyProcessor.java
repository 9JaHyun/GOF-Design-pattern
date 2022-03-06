package src._10_template_method_pattern._02_after;

public class MultiplyProcessor extends FileProcessor{
    public MultiplyProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int num)  {
        result *= num;
        return result;
    }
}
