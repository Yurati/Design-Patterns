package Observer;

public class AnotherSubscriber implements Observer {
    @Override
    public void update() {
        System.out.println("Another subscriber");
    }
}
