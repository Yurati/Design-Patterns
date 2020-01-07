package Flyweight;

public class Flyweight {
    private State state;

    Flyweight(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    void operation(State uniqueState){
        System.out.println("Do sth with unique state");
    }
}
