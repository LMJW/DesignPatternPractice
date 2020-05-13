package HomeTheater;

public class CDPlayer {
  Amplifier amplifier;

  public void on() {
    System.out.println("CD player is on");
  }

  public void off() {
    System.out.println("CD player is off");
  }

  public void pause() {
    System.out.println("Pause the current playing CD");
  }

  public void play() {
    System.out.println("Play the CD");
  }

  public void stop() {
    System.out.println("Stop the CD player");
  }
}
