package DuckAdapter;

public class TurkeyAdapter implements Turkey {
  Duck duck;

  public TurkeyAdapter(Duck d) {
    duck = d;
  }

  public void gobble() {
    duck.quark();
  }

  public void fly() {
    duck.fly();
  }
}
