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

  public static ChocolateBoiler getInstance() {
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
