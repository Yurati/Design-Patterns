package AbstractFactory;

public class FirstFactory implements AbstractFactory {
    @Override
    public FirstType getType(String type) {
        if (type.equals("1")) {
            return new FirstImpl();
        } else return SecondImpl::new;
    }

}
