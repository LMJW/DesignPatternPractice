package MenuPrint;

import java.util.Iterator;

public class DinerMenu implements Menu {
  static final int MAX_ITEMS = 6;
  int itemsCount = 0;
  MenuItem[] menuItems;

  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];

    addItem("Soup of the day", "Bacon with lettuce", 2.99);
    addItem("Hotdog", "bread with sausage", 1.99);
  }

  public void addItem(String name, String description, double price) throws RuntimeException {
    var item = new MenuItem(name, description, price);
    if (itemsCount >= MAX_ITEMS) {
      throw new RuntimeException("Menu full");
    } else {
      menuItems[itemsCount] = item;
      itemsCount = itemsCount + 1;
    }
  }

  public MenuItem[] getMenuItems() {
    return menuItems;
  }

  public Iterator<MenuItem> createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}
