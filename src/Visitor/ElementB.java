package Visitor;

public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Accepting Visitor in B");
        visitor.visit(this);
    }
}
