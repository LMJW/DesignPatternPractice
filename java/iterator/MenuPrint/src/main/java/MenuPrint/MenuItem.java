package MenuPrint;

import java.util.Iterator;

public class MenuItem extends MenuComponent implements Menu {
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

  public void print() {
    System.out.println(name + " | " + description + " ; " + price);
  }

  @Override
  public Iterator<MenuComponent> createIterator() {
    return new NullIterator();
  }
}
