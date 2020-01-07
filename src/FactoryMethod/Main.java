package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        BaseInterface obj1 = BaseFactory.createObject("1");
        BaseInterface obj2 = BaseFactory.createObject("2");
        System.out.println(obj1.getProperty());
        System.out.println(obj2.getProperty());
    }
}
