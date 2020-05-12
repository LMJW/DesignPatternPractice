package remoteControl;

public class RemoteControl {
  Command[] onCommands;
  Command[] offCommands;
  Command lastCommand;

  /**
   * Default buttons of remote controller is 7
   */
  public RemoteControl(){
    onCommands = new Command[7];
    offCommands = new Command[7];

    for (int i = 0; i < 7; i++){
      onCommands[i] = new NoCommand();
      offCommands[i] = new NoCommand();
    }
    lastCommand = new NoCommand();
  }

  public void setCommand(int idx, boolean onOff, Command cmd) {
    if (idx > -1 && onCommands.length > idx){
      if (onOff){
        onCommands[idx] = cmd;
      }else{
        offCommands[idx] = cmd;
      }
    }
  }

  public void buttonPress(int idx, boolean onOff) {
    if (idx > -1 && onCommands.length > idx){
      if(onOff){
        onCommands[idx].execute();
        lastCommand = onCommands[idx];
      }else{
        offCommands[idx].execute();
        lastCommand = offCommands[idx];
      }
    }
  }

  public void undo(){
    lastCommand.undo();
  }

  public String toString(){
    var buf = new StringBuffer();
    buf.append("\n----remote control----\n");
    for(int i = 0; i < onCommands.length; i++){
      buf.append(onCommands[i].getClass().getName()+" | "+offCommands[i].getClass().getName()+"\n");
    }
    return buf.toString();
  }
}
