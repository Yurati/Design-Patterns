package Visitor;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Accepting Visitor in A");
        visitor.visit(this);
    }
}
