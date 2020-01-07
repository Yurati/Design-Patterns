package Observer;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> subscribers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    public void removeObserver(Observer observer){
        subscribers.remove(observer);
    }

    public void notifySubscribes(){
        subscribers.forEach(sub -> sub.update());
    }
}
