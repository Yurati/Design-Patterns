package Composite;

import java.util.ArrayList;

public class Composite implements Component {
    private ArrayList<Component> components;

    Composite(){
        components = new ArrayList<Component>();
    }
    public void add(Component component){
        components.add(component);
    }

    public void remove(Component component){
        components.remove(component);
    }

    public ArrayList<Component> getChildren(){
        return components;
    }

    @Override
    public void execute() {
        components.forEach(component -> component.execute());
    }
}
