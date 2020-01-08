package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        BaseFactory firstObjectFactory = new FirstObjectFactory();
        CommonInterface firstObject = firstObjectFactory.create();
        firstObject.execute();

        BaseFactory secondObjectFactory = new SecondObjectFactory();
        CommonInterface secondObject = secondObjectFactory.create();
        secondObject.execute();
    }
}
