package Flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        flyweightFactory.getFlyweight(new State(1));
        System.out.println(flyweightFactory.getQuantityOfCached());
        flyweightFactory.getFlyweight(new State(1));
        System.out.println(flyweightFactory.getQuantityOfCached());
        flyweightFactory.getFlyweight(new State(2));
        flyweightFactory.getFlyweight(new State(3));
        System.out.println(flyweightFactory.getQuantityOfCached());
        flyweightFactory.getFlyweight(new State(1));
        System.out.println(flyweightFactory.getQuantityOfCached());

        Context context = new Context(flyweightFactory.getFlyweight((new State(3))), new State(3));
        context.operation();
    }
}
