package AbstractFactory;

public class SecondFactory implements AbstractFactory {

    @Override
    public FirstType getType(String type) {
        if (type.equals("1")){
            return new ThirdImpl();
        }
        return null;
    }
}
