package AbstractFactory;

import AbstractFactory.Pizza.Pizza;
import AbstractFactory.Pizza.PizzaWithHam;
import AbstractFactory.Salad.Salad;
import AbstractFactory.Salad.SaladWithMeat;

public class MeatFactory extends AbstractFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaWithHam();
    }

    @Override
    public Salad createSalad() {
        return new SaladWithMeat();
    }
}
