package FactoryMethod;

public class SecondObject implements CommonInterface {
    @Override
    public void execute() {
        System.out.println(SecondObject.class);
    }
}
