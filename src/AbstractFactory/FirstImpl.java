package AbstractFactory;

public class FirstImpl implements FirstType {
    @Override
    public FirstType create() {
        return new FirstImpl();
    }
}
