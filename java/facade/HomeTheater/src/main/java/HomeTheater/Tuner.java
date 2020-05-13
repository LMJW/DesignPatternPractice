package HomeTheater;

public class Tuner {
  Amplifier amplifier;

  public void on() {
    System.out.println("Tuner is on");
  }

  public void off() {
    System.out.println("Tuner is off");
  }

  public void setAm() {
    System.out.println("Tuner is set to AM frequency");
  }

  public void setFM() {
    System.out.println("Tuner is set to FM frequency");
  }

  public void setFrequency() {
    System.out.println("Setting frequency of tuner");
  }
}
