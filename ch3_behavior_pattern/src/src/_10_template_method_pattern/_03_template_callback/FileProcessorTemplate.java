package src._10_template_method_pattern._03_template_callback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessorTemplate {

    private String path;

    public FileProcessorTemplate(String path) {
        this.path = path;
    }

    public int process(FileProcessor fileProcessor) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 1;
            String line = null;
            while ((line = reader.readLine()) != null) {
                result = fileProcessor.getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);

        }
    }

}
