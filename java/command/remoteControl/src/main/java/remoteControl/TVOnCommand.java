package remoteControl;

public class TVOnCommand implements Command {
  TV tv;

  public void execute() {
    tv.on();
  }

  public void undo(){
    tv.off();
  }
}
