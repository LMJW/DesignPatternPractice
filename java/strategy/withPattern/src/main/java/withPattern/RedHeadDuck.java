package withPattern;

public class RedHeadDuck extends Duck {
  /*
  public RedHeadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Squeak();
  }
  */
  /// RedHeadDuck failed due to calling uninitialized object

  public void display() {
    System.out.println("I am a real RedHeadDuck");
  }
}
