package Strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(String data){
        strategy.execute(data);
    }
}
