package withPattern;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  public void display() {
    System.out.println("this is a model duck");
  }
}
