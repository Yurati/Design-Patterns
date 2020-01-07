package Flyweight;

import java.util.ArrayList;
import java.util.Optional;

public class FlyweightFactory {
    private ArrayList<Flyweight> cachedFlyweights;

    FlyweightFactory(){
        cachedFlyweights = new ArrayList<>();
    }
    public Flyweight getFlyweight(State state){
        Optional<Flyweight> cachedFlyweight = cachedFlyweights
                .stream()
                .filter(flyweight -> flyweight.getState().equals(state))
                .findFirst();

        if (cachedFlyweight.isPresent()){
            return cachedFlyweight.get();
        } else {
            Flyweight flyweight = new Flyweight(state);
            cachedFlyweights.add(flyweight);
            return  flyweight;
        }
    }

    public int getQuantityOfCached(){
        return cachedFlyweights.size();
    }
}
