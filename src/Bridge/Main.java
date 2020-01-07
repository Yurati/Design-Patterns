package Bridge;

public class Main {
    public static void main(String[] args) {
        SpecificAbstraction abstraction = new SpecificAbstraction(new ConcreteImpl());
        abstraction.operation();
    }
}
