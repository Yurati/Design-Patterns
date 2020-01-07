package State;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject(new HighState());
        subject.changeState(new LowState());
    }
}
