package src._07_observer_pattern._01_before;

/* 옵저버 패턴 : 다수의 객체가 특정 객체 상태 변화를 감지하고, 알림을 받는 패턴
    Pub-Sub 패턴에 잘 쓰이는 패턴.
 */
public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User(chatServer);
        user1.sendMessage("디자인패턴", "이번엔 옵저버 패턴입니다.");

        User user2 = new User(chatServer);
        user2.sendMessage("디자인패턴", "옵저버 패턴은 무엇인가요?");

    }
}
