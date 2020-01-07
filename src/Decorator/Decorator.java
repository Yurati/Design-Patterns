package Decorator;

abstract class Decorator implements Component {
    protected Component component;

    Decorator(Component component){
        this.component = component;
    }

    @Override
    public void decorate() {
        System.out.println("Default");
    }
}
