package Prototype;

public class PrototypeImpl implements Prototype {
    private int field;

    public PrototypeImpl(int field){
        this.field = field;
    }

    public PrototypeImpl(PrototypeImpl prototype) {
        field = prototype.field;
    }

    @Override
    public Prototype clone() {
        return new PrototypeImpl(this);
    }

    @Override
    public int getProperty() {
        return getField();
    }

    private int getField(){
        return field;
    }
}
