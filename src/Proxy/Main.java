package Proxy;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Proxy proxy = new Proxy(service);

        proxy.operation();
    }
}
