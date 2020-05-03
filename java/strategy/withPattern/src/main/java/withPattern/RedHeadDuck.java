package withPattern;

public class RedHeadDuck extends Duck {
  public RedHeadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Squeak();
  }

  public void display() {
    System.out.println("I am a real RedHeadDuck");
  }
}
