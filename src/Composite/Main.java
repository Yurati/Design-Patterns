package Composite;

public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite();

        composite.add(new Leaf(1));
        composite.add(new Leaf(3));

        Composite newComposite = new Composite();
        newComposite.add(new Leaf(100));
        newComposite.add(new Leaf(101));

        composite.add(newComposite);
        composite.execute();
    }
}
