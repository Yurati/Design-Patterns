package Decorator;

public class DecoratorImplementation1 extends Decorator {
    DecoratorImplementation1(Component decoratorImpl1){
        super(decoratorImpl1);
    }

    @Override
    public void decorate() {
        baseDecorator.decorate();
        newMethod();
    }

    private void newMethod(){
        System.out.println("New method from " + DecoratorImplementation1.class);
    }
}
