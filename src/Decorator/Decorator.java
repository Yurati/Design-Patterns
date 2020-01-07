package Decorator;

abstract class Decorator implements Component {
    protected Component baseDecorator;

    Decorator(Component baseDecorator){
        this.baseDecorator = baseDecorator;
    }

    @Override
    public void decorate() {
        System.out.println("Base Decorator");
    }
}
