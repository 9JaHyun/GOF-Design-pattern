package src._07_observer_pattern.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeExample {

    static class User implements PropertyChangeListener {

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            System.out.println(evt.getNewValue());
        }
    }

    static class Subject {

        PropertyChangeSupport support = new PropertyChangeSupport(this);

        public void addObserver(PropertyChangeListener observer) {
            support.addPropertyChangeListener(observer);
        }

        public void removeObserver(PropertyChangeListener observer) {
            support.removePropertyChangeListener(observer);
        }

        public void add(String message) {
            support.firePropertyChange("eventName", null, message);
        }

        public static void main(String[] args) {
            Subject subject = new Subject();
            User observer = new User();
            subject.addObserver(observer);
            subject.add("옵저버 패턴 예제 코드");
            subject.removeObserver(observer);
            subject.add("remove 후 더이상 볼수 없다.");
        }
    }



}