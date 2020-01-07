package State;

public class Subject {
    private State state;

    Subject(State state){
        this.state = state;
    }

    public void changeState(State state){
        this.state = state;
        this.state.changeState();
    }
}
