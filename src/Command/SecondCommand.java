package Command;

public class SecondCommand implements Command {
    private String param1 = "Aaaaa";
    private int a = 2;
    @Override
    public void execute() {
        System.out.println("Second command " + param1 + a);
    }
}
