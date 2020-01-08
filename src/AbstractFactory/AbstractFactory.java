package AbstractFactory;

import AbstractFactory.Pizza.Pizza;
import AbstractFactory.Salad.Salad;

abstract public class AbstractFactory {
    public abstract Pizza createPizza();
    public abstract Salad createSalad();
}
