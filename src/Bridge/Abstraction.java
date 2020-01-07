package Bridge;

public abstract class Abstraction {
    protected Implementation implementation;

    Abstraction(Implementation implementation){
        this.implementation = implementation;
    }
    public abstract void operation();
}
