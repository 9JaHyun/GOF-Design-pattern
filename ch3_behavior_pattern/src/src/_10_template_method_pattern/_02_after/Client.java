package src._10_template_method_pattern._02_after;

/* Template Method
    일련의 로직을 템플릿으로 저장해 실행하는 방법. (By 상속)
    이전의 팩토리 메서드와 유사하다.

    - 장점
        템플릿 코드를 재사용하고 중복 코드를 줄일 수 있다.
        템플릿 코드를 변경하지 않고 상속을 받아서 알고리즘만 변경하면 된다.

    - 단점
        리스코프 치환 원칙을 위반할 수 있다.
        알고리즘 구조가 복잡할 수록 템플릿을 유지하기 어려워진다.
 */
public class Client {

    public static void main(String[] args) {
        int result = new MultiplyProcessor(
              "C:\\Users\\rnwkg\\codding\\GOF-DesignPattern\\ch3_behavioral-pattern\\src\\_10_template_method_pattern\\_01_before\\a.txt").process();
        System.out.println(result);
    }
}
