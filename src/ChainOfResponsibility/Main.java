package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        HandlerOne handlerOne = new HandlerOne();
        HandlerTwo handlerTwo = new HandlerTwo();

        handlerOne.setNext(handlerTwo);
        handlerTwo.setNext(handlerOne);

        Request requestTrue = new Request(true);
        Request requestFalse = new Request(false);

        handlerOne.handle(requestTrue);
        handlerOne.handle(requestFalse);

    }
}
