package Decorator;

public class DecoratorImpl1 implements Component {

    private String string;
    DecoratorImpl1(String s) {
        this.string = s;
    }

    @Override
    public void decorate() {
        System.out.println(string);
    }
}
