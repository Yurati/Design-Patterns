package AbstractFactory.Pizza;

public class PizzaWithCheese implements Pizza {
    @Override
    public void execute() {
        System.out.println(PizzaWithCheese.class);
    }
}
