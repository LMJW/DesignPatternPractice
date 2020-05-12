package orderSystem;

public class Customer {
  public Order makeOrder(Cook cook) {
    /** Customer creates a new hamburger order */
    return new HamburgerOrder(cook);
  }
}
