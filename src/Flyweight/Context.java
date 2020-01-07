package Flyweight;

public class Context {
    private State uniqueState;
    private Flyweight flyweight;

    Context(Flyweight flyweight, State uniqueState){
        this.uniqueState = uniqueState;
        this.flyweight = flyweight;
    }

    void operation(){
        flyweight.operation(uniqueState);
    }
}
