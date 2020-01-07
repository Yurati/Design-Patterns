package FactoryMethod;

public class OneObject implements BaseInterface {
    private String property = "Property 1";
    @Override
    public String getProperty() {
        return property;
    }
}
