package AbstractFactory;

public class SecondImpl implements FirstType {
    @Override
    public FirstType create() {
        return new SecondImpl();
    }
}
