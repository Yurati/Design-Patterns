package ChainOfResponsibility;

public class HandlerTwo implements ChainOfResponsibilityHandler{
    private ChainOfResponsibilityHandler chainOfResponsibilityHandler;

    @Override
    public void setNext(ChainOfResponsibilityHandler chainOfResponsibilityHandler) {
        this.chainOfResponsibilityHandler = chainOfResponsibilityHandler;
    }

    @Override
    public void handle(Request request) {
        if (!request.getProperty())
            System.out.println("Handler Two");
        else {
            chainOfResponsibilityHandler.handle(request);
        }
    }
}
