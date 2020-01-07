package Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new Subscriber());
        subject.addObserver(new AnotherSubscriber());

        subject.notifySubscribes();
    }
}
