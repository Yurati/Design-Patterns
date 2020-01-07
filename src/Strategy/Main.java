package Strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new OneStrategy());
        context.execute("Data");

        context.setStrategy(new SecondStrategy());
        context.execute("Dasa");
    }
}
