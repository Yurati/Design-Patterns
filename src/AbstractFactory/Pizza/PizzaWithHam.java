package AbstractFactory.Pizza;

public class PizzaWithHam implements Pizza {
    @Override
    public void execute() {
        System.out.println(PizzaWithHam.class);
    }
}
