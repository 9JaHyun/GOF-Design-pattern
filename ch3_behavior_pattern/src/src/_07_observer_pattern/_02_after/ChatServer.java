package src._07_observer_pattern._02_after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber) {
        if (this.subscribers.get(subject) != null) {
            this.subscribers.get(subject).add(subscriber);
        } else {
            List<Subscriber> subscribers = new ArrayList<>();
            subscribers.add(subscriber);
            this.subscribers.put(subject, subscribers);
        }
    }

    public void unsubscribe(String subject, Subscriber subscriber) {
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).remove(subscriber);
        }
    }

    // 메시지 전파
    public void sendMessage(User user, String subject, String message) {
        if (this.subscribers.containsKey(subject)) {
            String userMessage = user.getName() + ": " + message;
            this.subscribers.get(subject).forEach(s -> s.handleMessage(userMessage));
        }
    }


}
