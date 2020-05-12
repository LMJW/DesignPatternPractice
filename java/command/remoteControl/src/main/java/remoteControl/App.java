/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package remoteControl;

public class App {
  public String getGreeting() {
    return "Hello Remote control.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    var remote = new RemoteControl();
    var light = new Light();
    var lightOn = new LightOnCommand(light);
    remote.setCommand(0, true, lightOn);

    remote.buttonPress(0, true);

    var door = new GarageDoor();
    var doorOpen = new GarageDoorOpenCommand(door);

    remote.setCommand(1, true, doorOpen);
    remote.buttonPress(1, true);
    remote.undo();
    remote.undo();

    var macro = new MacroCommand(lightOn, doorOpen);
    remote.setCommand(2, true, macro);
    remote.buttonPress(2, true);
    remote.undo();
    System.out.println(remote);
  }
}
