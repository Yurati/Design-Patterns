package ChainOfResponsibility;

public class HandlerOne implements ChainOfResponsibilityHandler{
    private ChainOfResponsibilityHandler chainOfResponsibilityHandler;

    @Override
    public void handle(Request request){
        if (request.getProperty())
            System.out.println("Handler One");
        else {
            chainOfResponsibilityHandler.handle(request);
        }
    }

    @Override
    public void setNext(ChainOfResponsibilityHandler chainOfResponsibilityHandler){
        this.chainOfResponsibilityHandler = chainOfResponsibilityHandler;
    }
}
