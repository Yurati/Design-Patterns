package Flyweight;

public class State {

    private int state;

    State(int state){
        this.state = state;
    }

    public boolean equals(State state){
        return state.state == this.state;
    }
}
