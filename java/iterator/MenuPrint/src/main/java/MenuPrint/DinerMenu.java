package MenuPrint;

import java.util.Iterator;

public class DinerMenu extends MenuComponent {
  static final int MAX_ITEMS = 6;
  int itemsCount = 0;
  MenuComponent[] mComponents;

  public DinerMenu() {
    mComponents = new MenuComponent[MAX_ITEMS];

    addItem("Soup of the day", "Bacon with lettuce", 2.99);
    addItem("Hotdog", "bread with sausage", 1.99);
  }

  public void addItem(String name, String description, double price) throws RuntimeException {
    var item = new MenuItem(name, description, price);
    if (itemsCount >= MAX_ITEMS) {
      throw new RuntimeException("Menu full");
    } else {
      mComponents[itemsCount] = item;
      itemsCount = itemsCount + 1;
    }
  }

  public MenuComponent[] getMenuItems() {
    return mComponents;
  }

  public Iterator<MenuComponent> createIterator() {
    return new DinerMenuIterator(mComponents);
  }

  public String getName() {
    return "Diner menu";
  }

  @Override
  public String getDescription() {
    return "This is the diner menu";
  }
}
