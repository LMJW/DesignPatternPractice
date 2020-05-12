package remoteControl;

public class GarageDoorOpenCommand implements Command {
  GarageDoor garagedoor;

  public GarageDoorOpenCommand(GarageDoor door) {
    garagedoor = door;
  }

  public void execute() {
    garagedoor.open();
  }

  public void undo(){
    garagedoor.close();
  }
}
