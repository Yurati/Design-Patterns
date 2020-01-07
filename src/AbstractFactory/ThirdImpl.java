package AbstractFactory;

public class ThirdImpl implements FirstType {
    @Override
    public FirstType create() {
        return new ThirdImpl();
    }
}
