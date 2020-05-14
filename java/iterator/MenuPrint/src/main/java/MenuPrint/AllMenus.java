package MenuPrint;

import java.util.ArrayList;
import java.util.Iterator;

public class AllMenus extends MenuComponent implements Menu {
  ArrayList<MenuComponent> menuComponents;
  String name;
  String description;

  public AllMenus(String name, String description) {
    this.name = name;
    this.description = description;
    menuComponents = new ArrayList<>();
  }

  public void add(MenuComponent menuComponent) {
    this.menuComponents.add(menuComponent);
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Iterator<MenuComponent> createIterator() {
    return menuComponents.iterator();
  }
}
