package AbstractFactory;

import AbstractFactory.Pizza.Pizza;
import AbstractFactory.Salad.Salad;

public class Client {
    private AbstractFactory abstractFactory;

    public Client(AbstractFactory abstractFactory){
        this.abstractFactory = abstractFactory;
    }

    public Salad getSalad(){
        return abstractFactory.createSalad();
    }

    public Pizza getPizza(){
        return abstractFactory.createPizza();
    }
}
