package chocolateFactory;

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
