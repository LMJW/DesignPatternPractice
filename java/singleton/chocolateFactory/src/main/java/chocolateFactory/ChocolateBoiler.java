package chocolateFactory;
/**
 * The current singleton pattern implementation did not take into account of the
 * multi-threading environment. To enable the current pattern to work for the
 * multi-threading environment, there are several ways to do this
 */
public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler boiler;

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  /**
   * The first method is to use the `synchronized` keyword. This keyword will
   * force every thread to wait its turn before it can enter the method. But,
   * you need to keep in mind that the `synchronized` method can decrease
   * performance by a factor of `100`(rule of thumb). 
   *
   * @Note: the 100 times slower is taken from a old java book, which might not
   * true now. 
   */

  public static synchronized ChocolateBoiler getInstance() {
    if (boiler == null) {
      boiler = new ChocolateBoiler();
    }
    return boiler;
  }

  public void fill() {
    if (empty) {
      empty = false;
    }
  }

  public void drain() {
    if (!empty) {
      empty = true;
    }
  }

  public void boil() {
    if (!boiled) {
      boiled = true;
    }
  }
}
