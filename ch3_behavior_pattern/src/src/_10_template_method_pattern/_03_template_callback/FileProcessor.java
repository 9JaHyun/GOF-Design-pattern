package src._10_template_method_pattern._03_template_callback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface FileProcessor {
    int getResult(int result, int num);
}
