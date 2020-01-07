package State;

public class LowState implements State {
    @Override
    public void changeState() {
        System.out.println("Low State");
    }
}
