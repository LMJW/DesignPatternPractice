package MenuPrint;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu extends MenuComponent implements Menu {
  ArrayList<MenuComponent> menuItems;

  public PancakeHouseMenu() {
    menuItems = new ArrayList<MenuComponent>();

    addItem("pancake breakfast", "pancake with egg and toast", 2.99);
    addItem("regular pancake breakfast", "pancake with egg , sausages and toast", 3.99);
    addItem("blueberry pancake breakfast", "pancake with egg and blueberry toast", 3.49);
  }

  public void addItem(String name, String description, double price) {
    var item = new MenuItem(name, description, price);
    menuItems.add(item);
  }

  public ArrayList<MenuComponent> getMenuItems() {
    return menuItems;
  }

  public Iterator<MenuComponent> createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }

  @Override
  public String getDescription() {
    return "This is pancake house menu";
  }

  @Override
  public String getName() {
    return "Pancake house menu";
  }
}
