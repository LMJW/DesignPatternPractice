package remoteControl;

public class MacroCommand implements Command {
  Command[] commands;

  public MacroCommand(Command... commands) {
    this.commands = commands;
  }

  public void execute() {
    for (Command cmd : commands) {
      cmd.execute();
    }
  }

  public void undo() {
    for (Command cmd : commands) {
      cmd.undo();
    }
  }
}
