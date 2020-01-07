package Visitor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();
        VisitorImpl visitor = new VisitorImpl();

        ArrayList<Element> elementArrayList = new ArrayList<Element>();
        elementArrayList.add(elementA);
        elementArrayList.add(elementB);

        elementArrayList.forEach(element -> element.accept(visitor));
    }
}
