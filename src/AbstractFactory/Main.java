package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory meatFactory = new MeatFactory();
        Client client = new Client(meatFactory);

        System.out.println("Order salad: " + client.getSalad());
        System.out.println("Order pizza: " + client.getPizza());

        AbstractFactory saladFactory = new VegetarianFactory();
        Client newClient = new Client(saladFactory);

        System.out.println("Order salad: " + newClient.getSalad());
        System.out.println("Order pizza: " + newClient.getPizza());


    }
}
