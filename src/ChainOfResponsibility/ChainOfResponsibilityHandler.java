package ChainOfResponsibility;

interface ChainOfResponsibilityHandler {

    void setNext(ChainOfResponsibilityHandler chainOfResponsibilityHandler);
    void handle(Request request);
}
