package orderSystem;

public class HamburgerOrder implements Order {
  Cook cook;

  public HamburgerOrder(Cook cook) {
    this.cook = cook;
  }

  public void orderUp() {
    this.cook.cook();
  }
}
