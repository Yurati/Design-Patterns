package AbstractFactory;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Pizza.Pizza;
import AbstractFactory.Pizza.PizzaWithCheese;
import AbstractFactory.Salad.Salad;
import AbstractFactory.Salad.SaladWithVegies;

public class VegetarianFactory extends AbstractFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaWithCheese();
    }

    @Override
    public Salad createSalad() {
        return new SaladWithVegies();
    }
}
