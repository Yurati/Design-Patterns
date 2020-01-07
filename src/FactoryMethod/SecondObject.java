package FactoryMethod;

public class SecondObject implements BaseInterface {
    private String property = "Second property";

    @Override
    public String getProperty() {
        return property;
    }
}
