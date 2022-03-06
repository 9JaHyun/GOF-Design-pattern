package src._07_observer_pattern._02_after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("user1");
        User user2 = new User("user2");

        chatServer.register("디자인패턴", user1);
        chatServer.register("디자인패턴", user2);

        chatServer.register("스프링", user1);

        chatServer.sendMessage(user1, "디자인패턴", "옵저버 패턴을 아시나요?");
        chatServer.sendMessage(user1, "스프링", "다음에는 스프링을 배워보죠");
        chatServer.sendMessage(user2, "디자인패턴", "그게 뭔가요?");

    }
}
