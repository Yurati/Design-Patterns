package Decorator;

public class Demonstration {
    public static void main(String[] args) {
        Decorator decorator = new DecoratorImplementation1(new Implementation());
        decorator.decorate();

        Decorator decoratorWithAddedBehaviour = new DecoratorImplementation2(decorator);
        decoratorWithAddedBehaviour.decorate();

        Decorator moreBehaviour = new DecoratorImplementation1(decoratorWithAddedBehaviour);
        moreBehaviour.decorate();
    }
}
