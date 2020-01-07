package Visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("Visiting A");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("Visiting B");
    }
}
