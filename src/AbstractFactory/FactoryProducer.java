package AbstractFactory;

public class FactoryProducer {

    public static AbstractFactory createFactory(String whaaaat){
        if (whaaaat.equals("1")) return new FirstFactory();
        else return new SecondFactory();
    }
}
