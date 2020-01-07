package Command;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    private ArrayList<Command> commands;

    Executor(){
        commands = new ArrayList<Command>();
    }

    public void executeCommands(Command command){
        commands.add(command);
        command.execute();
    }

    public List<Command> getCommands(){
        return commands;
    }
}
