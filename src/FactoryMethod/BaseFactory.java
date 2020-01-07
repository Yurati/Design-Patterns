package FactoryMethod;

public class BaseFactory {

    public static BaseInterface createObject(String name){
        if (name.equals("1")){
            return new OneObject();
        }
        else if (name.equals("2")){
            return new SecondObject();
        }
        else return null;
    }
}
