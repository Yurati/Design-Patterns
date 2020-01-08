package FactoryMethod;

public class FirstObjectFactory extends BaseFactory {
    @Override
    CommonInterface create() {
        return new OneObject();
    }
}
