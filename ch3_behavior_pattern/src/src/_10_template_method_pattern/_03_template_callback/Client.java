package src._10_template_method_pattern._03_template_callback;

/* Template Method
    일련의 로직을 템플릿으로 저장해 실행하는 방법.
    이전의 팩토리 메서드와 유사하다.
 */
public class Client {

    public static void main(String[] args) {
        FileProcessorTemplate fileProcessorTemplate = new FileProcessorTemplate(
              "C:\\Users\\rnwkg\\codding\\GOF-DesignPattern\\ch3_behavioral-pattern\\src\\_10_template_method_pattern\\_01_before\\a.txt");
        System.out.println(fileProcessorTemplate.process(new PlusProcessor()));
        System.out.println(fileProcessorTemplate.process((a, b) -> a *= b));
    }
}
