package FactoryMethod;

public class OneObject implements CommonInterface {

    @Override
    public void execute() {
        System.out.println(OneObject.class);
    }
}
