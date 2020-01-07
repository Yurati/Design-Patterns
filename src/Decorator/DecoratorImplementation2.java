package Decorator;

public class DecoratorImplementation2 extends Decorator {
    DecoratorImplementation2(Component baseDecorator){
        super(baseDecorator);
    }

    @Override
    public void decorate() {
        baseDecorator.decorate();
        newMethod();
    }

    public void newMethod(){
        System.out.println("New method from " + DecoratorImplementation2.class);
    }
}
