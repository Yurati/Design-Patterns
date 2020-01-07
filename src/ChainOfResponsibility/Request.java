package ChainOfResponsibility;

public class Request {
    private boolean handlerOne;

    Request(boolean handlerOne){
        this.handlerOne = handlerOne;
    }

    public boolean getProperty(){
        return handlerOne;
    }
}
