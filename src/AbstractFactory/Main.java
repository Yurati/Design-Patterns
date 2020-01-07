package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.createFactory("1");

        System.out.println(abstractFactory.getType("1").create().getClass());

    }
}
