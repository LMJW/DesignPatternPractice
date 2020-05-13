package HomeTheater;

public class Amplifier {
  Tuner tuner;
  DVDPlayer dvd;
  CDPlayer cd;

  public void on() {
    System.out.println("Amplifier is on");
  }

  public void off() {
    System.out.println("Amplifier is off");
  }

  public void setCd() {
    System.out.println("Set amplifier for cd");
  }

  public void setDvd() {
    System.out.println("Set Amplifier for");
  }

  public void setStereoSound() {
    System.out.println("Set Amplifier for stereo sound");
  }

  public void setTuner() {
    System.out.println("Set Amplifier for tunner");
  }

  public void setVolume() {
    System.out.println("Set Amplifier volume down ");
  }
}
