package Prototype;

public class Main {
    public static void main(String[] args) {
        PrototypeImpl prototype = new PrototypeImpl(5);
        Prototype prototypeClone = prototype.clone();

        System.out.println(prototypeClone.getProperty());
    }
}
