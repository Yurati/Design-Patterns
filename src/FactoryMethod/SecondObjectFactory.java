package FactoryMethod;

public class SecondObjectFactory extends BaseFactory {

    @Override
    CommonInterface create() {
        return new SecondObject();
    }
}
