package AbstractFactory.Salad;

public class SaladWithVegies implements Salad {
    @Override
    public void execute() {
        System.out.println(SaladWithVegies.class);
    }
}
