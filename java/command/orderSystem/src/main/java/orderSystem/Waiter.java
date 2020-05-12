package orderSystem;

public class Waiter {
  Order order;

  public void takeOrder(Order order) {
    this.order = order;
    this.order.orderUp();
  }
}
