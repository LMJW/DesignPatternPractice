package withPattern;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {}

  public abstract void display();

  public void performFly() {
    System.out.println(flyBehavior.fly());
  }

  public void performQuack() {
    System.out.println(quackBehavior.quack());
  }

  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }
}
