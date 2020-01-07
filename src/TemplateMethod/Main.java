package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        BaseImpl base = new BaseImpl();
        base.performOperation();

        AnotherImpl another = new AnotherImpl();

        another.performOperation();
    }
}
