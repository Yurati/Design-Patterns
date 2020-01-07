package Command;

public class FirstCommand implements Command {
    @Override
    public void execute() {
        System.out.println("First command");
    }
}
