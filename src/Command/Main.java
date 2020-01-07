package Command;

public class Main {
    public static void main(String[] args) {
        Executor executor = new Executor();
        executor.executeCommands(new FirstCommand());
        executor.executeCommands(new SecondCommand());

        System.out.println(executor.getCommands());
    }
}
