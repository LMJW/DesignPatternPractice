package HomeTheater;

public class HomeTheaterFacade {
  Amplifier amp;
  Tuner tuner;
  DVDPlayer dvd;
  CDPlayer cd;
  Projector projector;
  Screen screen;
  PopcornPopper popper;

  public HomeTheaterFacade(
      Amplifier amplifier,
      Tuner tuner,
      DVDPlayer dvdPlayer,
      CDPlayer cdPlayer,
      Projector projector,
      Screen screen,
      PopcornPopper popcornPopper) {
    this.amp = amplifier;
    this.tuner = tuner;
    this.cd = cdPlayer;
    this.dvd = dvdPlayer;
    this.projector = projector;
    this.screen = screen;
    this.popper = popcornPopper;
  }

  public void watchMovie() {
    System.out.println("Get ready to watch movie");
    popper.on();
    popper.pop();
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDvd();
    dvd.on();
    dvd.play();
  }

  public void endMovie() {
    System.out.println("Shutting down the home theater system");
    popper.off();
    screen.up();
    projector.off();
    amp.off();
    dvd.stop();
    dvd.off();
  }

  public void listenToCD() {
    amp.on();
    amp.setCd();
    amp.setStereoSound();
    cd.on();
    cd.play();
  }

  public void endCD() {
    cd.stop();
    cd.off();
    amp.off();
  }

  public void listenToRadio() {
    amp.on();
    amp.setTuner();
    tuner.on();
    tuner.setAm();
    tuner.setFrequency();
  }

  public void endRadio() {
    tuner.off();
    amp.off();
  }
}
