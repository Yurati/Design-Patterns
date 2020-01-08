package AbstractFactory.Salad;

public class SaladWithMeat implements Salad {
    @Override
    public void execute() {
        System.out.println(SaladWithVegies.class);
    }
}
