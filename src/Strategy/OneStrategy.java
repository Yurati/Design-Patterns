package Strategy;

public class OneStrategy implements Strategy {
    @Override
    public void execute(String data) {
        System.out.println("First Strategy");
    }
}
