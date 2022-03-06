package src._07_observer_pattern.example;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

public class FlowInJava {

    public static void main(String[] args) {
        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {

            @Override
            public void subscribe(Subscriber<? super String> subscriber) {
                subscriber.onNext("hello FLow");
                subscriber.onComplete();
            }
        };

        Subscriber<String> subscriber = new Subscriber<>() {

            @Override
            public void onSubscribe(Subscription subscription) {

            }

            @Override
            public void onNext(String item) {
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };
        publisher.subscribe(subscriber);

        // 비동기 처리 장담을 못함.
        ((SubmissionPublisher) publisher).submit("hello java");
        System.out.println("이게 출력이 되기 전에 이미 처리가 다 끝남.");
    }

}
