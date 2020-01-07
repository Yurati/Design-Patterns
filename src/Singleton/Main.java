package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(second);
    }
}
