package remoteControl;

public class NoCommand implements Command {
  public void execute() {
    /** Empty implementation. Use this to avoid using if else condition in checking the commands */
    System.out.println("This is a no command.");
  }

  public void undo() {}
}
