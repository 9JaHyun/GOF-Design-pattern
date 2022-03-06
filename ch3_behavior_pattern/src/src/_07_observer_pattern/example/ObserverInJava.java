package src._07_observer_pattern.example;

import java.util.Observable;
import java.util.Observer;

public class ObserverInJava {

    // 사용 권장 안함(JAVA9)
    static class User implements Observer {

        @Override
        public void update(Observable o, Object arg) {
            System.out.println(arg);
        }
    }

    // 사용 권장 안함(JAVA9)
    static class Subject extends Observable {
        public void add(String message) {
            setChanged();
            notifyObservers(message);
            setChanged();   // 항상 변경 되었음을 명시해주어야 함.
            notifyObservers(message);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        User user = new User();
        subject.addObserver(user);
        subject.add("Hello Observer");
    }

}
