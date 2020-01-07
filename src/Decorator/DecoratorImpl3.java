package Decorator;

public class DecoratorImpl3 extends Decorator {
    private Component dec2;

    DecoratorImpl3(Component decoratorImpl1, Component dec2){
        super(decoratorImpl1);
        this.dec2 = dec2;
    }

    @Override
    public void decorate() {
        component.decorate();
        dec2.decorate();
    }

    public void newMethod(){
        System.out.println("New method");
    }
}
