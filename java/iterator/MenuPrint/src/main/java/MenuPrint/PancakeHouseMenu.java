package MenuPrint;

import java.util.ArrayList;

public class PancakeHouseMenu {
  ArrayList<MenuItem> menuItems;

  public PancakeHouseMenu() {
    menuItems = new ArrayList<MenuItem>();

    addItem("pancake breakfast", "pancake with egg and toast", 2.99);
    addItem("regular pancake breakfast", "pancake with egg , sausages and toast", 3.99);
    addItem("blueberry pancake breakfast", "pancake with egg and blueberry toast", 3.49);
  }

  public void addItem(String name, String description, double price) {
    var item = new MenuItem(name, description, price);
    menuItems.add(item);
  }

  public ArrayList<MenuItem> getMenuItems() {
    return menuItems;
  }

  public PancakeHouseMenuIterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
}
