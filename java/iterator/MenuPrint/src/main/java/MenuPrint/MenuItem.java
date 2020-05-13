package MenuPrint;

public class MenuItem {
  String name;
  String description;
  double price;

  public MenuItem(String name, String description, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }

  /** @return the description */
  public String getDescription() {
    return description;
  }

  /** @return the name */
  public String getName() {
    return name;
  }

  /** @return the price */
  public double getPrice() {
    return price;
  }
}
