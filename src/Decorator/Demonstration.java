package Decorator;

public class Demonstration {
    public static void main(String[] args) {
        Component cp = new DecoratorImpl3(new DecoratorImpl2(new DecoratorImpl1("First"), new DecoratorImpl1("Second")), new DecoratorImpl1("Aaa"));
        cp.decorate();
    }
}
