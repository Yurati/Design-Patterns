package Proxy;

public class Proxy implements ServiceInterface {
    private Service service;

    Proxy(Service service){
        this.service = service;
    }

    @Override
    public void operation() {
        System.out.println("Calling service operation from proxy");
        service.operation();
        System.out.println("Ended service operation from proxy");
    }
}
