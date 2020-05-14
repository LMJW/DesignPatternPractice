package MenuPrint;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu extends MenuComponent implements Menu {
  Hashtable<String, MenuComponent> menuItems;

  public CafeMenu() {
    menuItems = new Hashtable<>();

    addItem("Veggie burger", "Veggie burger on a whole wheat bun", 3.99);
    addItem("Burrito", "A large burrito with beans salsa", 4.39);
  }

  @Override
  public void add(MenuComponent menuComponent) throws UnsupportedOperationException {
    menuItems.put(menuComponent.getName(), menuComponent);
  }

  public void addItem(String name, String description, double price) {
    var item = new MenuItem(name, description, price);
    menuItems.put(item.getName(), item);
  }

  public Iterator<MenuComponent> createIterator() {
    return menuItems.values().iterator();
  }

  @Override
  public String getName() {
    return "Cafe menu";
  }

  @Override
  public String getDescription() {
    return "This is Cafe menu";
  }
}
