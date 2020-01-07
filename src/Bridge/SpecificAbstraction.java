package Bridge;

public class SpecificAbstraction extends Abstraction {

    SpecificAbstraction(Implementation implementation){
        super(implementation);
    }

    @Override
    public void operation() {
        System.out.println("Do something!");
        implementation.impl();
    }
}
